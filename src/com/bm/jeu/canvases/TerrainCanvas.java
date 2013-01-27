package com.bm.jeu.canvases;


import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Line2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

import com.bm.jeu.MapFrame;

public class TerrainCanvas extends JPanel  {
	private int canvasHeight;
	private int canvasWidth;
	private BufferedImage terrain;
	
	public TerrainCanvas()
	{
		setLayout(null);
	}
	
	public boolean setTerrainResource(URL terrainSourceURL)
	{
		try
		{
			terrain = ImageIO.read(terrainSourceURL);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
	
	public void initCanvas(int x, int y, int width, int height, MapFrame mframe)
	{
		canvasWidth = width;
		canvasHeight = height;
		setBounds(x, y, width, height);
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponents(g);
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.drawImage(terrain, 0, 0, null);
		repaint();
		updateUI();
	}
}