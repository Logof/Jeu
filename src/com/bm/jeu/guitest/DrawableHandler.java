package com.bm.jeu.guitest;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;


public class DrawableHandler {

	private static DrawableHandler instance_;
	
	private static Object syncObject_ = new Object();
	
	private static SpriteBatch spritebatch;
	
	
	private DrawableHandler(){
		spritebatch = new SpriteBatch();
	}
	
	public static DrawableHandler getinstance() {

		/*
		 * in a non-thread-safe version of a Singleton the following line could
		 * be executed, and the thread could be immediately swapped out
		 */
		if (instance_ == null) {

			synchronized (syncObject_) {

				if (instance_ == null) {
					instance_ = new DrawableHandler();
				}

			}

		}
		return instance_;
	}

	public static SpriteBatch getSpritebatch() {
		return spritebatch;
	}

	public static void setSpritebatch(SpriteBatch spritebatch) {
		DrawableHandler.spritebatch = spritebatch;
	}
}
