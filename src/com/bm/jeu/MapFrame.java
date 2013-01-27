package com.bm.jeu;


import java.awt.Color;
import java.net.MalformedURLException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.bm.jeu.MapCanvas;

public class MapFrame extends JFrame {
	static int displayXSize;
	static int displayYSize;
	MapCanvas basecanvas;
	MapCanvas playercanvas;
	PlayerHandler playerHandler;
	Player player1;
	
	public MapFrame()
	{
		// Set X and Y sizes
		displayXSize = 900;
		displayYSize = 550;
		
		// MAP CANVAS
		basecanvas = new MapCanvas(); // Initiate a new instance of a canvas.
		basecanvas.initCanvas(0, 0, 900, 490,true, Color.GREEN); // Set the BG colour to orange.
		basecanvas.setOpaque(false);
		playercanvas = new MapCanvas(); // Initiate a new instance of a canvas.
		playercanvas.initCanvas(0, 0, 900, 490,false, Color.GREEN); // Set the BG colour to orange.
		playercanvas.setOpaque(false);
		
		basecanvas.add(playercanvas);
		
		// Create a new player on the map.
		// Each player must 'belong' to a map (so that it's able to spawn).
		playerHandler = new PlayerHandler();
		player1 = playerHandler.createPlayer(100, 1, "PLAYER");
		player1.spawn(427, 200, 100, 1, playercanvas,this);
		
		// Set the look & feel of the window to native.
		try {
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		setTitle("Jeu");
		this.setLayout(null);
		setResizable(false);
		setSize(displayXSize, displayYSize);
		add(basecanvas); // Add the base canvas.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null); // Center on screen
	}
}
