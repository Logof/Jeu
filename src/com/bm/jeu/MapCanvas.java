package com.bm.jeu;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class MapCanvas extends JPanel implements MouseListener {
	Graphics2D  graphics;
	
	public MapCanvas()
	{
		Player pl = new Player();
		this.addMouseListener(this);
		pl.spawn(1, 1, 1, 1, this);
	}
	
	public void initCanvas(int x, int y, int width, int height, Color bgColour)
	{
		setBounds(x, y, width, height);
		setBackground(bgColour);
		
	}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
