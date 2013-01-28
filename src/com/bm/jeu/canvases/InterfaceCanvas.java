package com.bm.jeu.canvases;


import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Line2D;
import java.net.MalformedURLException;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingWorker;
import javax.swing.Timer;

import com.bm.jeu.MapFrame;
import com.bm.jeu.net.MessageHandler;

public class InterfaceCanvas extends JPanel implements KeyListener {
	
	private int canvasHeight;
	private int canvasWidth;
	private MessageHandler messageIO;
	
	private JTextField messageInput;
	private JTextArea messageOutput;
	
	public InterfaceCanvas(int x, int y, int width, int height, MapFrame mframe)
	{
		canvasWidth = width;
		canvasHeight = height;
		setBounds(x, y, width, height);
		
		messageInput = new JTextField();
		messageInput.setVisible(false);
		messageOutput = new JTextArea();
		
		MessageWorker mw = new MessageWorker();
		mw.execute();
		
		mframe.addKeyListener(this);
	}
	
	class MessageWorker extends SwingWorker<Integer, Integer>
	{
		@Override
		protected Integer doInBackground() throws Exception {
			messageIO = new MessageHandler();
			messageIO.connect(4752, "localhost");
			MessageUpdateAction mua = new MessageUpdateAction();
			Timer messageUpdater = new Timer(500, mua);
			messageUpdater.start();
			return 0;
		}
	}
	
	class MessageUpdateAction implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent arg0) {
			String newMessages[] = messageIO.getMessages();
			int messageCount = 0;
			/*while(messageCount < newMessages.length)
			{
				messageOutput.append(newMessages[messageCount]);
				System.out.println("Message posted: " + newMessages[messageCount]);
				messageCount++;
			} */
		}
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		
	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}