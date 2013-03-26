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
	private TextureHandler textures;

	public PlayerHandler(PlayerCanvas parentCanvas, TextureHandler textures) {
		this.playerCanvas = parentCanvas;
		this.textures = textures;
	}
	
	public Player createPlayer(int hp, int level, String name)
	{
		Player newPlayer = new Player(textures);

		// Set different player stats
		newPlayer.setName(name);
		newPlayer.setHp(hp);
		newPlayer.setLevel(level);
		newPlayer.setSpeedX(2);
		newPlayer.setSpeedY(2);
		
		newPlayer.spawn(450, 275, newPlayer.getHp(), newPlayer.getLevel()); // Spawn the player in the centre of the map.

		return newPlayer;
	}
}