package com.bm.jeu.canvases;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.SwingWorker;
import javax.swing.Timer;

import com.bm.jeu.MapFrame;
import com.bm.jeu.Player;
import com.bm.jeu.net.RemoteHandler;
import com.bm.jeu.controls.ChatBox;
import com.bm.jeu.controls.OutputBox;

public class InterfaceCanvas extends JPanel {

	private int canvasHeight;
	private int canvasWidth;
	private RemoteHandler messageHandler;

	private InputMap inputMapBG;
	private ActionMap actionMap;

	private boolean messageInputShown = false;

	private ChatBox messageInput;
	private OutputBox messageOutput;
	
	private static MapFrame mapFrame;
	
	private RemoteHandler remoteHandle;

	public InterfaceCanvas(int x, int y, int width, int height, MapFrame mframe, Player player, RemoteHandler remote)
	{	
		// Set the map frame as a class-wide variable so that the thread can access it:
		this.mapFrame = mframe;
		
		this.remoteHandle = remote;
		
		/**
		 * Implement the chat box on a new thread, so that sending
		 * messages doesn't block-up the GUI.
		 */
		
		Thread outputWorker = new Thread(new OutputWorker(this)); // Create new thread
		outputWorker.start(); //Start new thread.
		
		setFocusable(true);
		
		inputMapBG = new InputMap();
		actionMap = new ActionMap();

		inputMapBG = this.getInputMap(WHEN_IN_FOCUSED_WINDOW);
		inputMapBG.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false), "ENTER");

		actionMap = this.getActionMap();
		actionMap.put("ENTER", new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				messageInput.toggle();
			}
		});

		canvasWidth = width;
		canvasHeight = height;
		setBounds(x, y, width, height);
		setLayout(null);
		setOpaque(false);
	}

	class MessageWorker implements Runnable
	{
		private InterfaceCanvas parent;

		public MessageWorker(InterfaceCanvas interfacecanvas)
		{
			parent = interfacecanvas;
		}

		@Override
		public void run() {
			messageInput = new ChatBox(0, 520, true, remoteHandle, messageOutput);
			parent.add(messageInput);
		}
	}
	
	class OutputWorker implements Runnable {
		private InterfaceCanvas parent;
		
		public OutputWorker(InterfaceCanvas interfaceCanvas) {
			parent = interfaceCanvas;
		}
		
		@Override
		public void run() {
			messageOutput = new OutputBox(0,310,messageHandler,mapFrame);
			parent.add(messageOutput);
			
			Thread messageWorker = new Thread(new MessageWorker(parent)); // Create new thread
			messageWorker.start(); //Start new thread.
			
		}
	}
}