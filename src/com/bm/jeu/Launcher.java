package com.bm.jeu;

import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;

import com.bm.jeu.MapFrame;

public class Launcher extends JFrame {
	static Timer launcherDisplaySequence;
	static Launcher launcher;
	static MapFrame mapWindow;
	
	// DEBUG VARIABLES
	static int SKIP_LAUNCHER_SPLASH = 0;
	static int SHOW_LAUNCH_TRACE = 0;

	Launcher()
	{
		setSize(500,300);
		setLocationRelativeTo(null);
		setUndecorated(true);
	}

	public static void main(String args[])
	{
		// Uncomment this line to skip the 5 second splash screen.
		SKIP_LAUNCHER_SPLASH = 1;
		
		launcher = new Launcher();
		mapWindow = new MapFrame();
		
		if(SKIP_LAUNCHER_SPLASH == 0)
		{
			// Timer sequence
			launcher.setVisible(true);
			launcherDisplaySequence = new Timer();
			ShowGame taskShowGame = new ShowGame();
	
			launcherDisplaySequence.schedule(taskShowGame, 5000);
		}
		else
		{
			mapWindow.setVisible(true);
		}
	}
	
	static class ShowGame extends TimerTask
	{
		@Override
		public void run() {
			launcher.setVisible(false);
			mapWindow.setVisible(true);
		}
	}
}
