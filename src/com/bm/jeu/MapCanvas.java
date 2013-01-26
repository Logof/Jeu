package com.bm.jeu;


import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Line2D;
import java.net.MalformedURLException;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class MapCanvas extends JPanel implements MouseListener {
	private boolean DRAW_DEBUG_GRID = false;
	private boolean DRAW_DEBUG_TEXT = false;
	
	private int canvasHeight;
	private int canvasWidth;
	
	public MapCanvas()
	{
		setLayout(null);
		this.addMouseListener(this);
	}
	
	public void initCanvas(int x, int y, int width, int height, boolean grid, Color bgColour)
	{
		canvasWidth = width;
		canvasHeight = height;
		setBounds(x, y, width, height);
		setBackground(bgColour);
		
		if(grid == true)
		{
			DRAW_DEBUG_GRID = true;
		}
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponents(g);
		Graphics2D g2d = (Graphics2D) g;
		
		if(DRAW_DEBUG_GRID == true)
		{
			int gridX = 0;
			while(gridX < canvasWidth)
			{
				
				Line2D xLine = new Line2D.Double(gridX, 0, gridX, canvasHeight);
				g2d.setColor(Color.RED);
				g2d.setStroke(new BasicStroke(1));
				g2d.draw(xLine);
				gridX = gridX + 32;
			}
			
			int gridY = 0;
			while(gridY < canvasWidth)
			{
				
				Line2D xLine = new Line2D.Double(0, gridY, canvasWidth, gridY);
				g2d.setColor(Color.RED);
				g2d.setStroke(new BasicStroke(1));
				g2d.draw(xLine);
				gridY = gridY + 32;
			}
		}
		
		updateUI();
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
