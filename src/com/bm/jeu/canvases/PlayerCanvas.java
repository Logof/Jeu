package com.bm.jeu.canvases;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class PlayerCanvas extends JPanel {
	public PlayerCanvas(int x, int y, int width, int height)
	{
		setLayout(null);
		this.setOpaque(false);
		setBounds(x, y, width, height);
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		updateUI();
		repaint();
	}
}