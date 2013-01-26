package com.bm.jeu;

public class PlayerHandler {
	public Player createPlayer(int hp, int level, String name)
	{
		Player newPlayer = new Player();
		Sprite newSprite = new Sprite();
		
		newSprite._setSpriteImage("res/sprite_fr1.png");
		newPlayer._setSprite(newSprite);
		
		// Set different player stats
		newPlayer._setName(name);
		newPlayer._setHp(hp);
		newPlayer._setLevel(level);
		newPlayer._setSpeedX(3);
		newPlayer._setSpeedY(3);
		
		return newPlayer;
	}
}
