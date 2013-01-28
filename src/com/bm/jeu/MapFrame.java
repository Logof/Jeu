package com.bm.jeu;


import java.awt.Color;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.bm.jeu.canvases.PlayerCanvas;
import com.bm.jeu.canvases.BaseCanvas;
import com.bm.jeu.canvases.TerrainCanvas;
import com.bm.jeu.canvases.InterfaceCanvas;

public class MapFrame extends JFrame {
	static int displayXSize;
	static int displayYSize;
	BaseCanvas basecanvas;
	PlayerCanvas playercanvas;
	TerrainCanvas terraincanvas;
	PlayerHandler playerHandler;
	InterfaceCanvas uicanvas;
	Player player1;
	
	public MapFrame()
	{	  
		// Set X and Y sizes
		displayXSize = 900;
		displayYSize = 550;
		
		// MAP CANVAS
		basecanvas = new BaseCanvas(); // Initiate a new instance of a canvas.
		basecanvas.initCanvas(0, 0, 900, 550, this, Color.GREEN); // Set the BG colour to orange.
		basecanvas.setOpaque(false);
		terraincanvas = new TerrainCanvas();
		terraincanvas.initCanvas(0, 0, 900, 550, this);
		terraincanvas.setTerrainResource(this.getClass().getClassLoader().getResource("terrain/grass.png"));
		terraincanvas.setOpaque(false);
		playercanvas = new PlayerCanvas(); // Initiate a new instance of a canvas.
		playercanvas.initCanvas(0, 0, 900, 550, this, Color.GREEN); // Set the BG colour to orange.
		playercanvas.setOpaque(false);
		uicanvas = new InterfaceCanvas(0, 0, 900, 550, this);
		uicanvas.setOpaque(false);
		terraincanvas.add(basecanvas);
		basecanvas.add(playercanvas);
		playercanvas.add(uicanvas);
		
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
		add(terraincanvas); // Add the base canvas.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null); // Center on screen
	}
}
