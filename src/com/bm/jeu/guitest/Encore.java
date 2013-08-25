package com.bm.jeu.guitest;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;

public class Encore extends Game {
	// constant useful for logging
	public static final String LOG = Encore.class.getSimpleName();
	
	//if we always come back to some screen we can set it here
	
	public PlayScreen play;


	@Override
	public void create() {
		Gdx.app.debug(Encore.LOG, "Creating game");
		MainMenuScreen menu = new MainMenuScreen(this);
		play = new PlayScreen(this);
		setScreen(menu);
	}
}
