package com.bm.jeu;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Game;

/***
 * An instance of this class is handed down through the application. By calling game.setScreen(...) in a class,
 * you can set the screen - eg moving from the menu screen to the actual game. Other than that, it doesn't really
 * do much at all - at least, not yet.
 * 
 * @author BnMcG
 *
 */

public class JeuGameInstance extends Game implements ApplicationListener {
	/***
	 * When called, creates a new instance of the game, by default starting on the menu screen. 
	 */
	@Override
	public void create() {
		setScreen(new Menu(this));
	}
}
