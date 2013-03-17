package com.bm.jeu;

import java.util.List;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.SwingWorker;
import javax.swing.Timer;

import com.bm.jeu.canvases.PlayerCanvas;
import com.bm.jeu.net.RemoteHandler;

public class PlayerHandler {
	private PlayerCanvas playerCanvas;

	public class WorkerThread implements Runnable {
		PlayerCanvas parentCanvas;
		RemoteHandler remoteHandle;
		MapFrame mapFrame;
		PlayerHandler playerHandle;
		Runnable run;

		public WorkerThread(PlayerCanvas parentCanvas, RemoteHandler remoteHandle, MapFrame mapFrame, PlayerHandler playerHandle) {
			this.mapFrame = mapFrame;
			this.remoteHandle = remoteHandle;
			this.parentCanvas = parentCanvas;
			this.playerHandle = playerHandle;
		}

		@Override
		public void run() {
			class Task implements ActionListener {
				@Override
				public void actionPerformed(ActionEvent e) {
					RemotePlayersWorker rpw = new RemotePlayersWorker(parentCanvas, remoteHandle,mapFrame,playerHandle);
					rpw.execute();
				}
			}
			
			Task task = new Task();
			Timer updateTimer = new Timer(500, task);
			updateTimer.start();
		}
	}

	public PlayerHandler(PlayerCanvas parentCanvas, RemoteHandler remoteHandle, MapFrame mframe) {
		this.playerCanvas = parentCanvas;
		WorkerThread wt = new WorkerThread(parentCanvas, remoteHandle, mframe, this);
		Thread wtt = new Thread(wt);
		wtt.start();
	}


	public Player createPlayer(int hp, int level, String name, RemoteHandler remote)
	{
		Player newPlayer = new Player(playerCanvas,remote);
		Sprite newSprite = new Sprite();
		URL spriteURL = null;

		try 
		{
			spriteURL = this.getClass().getClassLoader().getResource("sprites/sprite_fr1.png");
			newSprite._setSpriteImage(spriteURL);
		}
		catch(NullPointerException np)
		{
			np.printStackTrace();
		}

		newPlayer._setSprite(newSprite);

		// Set different player stats
		newPlayer._setName(name);
		newPlayer._setHp(hp);
		newPlayer._setLevel(level);
		newPlayer._setSpeedX(2);
		newPlayer._setSpeedY(2);

		return newPlayer;
	}

	public RemotePlayer createRemotePlayer(int hp, int level, String name)
	{
		RemotePlayer newPlayer = new RemotePlayer(playerCanvas);
		Sprite newSprite = new Sprite();
		URL spriteURL = null;

		try 
		{
			spriteURL = this.getClass().getClassLoader().getResource("sprites/sprite_fr1.png");
			newSprite._setSpriteImage(spriteURL);
		}
		catch(NullPointerException np)
		{
			np.printStackTrace();
		}

		newPlayer._setSprite(newSprite);

		// Set different player stats
		newPlayer._setName(name);
		newPlayer._setHp(hp);
		newPlayer._setLevel(level);
		newPlayer._setSpeedX(2);
		newPlayer._setSpeedY(2);

		return newPlayer;
	}

	class RemotePlayersWorker extends SwingWorker<String[][], String[][]> {
		PlayerCanvas parent;
		RemoteHandler remote;
		MapFrame mapFrame;
		PlayerHandler playerHandler;
		String[][] players;
		int maximumConnections;

		public RemotePlayersWorker(PlayerCanvas parentCanvas, RemoteHandler remoteHandle, MapFrame mapFrame, PlayerHandler playerHandle) {
			this.parent = parentCanvas;
			this.remote = remoteHandle;
			this.mapFrame = mapFrame;
			this.playerHandler = playerHandle;
		}

		@Override
		protected String[][] doInBackground() throws Exception {
			while(true) {
				System.out.println("Test");
				players = remote.getConnectedPlayers();
				publish(players);
				return players;
			}
		}

		@Override
		protected void process(List<String[][]> chunks) {
			System.out.println("Process");
			int processed = 0;
			while(processed < players.length) {
				RemotePlayer remotePlayer = playerHandler.createRemotePlayer(100, 0, players[processed][0]);
				remotePlayer.spawn(Integer.parseInt(players[processed][1]), Integer.parseInt(players[processed][2]), 100, 0, parent, mapFrame);
				processed++;
			}
		}
	}
}