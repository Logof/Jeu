package com.bm.jeu.guitest;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;

public class Tester extends Game {
	// constant useful for logging
	public static final String LOG = Tester.class.getSimpleName();
	
	//if we always come back to some screen we can set it here
	
	public PlayScreen play;


	@Override
	public void create() {
		Gdx.app.log(Tester.LOG, "Creating game");
		MainMenuScreen menu = new MainMenuScreen(this);
		play = new PlayScreen(this);
		setScreen(menu);
	}
}
