package com.bm.jeu;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

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
		setSize(500,300);
		setLayout(null);
		setLocationRelativeTo(null);
		setUndecorated(true);
		JLabel version = new JLabel("Version 0.1");
		version.setBounds(230, 30, 30, 30);
		add(version);
	}
	
	static class TimerTask implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {

		}
		
	}

	public static void main(String args[]) throws MalformedURLException
	{
		// Uncomment this line to skip the 5 second splash screen.
		SKIP_LAUNCHER_SPLASH = 0;
		launcher = new Launcher();
		
		if(SKIP_LAUNCHER_SPLASH == 0)
		{
			// Timer sequence
			//launcher.setVisible(true);
			//TimerTask launchSequence = new TimerTask();
			//launcherDisplaySequence = new Timer(3,launchSequence);
			
			LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
			cfg.title = "Jeu LibGDX Port";
			cfg.useGL20 = true;
			cfg.width = 900;
			cfg.height = 500;
			new LwjglApplication(new JeuClient(), cfg);
		}
		else
		{
			launcher = new Launcher();
			
			LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
			cfg.title = "Jeu LibGDX Port";
			cfg.useGL20 = true;
			cfg.width = 900;
			cfg.height = 500;
			new LwjglApplication(new JeuClient(), cfg);
		}
	} 
}