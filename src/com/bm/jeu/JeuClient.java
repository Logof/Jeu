package com.bm.jeu;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;

import org.lwjgl.Sys;
import org.lwjgl.opengl.Display;


import com.bm.jeu.canvases.PlayerCanvas;
import com.bm.jeu.canvases.BaseCanvas;
import com.bm.jeu.canvases.TerrainActor;
import com.bm.jeu.canvases.InterfaceCanvas;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;

public class JeuClient extends Game implements Screen {
	static int displayXSize;
	static int displayYSize;

	BaseCanvas basecanvas;
	PlayerCanvas playercanvas;
	PlayerHandler playerHandler;
	InterfaceCanvas uicanvas;

	TextureHandler textureHandler;
	JeuSpriteBatch spriteBatch;

	AudioHandler audio;

	Player player1;

	TerrainActor ta;

	JeuClient clientInstance;

	private Stage stage;

	public JeuClient(Game game)
	{	
		// Set X and Y sizes
		displayXSize = 900;
		displayYSize = 550;

		clientInstance = this;
	}

	@Override
	public void dispose() {
		stage.dispose();
	}

	/***
	 * Returns the instance of TextureHandler that this client is using. 
	 * Using the same instance of TextureHandler throughout the whole game should
	 * be more efficient (theoretically!) and is simpler than setting up multiple instances.
	 * 
	 * It also means that textures are only created once, saving on memory usage.
	 * 
	 * @return The instance of TextureHandler that this game is using.
	 */

	public TextureHandler getTextureHandler() {
		// Encapsulation states that we can't just make textureHandler public (for no apparent reason)
		// Hence this somewhat roundabout-like boilerplate code.
		return textureHandler; // Return the textureHandler object.
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub

	}

	@Override
	public void render(float arg0) {
		System.out.println(arg0);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT); // Apparently this clears the screen!
		stage.act(Gdx.graphics.getDeltaTime());
		stage.draw();

		spriteBatch.begin();
		spriteBatch.drawQueues();
		spriteBatch.end();

		Display.setTitle("Jeu LibGDX Port - FPS: " + 	Gdx.graphics.getFramesPerSecond() + " [UNSTABLE]");

	}

	@Override
	public void show() {
		/*
		 * Print a message in the console containing some information regarding the system that the Jeu client is running on.
		 * This could be useful for debug and analytical purposes in the future.
		 */

		System.out.println("Welcome to the Jeu RPG Engine Client!");
		System.out.println("-------------------------------------");
		System.out.println(" ");
		System.out.println("Starting up on " + System.getProperty("os.name").toString() + " " +  System.getProperty("os.version").toString() +" (" + System.getProperty("os.arch") + ") with...");
		System.out.println("Jeu RPG Engine v1.0 [UNSTABLE]");
		System.out.println("Java (" + System.getProperty("java.vendor").toString() + ", " + System.getProperty("java.vendor.url").toString() + ") Version: " + System.getProperty("java.version").toString());
		System.out.println("LWJGL / LibGDX " + Sys.getVersion());
		System.out.println(" ");
	
		stage = new Stage(displayXSize,displayYSize,true);

		Gdx.input.setInputProcessor(stage);

		textureHandler = new TextureHandler();
		spriteBatch = textureHandler.getSpriteBatch();

		audio = new AudioHandler();
		audio.playBGMusic();

		playerHandler = new PlayerHandler(playercanvas, textureHandler);
		player1 = playerHandler.createPlayer(100, 1, "BOB");

		ta = new TerrainActor(clientInstance);

		stage.addListener(new InputListener() {
			@Override
			public boolean keyDown(InputEvent event, int keycode) {
				if(keycode == Keys.F1) {
					System.out.println("F1 key pressed!");
				}
				return false;
			}

			@Override
			public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
				System.out.println("Mouse press on stage at: " + x + " and " + y + "!");
				return false;
			}
		});

		stage.addActor(ta);
		stage.addActor(player1);
		stage.setKeyboardFocus(player1);
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resize(int arg0, int arg1) {
		stage.setViewport(arg0, arg1, true);
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void create() {
		// TODO Auto-generated method stub
		
	}
}
