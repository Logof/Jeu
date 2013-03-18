package com.bm.jeu.net;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;

import com.bm.jeu.Player;

public class RemoteHandler {
	private Player player; // The player who is playing, so we can modify them with commands.

	/**
	 * This class handles all communications (to and from the server.)
	 */

	private int PORT;
	private int MAXIMUM_CONNECTIONS;
	private String HOST;
	private boolean CONNECTED = false;

	/**
	 * If these variables don't initialise properly in later methods,
	 * then NullPointerExceptions WILL occur!
	 * 
	 * But their main purpose is to establish a connection to the server,
	 * and then to send and receive data to/from it...
	 */

	private Socket connectionToServer = null; // Our connection to the server
	private PrintWriter outToServer = null; // The stream (handler) we use to write data to the server.
	private BufferedReader inFromServer = null; // The stream we use to receive data from the server.

	public RemoteHandler() {
		/**
		 * Define the player who is playing the game, so then we can modify their properties with
		 * different commands:
		 */
		
		CONNECTED = false;
	}
	
	public boolean attachPlayer(Player player) {
		this.player = player;
		return true;
	}

	/*
	 * The next three classes allow other methods to get the set host, port and maximum
	 * number of connections, and don't actually communicate with the server.
	 */

	/***
	 * Returns the port we're using to connect to a server as an integer.
	 * @return The port that the client uses to attempt to connect to a server.
	 */

	public int getRemotePort() {
		return PORT;
	}

	/***
	 * Returns the maximum connections that the server has told us it can handle
	 * as an integer.
	 * @return The maximum number of connections the server will hold.
	 */

	public int getMaximumConnections() {
		return MAXIMUM_CONNECTIONS;
	}

	/***
	 * Returns the remote host we're trying to connect to as a string.
	 * @return The remote host that the client is attempting to connect to.
	 */

	public String getRemoteHost() {
		return HOST;
	}
	
	public boolean isConnected() {
		return CONNECTED;
	}

	public String processInputMessage(String message) {
		/**
		 * Firstly: check to see if the message was a command: 
		 */

		if(message.charAt(0) == '/') {
			System.out.println("Client has issued a command!");

			/*
			 * Handle any arguments provided, splitting into strings
			 * at spaces - all added into an array.
			 * 
			 * For example:
			 * 
			 * arguments[0] = /command
			 * arguments[1] = first argument
			 * 
			 * etc, etc.
			 */

			String arguments[] = message.split(" "); // Split into separate strings. Each string is an argument.

			// Cycle through commands we know about:
			switch(arguments[0]) {
			case "/connect":
				return connectToServer(4313,arguments[1],player.getName(),Integer.toString(player.getX()),Integer.toString(player.getY()));
			case "/name":
				player.setName(arguments[1]);
				break;
			case "/list":
				return listPlayerNames();
			}
		} else {
			postMessageToServer(message);
		}
		return "NULL";
	}

	public String connectToServer(int port, String host, String username, String x, String y)
	{
		PORT = port;
		HOST = host;

		/**
		 *  Trying to establish a connection to the server
		 *  in the try/catch block below.
		 */
		try
		{
			connectionToServer = new Socket(HOST,PORT); // Attempt to establish a connection to the server...

			/* Establish streams to communicate with the server */

			outToServer = new PrintWriter(connectionToServer.getOutputStream(), true); // Attempt to get a stream out to the server, that we can write data to!
			inFromServer = new BufferedReader(new InputStreamReader(connectionToServer.getInputStream())); // Attempt to get a stream in from the server, that we can read data from!

			String connectionResponse = inFromServer.readLine();
			String connectionResponseProcessed[] = connectionResponse.split(" ");

			if(connectionResponseProcessed[0].equals("MAXCONNECTIONS")) {
				MAXIMUM_CONNECTIONS = Integer.parseInt(connectionResponseProcessed[1]);
				System.out.println("Maximum supported connections by server: " + MAXIMUM_CONNECTIONS);
			} else {
				System.out.println("Server didn't report the maximum number of connections it supports - this could be a problem!");
			}
			
			CONNECTED = true;
			
			try 
			{
				outToServer.println("LOGIN " + username + " " + x + " " + y); // Write data out to server
				String replyFromServer = inFromServer.readLine();
				if(replyFromServer.equals("LOGINSUCCESS")) { // And receive the server's reply.)
					System.out.println("Logged in successfully!");
					return "CONNECTEDTO " + HOST;
				} else {
					System.out.println(replyFromServer);
				}
			}
			/**
			 * Thrown if we couldn't read out to the server, or in from it for some reason...
			 */
			catch (IOException dataStreamException) 
			{
				// TODO Auto-generated catch block
				System.out.println("There was a problem exchanging data to/from the server!");
				dataStreamException.printStackTrace();
				return "ERROR";
			}
			
			return "CONNECTEDTO " + HOST;
		}
		// This exception is thrown if we can't find the host to start with.
		// Possibly caused by an invalid domain/IP.
		catch(UnknownHostException hostException)
		{
			System.out.println("Failed to find host.");
			hostException.printStackTrace();
		}
		// This exception is thrown if we get to the host, but can't reach
		// the server afterwards. Perhaps because of a firewall, or the fact
		// that the server might not be running anyway.
		catch(IOException ioException)
		{
			System.out.println("Failed to read from server...");
			System.out.println("This means that the host could be reached, but an error occured when we got there!");
			System.out.println("Perhaps the server isn't running, or is behind a firewall?");
			ioException.printStackTrace();
		}
		return "NOCONNECTION";
	}

	public int getActiveConnections() {
		/// Get the number of players CURRENTLY connected to the server:
		int activeConnections;
		outToServer.println("SENDACTIVECONNECTIONS");

		try {
			activeConnections = Integer.parseInt(inFromServer.readLine());
			System.out.println("Active connections on server: " + activeConnections);
			return activeConnections;
		} catch (NumberFormatException | IOException e1) {
			e1.printStackTrace();
			return -1;
		}
	}

	public String[][] getConnectedPlayers() {
		String playerNamesList = "";
		String playerXCoords = "";
		String playerYCoords = "";
		int ACTIVE_CONNECTIONS = 0;
		
		ACTIVE_CONNECTIONS = getActiveConnections();

		// Now ask about their details:
		outToServer.println("FETCHPLAYERS");
		String totalPlayerArray[][] = new String[(ACTIVE_CONNECTIONS +1)][5];

		try {
			playerNamesList = inFromServer.readLine();
			String[] unprocessedPlayerNames = playerNamesList.split(",");
			System.out.println("Unprocessed Player Names Length: " + unprocessedPlayerNames.length);
			int processed = 0;

			while(processed < unprocessedPlayerNames.length) {
				totalPlayerArray[processed][0] = unprocessedPlayerNames[processed];
				processed++;
			}
			
			playerXCoords = inFromServer.readLine();
			String[] unprocessedXCoords = playerXCoords.split(",");
			System.out.println("Unprocessed Player X Coords Length: " + unprocessedXCoords.length);
			processed = 0;
			
			char[] playerXCoordsCharArray = unprocessedXCoords[0].toCharArray();
			if(playerXCoordsCharArray[0] == ',') {
				playerXCoordsCharArray[0] = ' ';
			}
			
			unprocessedXCoords[0] = String.valueOf(playerXCoordsCharArray);

			while(processed < unprocessedXCoords.length) {
				totalPlayerArray[processed][1] = unprocessedXCoords[processed];
				processed++;
			}
			
			playerYCoords = inFromServer.readLine();
			String[] unprocessedYCoords = playerYCoords.split(",");
			System.out.println("Unprocessed Player Y Coords Length: " + unprocessedYCoords.length);
			processed = 0;
			
			char[] playerYCoordsCharArray = unprocessedYCoords[0].toCharArray();
			if(playerYCoordsCharArray[0] == ',') {
				playerYCoordsCharArray[0] = ' ';
			}
			
			unprocessedYCoords[0] = String.valueOf(playerYCoordsCharArray);

			while(processed < unprocessedYCoords.length) {
				totalPlayerArray[processed][2] = unprocessedXCoords[processed];
				processed++;
			}
			
			return totalPlayerArray;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public String listPlayerNames() {
		String[][] playerArray = getConnectedPlayers();
		String playerNames = "";
		int processed = 0;

		while(processed < playerArray.length) {
			playerNames = playerNames + "," + playerArray[processed][0];
			processed++;
		}

		return "PLAYERS " + playerNames;
	}
	
	public void updatePlayerPosition(int x, int y) {
		String txtPosX = Integer.toString(x);
		String txtPosY = Integer.toString(y);
		outToServer.println("UPDATEPOSITION " + txtPosX + " " + txtPosY);
	}
	
	public void postMessageToServer(String message)
	{
		// Attempt to write out to the server
		// And receive the server's response.
		try 
		{
			outToServer.println(message); // Write data out to server
			System.out.println("Received from server: " + inFromServer.readLine()); // And receive the server's reply.
		}
		/**
		 * Thrown if we couldn't read out to the server, or in from it for some reason...
		 */
		catch (IOException dataStreamException) 
		{
			// TODO Auto-generated catch block
			System.out.println("There was a problem exchanging data to/from the server!");
			dataStreamException.printStackTrace();
		}
	}
}