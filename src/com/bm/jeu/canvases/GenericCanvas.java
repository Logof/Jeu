package com.bm.jeu.canvases;


import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Line2D;
import java.net.MalformedURLException;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import com.bm.jeu.MapFrame;

public class GenericCanvas extends JPanel implements MouseListener, KeyListener {
	private boolean DRAW_DEBUG_GRID = false;
	private boolean DRAW_DEBUG_TEXT = false;
	
	private int canvasHeight;
	private int canvasWidth;
	
	public void showDebugGrid(boolean draw)
	{
		if(draw == true)
		{
			DRAW_DEBUG_GRID = true;
		}
		else
		{
			DRAW_DEBUG_GRID = false;
		}
	}
	
	public GenericCanvas()
	{
		setLayout(null);
		this.addMouseListener(this);
	}
	
	public void initCanvas(int x, int y, int width, int height, MapFrame mframe, Color bgColour)
	{
		canvasWidth = width;
		canvasHeight = height;
		setBounds(x, y, width, height);
		setBackground(bgColour);
		
		mframe.addKeyListener(this);
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponents(g);
		Graphics2D g2d = (Graphics2D) g;
		//System.out.println("Debug Grid Status: " + DRAW_DEBUG_GRID);
		
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

	@Override
	public void keyPressed(KeyEvent e) {

	}

	@Override
	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_F1)
		{
			System.out.println("F1 Key Released! Toggling Debug Grid!");
			if(DRAW_DEBUG_GRID == false)
			{
				this.showDebugGrid(true);
			}
			else
			{
				this.showDebugGrid(false);
			}
		}
		
	}

	@Override
	public void keyTyped(KeyEvent e) {

	}
	
	
	
}
