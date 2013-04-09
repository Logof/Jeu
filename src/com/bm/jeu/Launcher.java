package com.bm.jeu;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Launcher {
	public static void main(String[] args) {
		JeuGameInstance game = new JeuGameInstance();
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "Jeu";
		cfg.useGL20 = true;
		cfg.width = 900;
		cfg.height = 500;
		cfg.vSyncEnabled = false;
		cfg.useCPUSynch = false;
		// Stops the user resizing the window, since the graphics won't scale.
		cfg.resizable = false;
		new LwjglApplication(game, cfg);
	}
}
