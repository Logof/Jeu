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

	public PlayerHandler(PlayerCanvas parentCanvas, RemoteHandler remoteHandle, MapFrame mframe) {
		this.playerCanvas = parentCanvas;
		RemotePlayersWorker rpw = new RemotePlayersWorker(parentCanvas, remoteHandle,mframe,this);
		rpw.execute();
	}

	public Player createPlayer(int hp, int level, String name)
	{
		Player newPlayer = new Player(playerCanvas);
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
			System.out.println("TEST 1");
			while(true) {
				System.out.println("Test");
				players = remote.getConnectedPlayers();
				publish(players);
				return players;
			}
		}

		@Override
		protected void process(List<String[][]> chunks) {
			int processed = 0;
			while(processed < players.length) {
				RemotePlayer remotePlayer = playerHandler.createRemotePlayer(100, 0, players[processed][0]);
				remotePlayer.spawn(0, 0, 100, 0, parent, mapFrame);
				processed++;
			}
		}

		@Override 
		protected void done() {

		}
	}
}