package com.bm.jeu;

import java.awt.Toolkit;
import java.net.URL;

public class PlayerHandler {
	public Player createPlayer(int hp, int level, String name)
	{
		Player newPlayer = new Player();
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
}
