package com.bm.jeu.guitest;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.bm.jeu.common.ef.Component;

public abstract class GameScreen<T> implements Screen {
	protected T game;
	protected static SpriteBatch spritebatch;
	protected Map<UUID, Component> draw_;
	

	public GameScreen (T game) {
		this.game = game;
		if(spritebatch ==null){
			spritebatch = new SpriteBatch();
		}
		draw_ = new ConcurrentHashMap<UUID, Component>();
	}
	
	public void clear(){
        Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
	}
	
	public void queueDrawable(Component comp){
		draw_.put(comp.getENTITYID(),comp);
	}
	
	public void clearQueue(){
		draw_.clear();
	}

}
