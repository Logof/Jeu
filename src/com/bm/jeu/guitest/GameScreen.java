package com.bm.jeu.guitest;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public abstract class GameScreen<T> implements Screen {
	protected T game;
	protected static SpriteBatch spritebatch;
	

	public GameScreen (T game) {
		this.game = game;
		if(spritebatch ==null){
			spritebatch = new SpriteBatch();
		}
	}
	
	public void clear(){
        Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
	}

}
