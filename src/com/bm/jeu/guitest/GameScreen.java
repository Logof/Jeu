package com.bm.jeu.guitest;

import java.util.Queue;
import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedQueue;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;

public abstract class GameScreen<T> implements Screen {
	protected T game;
	protected Skin screenSkin;
	protected static SpriteBatch spritebatch;
	protected Queue<UUID> draw_;
	

	public GameScreen (T game) {
		this.game = game;
		this.screenSkin = new Skin();
		if(spritebatch ==null){
			spritebatch = new SpriteBatch();
		}
		draw_ = new ConcurrentLinkedQueue<UUID>();
	}
	
	public Skin getSkin(){
		return this.screenSkin;
	}
	
	public void clear(){
        Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
	}
	
	public void queueDrawable(UUID toDraw){
		draw_.add(toDraw);
	}

}
