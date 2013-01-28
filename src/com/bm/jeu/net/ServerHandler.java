package com.bm.jeu.net;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;

public class ServerHandler {
	// Define streams
	DataOutputStream outToServer = null;
	BufferedReader inFromServer = null;

	// Socket we use to connect to the server
	Socket clientSocket = new Socket();

	public void establishConnection(int port, String host)
	{
		try 
		{
			clientSocket = new Socket(host, port);
			System.out.println("Attempting to connect to host: '" + host + "' on port: '" + port + "'...");
		}
		catch (UnknownHostException e2) 
		{
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		catch (IOException e2) 
		{
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

		try 
		{
			outToServer = new DataOutputStream(clientSocket.getOutputStream());
			System.out.println("Attempting to establish stream to server...");
		} 
		catch (IOException e2) 
		{
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
	}

	public ArrayList[] pollPlayerPositions()
	{
		try 
		{
			inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			System.out.println("Received: " + inFromServer.toString() + " from server!");
		} 
		catch (IOException e2) 
		{
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		return null;
	}

	public void sendMessage(String message)
	{
		try 
		{
			outToServer.writeBytes(message + '\n');
			System.out.println("Sending: " + message + " to server now...");
		}
		catch (IOException e1) 
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	public String[] getMessages()
	{
		String[] newMessages = null;
		
		try 
		{
			int messageNumber = 0;
			while(inFromServer.readLine() != null)
			{
				newMessages[messageNumber] = inFromServer.readLine();
				System.out.println("FROM SERVER: " + newMessages[messageNumber]);
				messageNumber++;
			}
		} 
		catch (IOException e1) 
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		return newMessages;
	}

	public void disconnect()
	{
		try 
		{
			clientSocket.close();
			System.out.println("Socket to server closed!");
		}
		catch (IOException e1) 
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
