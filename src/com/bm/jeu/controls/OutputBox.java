package com.bm.jeu.controls;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.BorderFactory;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.Border;

import com.bm.jeu.MapFrame;
import com.bm.jeu.net.RemoteHandler;

public class OutputBox extends JScrollPane implements MouseListener, MouseMotionListener {
	
	/**
	 * Integers used in drag/drop support of textbox:
	 * (Doesn't work! :[)
	 */
	
	private int cursorX;
	private int cursorY;
	private int outputBoxX;
	private int outputBoxY;
	
	private JTextArea outputArea;
	
	public OutputBox(int x, int y, RemoteHandler messageHandler, MapFrame parentFrame) {
		parentFrame.addMouseListener(this);
		parentFrame.addMouseMotionListener(this);
		
		outputArea = new JTextArea();
		this.setViewportView(outputArea);
		
		this.setBounds(x, y, 400, 200);
		outputArea.setBounds(0,0,400,200);
		
		outputBoxX = x;
		outputBoxY = y;
		cursorX = 0;
		cursorY = 0;
		
		setVisible(true);
		setFocusable(true);
		
		outputArea.setVisible(true);
		outputArea.setFocusable(true);
		outputArea.setEditable(false);
		outputArea.setLineWrap(true);
		outputArea.setWrapStyleWord(true);
		
		Font boldFont = new Font(this.getFont().getName(),Font.BOLD,this.getFont().getSize());
		Border chatBorder = BorderFactory.createLineBorder(new Color(0,0,0,60));
		
		setBackground(new Color(0,0,0,60));
		setForeground(new Color(255,255,255));
		setFont(boldFont);
		setBorder(chatBorder);
		
		outputArea.setBackground(new Color(0,0,0,60));
		outputArea.setForeground(new Color(255,255,255));
		outputArea.setFont(boldFont);
		outputArea.setBorder(chatBorder);
		
		outputArea.setText("Welcome to Jeu RPG [ALPHA]. Type /connect followed by an IP or hostname to connect to that server. Type /login to login to that server. \n"); // Print welcome text
	}
	
	public boolean outputText(String text) {
		outputArea.append("\n" + text); // Add a new 'message' to a new line of the output box
		outputArea.setCaretPosition(outputArea.getDocument().getLength()); // Always scroll to the bottom of the text area
		return true; // return true!
	}

	@Override
	public void mouseClicked(MouseEvent cursor) {
		System.out.println("Mouse click detected on output box!");
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		System.out.println("Mouse click detected on output box!");
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		System.out.println("Mouse click detected on output box!");
		
	}

	@Override
	public void mousePressed(MouseEvent cursor) {
		System.out.println("Mouse press detected on output box!");
		cursorX = cursor.getXOnScreen(); // Get the cursor's X location now
		cursorY = cursor.getYOnScreen(); // Get the cursor's Y location now
		
		outputBoxX = this.getX(); // Get the X position of the output box now
		outputBoxY = this.getY(); // Get the Y position of the output box now
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		System.out.println("Mouse click detected on output box!");
		
	}

	@Override
	public void mouseDragged(MouseEvent cursor) {
		System.out.println("Mouse drag detected in output box!");
		int changeInX = cursor.getXOnScreen() - cursorX;
		int changeInY = cursor.getYOnScreen() - cursorY;
		
		setLocation(outputBoxX + changeInX, outputBoxY + changeInY);
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		System.out.println("Mouse movement detected in output box!");
	}
}
