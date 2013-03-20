package com.bm.jeu;

import java.util.List;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.SwingWorker;
import javax.swing.Timer;

import com.bm.jeu.canvases.PlayerCanvas;
import com.bm.jeu.controls.Sprite;
import com.bm.jeu.net.RemoteHandler;

public class PlayerHandler {
	private PlayerCanvas playerCanvas;
	
	/***
	 * A PlayerHandler handles the creation and spawning of local players, as well
	 * as the spawning and monitoring of remote players on the map.
	 * 
	 * @param parentCanvas An instance of a PlayerCanvas that the PlayerHandler can spawn players on.
	 * @param remoteHandle An instance of the RemoteHandler class that a PlayerHandler can use to fetch remote players
	 * @param mframe An instance of the MapFrame class that is essentially the container for the game, and passed to the createPlayer() method.
	 */
	
	public PlayerHandler(PlayerCanvas parentCanvas, RemoteHandler remoteHandle) {
		this.playerCanvas = parentCanvas;
		RemotePlayerWorkerThread wt = new RemotePlayerWorkerThread(parentCanvas, remoteHandle, this);
		Thread wtt = new Thread(wt);
		wtt.start();
	}
	
	/***
	 * RemotePlayersWorker is a SwingWorker that is run on a timer, 
	 * and handles the maintenance of remote players.
	 * 
	 * @author Ben Magee
	 * @see RemotePlayerWorkerThread
	 */
	
	class RemotePlayersWorker extends SwingWorker<String[][], String[][]> {
		PlayerCanvas parent;
		RemoteHandler remote;
		PlayerHandler playerHandler;
		String[][] players;
		int maximumConnections;

		public RemotePlayersWorker(PlayerCanvas parentCanvas, RemoteHandler remoteHandle, PlayerHandler playerHandle) {
			this.parent = parentCanvas;
			this.remote = remoteHandle;
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
				remotePlayer.spawn(Integer.parseInt(players[processed][1]), Integer.parseInt(players[processed][2]), 100, 0, parent);
				processed++;
			}
		}
	}
	
	/***
	 * The RemotePlayerWorkerThread class is a thread that spawns and handles the timer that is used
	 * to execute RemotePlayersWorker periodically. This stops the UI from blocking. See the RemotePlayersWorker
	 * SwingWorker for more information.
	 * 
	 * @author Ben Magee
	 *
	 */

	public class RemotePlayerWorkerThread implements Runnable {
		PlayerCanvas parentCanvas;
		RemoteHandler remoteHandle;
		PlayerHandler playerHandle;
		Runnable run;

		public RemotePlayerWorkerThread(PlayerCanvas parentCanvas, RemoteHandler remoteHandle, PlayerHandler playerHandle) {
			this.remoteHandle = remoteHandle;
			this.parentCanvas = parentCanvas;
			this.playerHandle = playerHandle;
		}

		@Override
		public void run() {
			class Task implements ActionListener {
				@Override
				public void actionPerformed(ActionEvent e) {
					RemotePlayersWorker rpw = new RemotePlayersWorker(parentCanvas, remoteHandle,playerHandle);
					rpw.execute();
				}
			}
			
			Task task = new Task();
			Timer updateTimer = new Timer(500, task);
			updateTimer.start();
		}
	}
	
	/***
	 * Creates a new remote player that the local user is unable to move.
	 * However, this object is the one the local user sees while walking around the map.
	 * The local player should also be able to kill/damage the remote player.
	 * 
	 * @param hp The remote player's health points.
	 * @param level The remote player's level
	 * @param name The remote player's name, as it will appear under their avatar
	 * @return Returns a RemotePlayer object, which can be killed/damaged/etc.
	 */

	public RemotePlayer createRemotePlayer(int hp, int level, String name)
	{
		RemotePlayer newPlayer = new RemotePlayer(playerCanvas);
		Sprite newSprite = new Sprite();
		URL spriteURL = null;

		try 
		{
			spriteURL = this.getClass().getClassLoader().getResource("sprites/sprite_fr1.png");
			newSprite.setSpriteImage(spriteURL);
		}
		catch(NullPointerException np)
		{
			np.printStackTrace();
		}

		newPlayer.setSprite(newSprite);

		// Set different player stats
		newPlayer.setName(name);
		newPlayer.setHp(hp);
		newPlayer.setLevel(level);
		newPlayer.setSpeedX(2);
		newPlayer.setSpeedY(2);

		return newPlayer;
	}

	/***
	 * Creates a new local player that the user is able to interact with via WASD or arrow keys.
	 * 
	 * @param hp The number of health points the player has (out of 100)
	 * @param level The player's level in-game (usually 1).
	 * @param name The name that will appear under the player's sprite
	 * @param remote The RemoteHandler that is used to interact with the server on the player's behalf.
	 * @return Player Returns a Player object - this can be used to move/kill/spawn (etc) the player.
	 */
	
	public Player createPlayer(int hp, int level, String name, RemoteHandler remote)
	{
		Player newPlayer = new Player(playerCanvas,remote);
		Sprite newSprite = new Sprite();
		URL spriteURL = null;

		try 
		{
			spriteURL = this.getClass().getClassLoader().getResource("sprites/sprite_fr1.png");
			newSprite.setSpriteImage(spriteURL);
		}
		catch(NullPointerException np)
		{
			np.printStackTrace();
		}

		newPlayer.setSprite(newSprite);

		// Set different player stats
		newPlayer.setName(name);
		newPlayer.setHp(hp);
		newPlayer.setLevel(level);
		newPlayer.setSpeedX(2);
		newPlayer.setSpeedY(2);

		return newPlayer;
	}
}