package com.bm.jeu;

public class PlayerHandler {
	public Player createPlayer(int hp, int level, String name, MapCanvas mapcanvas)
	{
		Player newPlayer = new Player();
		Sprite newSprite = new Sprite();
		
		newSprite._setSpriteImage("res/sprite.png");
		newPlayer._setSprite(newSprite);
		
		// Set different player 
		newPlayer._setName(name);
		newPlayer._setHp(hp);
		newPlayer._setLevel(level);
		
		try {
			newPlayer.spawn(1, 1, 100, 1, mapcanvas);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return newPlayer;
	}
}
