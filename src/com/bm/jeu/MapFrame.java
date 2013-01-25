package com.bm.jeu;


import java.awt.Color;
import java.net.MalformedURLException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.bm.jeu.MapCanvas;

public class MapFrame extends JFrame {
	static int displayXSize;
	static int displayYSize;
	MapCanvas mcanvas;
	
	public MapFrame()
	{
		// Set X and Y sizes
		displayXSize = 900;
		displayYSize = 550;
		
		// MAP CANVAS
		mcanvas = new MapCanvas(); // Initiate a new instance of a canvas.
		mcanvas.initCanvas(0, 0, 900, 490, Color.RED); // Set the BG colour to red.
		PlayerHandler ph = new PlayerHandler();
		Player pl = ph.createPlayer(100, 1, "Ben", mcanvas);
		
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
		add(mcanvas); // Add the map canvas.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null); // Center on screen
	}
}
