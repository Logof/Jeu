package com.bm.jeu;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.util.Random;

import org.lwjgl.openal.AL;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GLContext;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle;
import com.badlogic.gdx.scenes.scene2d.ui.Window;
import com.badlogic.gdx.scenes.scene2d.ui.Window.WindowStyle;
import com.badlogic.gdx.scenes.scene2d.utils.Align;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.badlogic.gdx.utils.Timer;
import com.bm.jeu.Launcher.TimerTask;

public class Menu implements Screen {
	private TextButton btnLaunchGame;
	private Skin skin;
	private BitmapFont font;
	private Stage stage;

	private TextureRegion spriteRt1;
	private TextureRegion spriteRt2;
	private TextureRegion spriteLf1;
	private TextureRegion spriteLf2;
	private TextureRegion spriteBk1;
	private TextureRegion spriteBk2;
	private TextureRegion spriteFr1;
	private TextureRegion spriteFr2;
	private TextureRegion hero;

	private JeuSpriteBatch sb;

	private TextureRegionDrawable background;
	private Table table;

	private Random rand;
	private int heroPos; 
	private int animation_stage;

	private WindowStyle windows;
	
	private JeuGameInstance game;



	private Menu self;

	public Menu(JeuGameInstance game) {
		self = this;
		animation_stage = 1;
		this.game = game;
	}

	class Walk extends Timer.Task {
		@Override
		public void run() {
			switch(heroPos) {
			case 0:
				if(animation_stage == 1)	{
					animation_stage = 2;
					sb.removeFromTextureRegionRenderQueue(hero);
					hero = spriteFr2;
					sb.addToTextureRegionRenderQueue(hero);
				} else {
					if(animation_stage == 2)
					animation_stage = 1;
					sb.removeFromTextureRegionRenderQueue(hero);
					hero = spriteFr1;
					sb.addToTextureRegionRenderQueue(hero);
				}
				break;
			case 1:
				if(animation_stage == 1)	{
					animation_stage = 2;
					sb.removeFromTextureRegionRenderQueue(hero);
					hero = spriteBk2;
					sb.addToTextureRegionRenderQueue(hero);
				} else {
					if(animation_stage == 2)
					animation_stage = 1;
					sb.removeFromTextureRegionRenderQueue(hero);
					hero = spriteBk1;
					sb.addToTextureRegionRenderQueue(hero);
				}
				break;
			case 2:
				if(animation_stage == 1)	{
					animation_stage = 2;
					sb.removeFromTextureRegionRenderQueue(hero);
					hero = spriteLf2;
					sb.addToTextureRegionRenderQueue(hero);
				} else {
					if(animation_stage == 2)
					animation_stage = 1;
					sb.removeFromTextureRegionRenderQueue(hero);
					hero = spriteLf1;
					sb.addToTextureRegionRenderQueue(hero);
				}
				break;
			case 3:
				if(animation_stage == 1)	{
					animation_stage = 2;
					sb.removeFromTextureRegionRenderQueue(hero);
					hero = spriteRt2;
					sb.addToTextureRegionRenderQueue(hero);
				} else {
					if(animation_stage == 2)
					animation_stage = 1;
					sb.removeFromTextureRegionRenderQueue(hero);
					hero = spriteRt1;
					sb.addToTextureRegionRenderQueue(hero);
				}
				break;
			}
		}
	}

	@Override
	public void dispose() {
		stage.dispose();
		sb.dispose();
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub

	}
	@Override
	public void resize(int arg0, int arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub

	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}
	
	private void loadSprites() {
		spriteRt1 = new TextureRegion(new Texture(Gdx.files.internal("res/sprites/sprite_rt1.png")));
		spriteRt2 = new TextureRegion(new Texture(Gdx.files.internal("res/sprites/sprite_rt2.png")));

		spriteLf1 = new TextureRegion(new Texture(Gdx.files.internal("res/sprites/sprite_lf1.png")));
		spriteLf2 = new TextureRegion(new Texture(Gdx.files.internal("res/sprites/sprite_lf2.png")));

		spriteFr1 = new TextureRegion(new Texture(Gdx.files.internal("res/sprites/sprite_fr1.png")));
		spriteFr2 = new TextureRegion(new Texture(Gdx.files.internal("res/sprites/sprite_fr2.png")));

		spriteBk1 = new TextureRegion(new Texture(Gdx.files.internal("res/sprites/sprite_bk1.png")));
		spriteBk2 = new TextureRegion(new Texture(Gdx.files.internal("res/sprites/sprite_bk2.png")));
	}

	@Override
	public void render(float arg0) {
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT); // Apparently this clears the screen!
		stage.draw();

		sb.begin();
		sb.drawQueues();
		sb.end();
	}

	@Override
	public void show() {
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Point middle = new Point(screenSize.width / 2, screenSize.height / 2);
		int middleX = screenSize.width/2;
		int middleY = screenSize.height/2;
		Display.setLocation((middleX - (Gdx.graphics.getWidth() /2)), (middleY - (Gdx.graphics.getHeight() /2)));
		
		sb = new JeuSpriteBatch();

		stage = new Stage(Gdx.graphics.getWidth(),Gdx.graphics.getHeight(),false);
		Gdx.input.setInputProcessor(stage);
		skin = new Skin();
		font = new BitmapFont(Gdx.files.internal("res/font/dragonfly.fnt"), false);

		loadSprites(); // Load all the sprite images we use to manage our walking player.

		Timer walkTimer = new Timer();
		Walk walk = new Walk();
		walkTimer.scheduleTask(walk, 0, 0.5f);
		walkTimer.start();
		
		table = new Table();
		table.setSize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		stage.addActor(table);
		
		hero = spriteFr1; // Position of hero is currently set in JeuSpriteBatch (LAZY!)
		sb.addToTextureRegionRenderQueue(hero);

		background = new TextureRegionDrawable(new TextureRegion(new Texture(Gdx.files.internal("res/terrain/grass.png"))));

		rand = new Random();
		heroPos = rand.nextInt(4);
		System.out.println(heroPos);

		windows = new Window.WindowStyle();
		windows.titleFont = font;
		windows.background = background;

		TextButtonStyle buttons = new TextButtonStyle();
		buttons.font = font;
		buttons.fontColor = Color.WHITE;

		skin.add("default", buttons);
		skin.add("default", windows);
		

		btnLaunchGame = new TextButton("Play Game!", skin);

		btnLaunchGame.addListener(new InputListener() {
			@Override
			public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
				if(button == 0) {
					self.dispose();
					game.setScreen(new JeuClient(game));
				}
				return false;
			}
		});
		
		table.add(btnLaunchGame).expand().center().left().padLeft(50);
		table.setBackground(background);
		table.setPosition(0,0);
	}

}
