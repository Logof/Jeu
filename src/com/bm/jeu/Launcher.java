package com.bm.jeu;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

import org.lwjgl.opengl.Display;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Launcher extends JFrame {
	static Timer launcherDisplaySequence;
	static Launcher launcher;
	static JeuClient displayF;

	// DEBUG VARIABLES
	static int SKIP_LAUNCHER_SPLASH = 0;
	static int SHOW_LAUNCH_TRACE = 0;

	Launcher()
	{
		getContentPane().setBackground(Color.blue);
		setSize(500,300);
		validate();
		setUndecorated(true);
		setLayout(null);
		JLabel version = new JLabel("Version 0.1 [ALPHA]");
		version.setBounds(230, 100, 100, 100);
		add(version);

		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Point middle = new Point(screenSize.width / 2, screenSize.height / 2);
		Point newLocation = new Point(middle.x - (getWidth() / 2), middle.y - (getHeight() / 2));
		setLocation(newLocation);
	}

	static class TimerTask implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			launcher.dispose(); // Get rid of the launcher window.
			launcherDisplaySequence.stop(); // Stop the timer, stops an OpenAL exception which occurred when the client opened, because the timer tried to open the client window twice!
			LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
			cfg.title = "Jeu";
			cfg.useGL20 = true;
			cfg.width = 900;
			cfg.height = 500;
			cfg.vSyncEnabled = false;
			cfg.useCPUSynch = false;
			// Stops the user resizing the window, since the graphics won't scale.
			cfg.resizable = false;
			LwjglApplication app = new LwjglApplication(new JeuGameInstance(), cfg);
			
			JeuGameInstance jeu = new JeuGameInstance();
			jeu.create();
		}

	}

	public static void main(String args[]) throws MalformedURLException
	{
		launcher = new Launcher();

		launcher.setVisible(true);
		TimerTask launchSequence = new TimerTask();
		launcherDisplaySequence = new Timer(1000,launchSequence);
		launcherDisplaySequence.start();
	}
} 