package com.bm.jeu;


import java.awt.Color;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.UnknownHostException;

import org.lwjgl.Sys;
import org.lwjgl.opengl.Display;


import com.bm.jeu.canvases.PlayerCanvas;
import com.bm.jeu.canvases.BaseCanvas;
import com.bm.jeu.canvases.TerrainActor;
import com.bm.jeu.canvases.InterfaceCanvas;
import com.bm.jeu.net.RemoteHandler;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;

public class JeuClient implements ApplicationListener {
	static int displayXSize;
	static int displayYSize;
	
	BaseCanvas basecanvas;
	PlayerCanvas playercanvas;
	PlayerHandler playerHandler;
	InterfaceCanvas uicanvas;
	
	TextureHandler textureHandler;
	SpriteBatch spriteBatch;
	
	RemoteHandler remote;
	
	Player player1;
		
	TerrainActor ta;
	
	JeuClient clientInstance;
	
	private Stage stage;
	
	public JeuClient()
	{	
		// Set X and Y sizes
		displayXSize = 900;
		displayYSize = 550;
		
		/* MAP CANVAS
		basecanvas = new BaseCanvas(); // Initiate a new instance of a canvas.
		basecanvas.initCanvas(0, 0, 900, 550, this, Color.GREEN); // Set the BG colour to orange.
		basecanvas.setOpaque(false);
		terraincanvas = new TerrainCanvas(0,0,900,550);
		terraincanvas.setTerrainResource(this.getClass().getClassLoader().getResource("terrain/grass.png"));
		playercanvas = new PlayerCanvas(0,0,900,550); // Initiate a new instance of a canvas.
		
		// Create a new player on the map.
		// Each player must 'belong' to a map (so that it's able to spawn).
		
		remote = new RemoteHandler();
		System.out.println("Remote Handler initialized");
		
		playerHandler = new PlayerHandler(playercanvas,remote,this);
		player1 = playerHandler.createPlayer(100, 1, "PLAYER",remote);
		player1.spawn(427, 200, 100, 1, playercanvas,this);
		
		remote.attachPlayer(player1);
		
		uicanvas = new InterfaceCanvas(0, 0, 900, 550,this,player1,remote);
		
		terraincanvas.setOpaque(false);
		basecanvas.setOpaque(false);
		playercanvas.setOpaque(false);
		uicanvas.setOpaque(false);
		
		terraincanvas.add(basecanvas);
		basecanvas.add(playercanvas);
		playercanvas.add(uicanvas);
		
		// Set the look & feel of the window to native.
		try {
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		setTitle("Jeu");
		this.setLayout(null);
		setResizable(false);
		setSize(displayXSize, displayYSize);
		add(terraincanvas); // Add the base canvas.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null); // Center on screen */
		
		clientInstance = this;
	}

	@Override
	public void create() {
		stage = new Stage(displayXSize,displayYSize,true);
		Gdx.input.setInputProcessor(stage);
		
		System.out.println("Starting up with...");
		System.out.println("LWJGL / LibGDX " + Sys.getVersion());
		
		textureHandler = new TextureHandler();
		spriteBatch = textureHandler.getSpriteBatch();
		
		playerHandler = new PlayerHandler(playercanvas, remote, textureHandler);
		player1 = playerHandler.createPlayer(100, 1, "BOB", remote);
		
		ta = new TerrainActor(clientInstance);
		stage.addActor(ta);
		stage.addActor(player1);
		stage.setKeyboardFocus(player1);
		System.out.println(stage.getActors());
	}

	@Override
	public void resize(int width, int height) {
		stage.setViewport(width, height, true);
	}

	@Override
	public void render() {
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT); // Apparently this clears the screen!
		stage.act(Gdx.graphics.getDeltaTime());
		stage.draw();

		Display.setTitle("Jeu LibGDX Port - FPS: " + 	Gdx.graphics.getFramesPerSecond());
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
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
}
