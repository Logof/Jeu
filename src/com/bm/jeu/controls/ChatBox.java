package com.bm.jeu.controls;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.BorderFactory;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.border.Border;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import com.bm.jeu.canvases.InterfaceCanvas;
import com.bm.jeu.net.RemoteHandler;

public class ChatBox extends JTextField {
	private boolean hidden = true;

	public ChatBox(int x, int y, boolean hidden, final RemoteHandler messageHandler, final OutputBox output)
	{
		Font boldFont = new Font(this.getFont().getName(),Font.BOLD,this.getFont().getSize());
		Border chatBorder = BorderFactory.createLineBorder(new Color(0,0,0,60));

		addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println("Processing Text: " + getText());
				try
				{
					if(getText() != "" || getText() != null)
					{
						String processedReply = messageHandler.processInputMessage(getText());
						System.out.println("PROCESSED REPLY IS: " + processedReply);
						
						String[] splitProcessedReply = processedReply.split(" "); // Split the reply every time whitespace occurs, this way we can handle variables!
						
						switch(splitProcessedReply[0]) {
						case "LOGINSUCCESS":
							output.outputText("SERVER: You've been logged in successfully!");
							break;
						case "CONNECTEDTO":
							output.outputText("SERVER: Connected to: " + splitProcessedReply[1]);
							break;
						case "NOCONNECTION":
							output.outputText("SERVER: You're not connected to a server!");
							break;
						case "PLAYERS":
							char[] playerNamesCharArray = splitProcessedReply[1].toCharArray();
							if(playerNamesCharArray[0] == ',') {
								playerNamesCharArray[0] = ' ';
							}
							
							String playerNames = String.valueOf(playerNamesCharArray);
							
							output.outputText("SERVER: Online players: " + playerNames);
							break;
						default:
							output.outputText("There was a problem with whatever you entered!");
							break;
						}
					}
				}
				catch(NullPointerException npe) {
					npe.printStackTrace();
				}
				catch(Exception ex)
				{
					ex.printStackTrace();
				}

				setText("");
				setVisible(false);
			}});

		setBounds(x,y,400,30);
		setBackground(new Color(0,0,0,60));
		setForeground(new Color(255,255,255));
		setFont(boldFont);
		setBorder(chatBorder);

		if(hidden == true)
		{
			setVisible(false);
		}
		else
		{
			setVisible(true);
		}
	}

	public void toggle()
	{
		if(hidden == false)
		{
			setVisible(false);
		}

		if(hidden == true)
		{
			setVisible(true);
			requestFocusInWindow();
		}

		if(hidden == true)
		{
			hidden = false;
		}

		if(hidden == false)
		{
			hidden = true;
		}
	}
}
