package com.bm.jeu.canvases;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.bm.jeu.JeuClient;
import com.bm.jeu.TextureHandler;

public class TerrainActor extends Actor {
	Texture background;
	TextureHandler textureHandler;

	public TerrainActor(JeuClient parent) {
		try {
			textureHandler = parent.getTextureHandler();
			background = textureHandler.getTextureGrass();
		} catch(NullPointerException npe) {
			npe.printStackTrace();
		}
	}
	
	/*
	 * Override the draw method so that we can draw anything we like (eg: the background!) onto the stage.
	 * 
	 * (non-Javadoc)
	 * @see com.badlogic.gdx.scenes.scene2d.Actor#draw(com.badlogic.gdx.graphics.g2d.SpriteBatch, float)
	 */
	
	public void draw (SpriteBatch batch, float parentAlpha) {
		batch.draw(background, 0, 0);
	}
}
