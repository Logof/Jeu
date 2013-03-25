package com.bm.jeu;

import java.util.ArrayList;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/***
 * The JeuSpriteBatch class extends LibGDX's own SpriteBatch class, hence it has all of the same methods. However,
 * in addition we've added some methods that make it easier to manage the rendering of different textures, often
 * 'dynamically' - IE: their position changes often, and they could no longer need to be rendered at any given point.
 * 
 * As long as the same instance of this JeuSpriteBatch is passed down through the application's classes and methods,
 * anything added using one of the add methods will be drawn!
 * 
 * @author BnMcG
 */

public class JeuSpriteBatch extends SpriteBatch {
	private ArrayList<Player> playerQueue;
	private ArrayList<Texture> textureQueue;

	public JeuSpriteBatch() {
		playerQueue = new ArrayList<Player>();
		textureQueue = new ArrayList<Texture>();
	}
	
	/***
	 * Loops through the objects in the playerQueue and textureQueue list and draws them on the screen.
	 * 
	 * This method of rendering different 'types' of objects in different loops and lists makes the whole
	 * rendering system more modular - for example: one loop will render all of the players to the screen,
	 * one loop will render all NPCs, one loop will render all mobs, one loop will render terrain...
	 * 
	 * This makes it easier to debug and expand upon the core functionality of rendering objects
	 * to the screen.
	 * 
	 * This method should be called in the game loop's render() method, between SpriteBatch.begin() and
	 * SpriteBatch.end() 
	 */

	public void drawQueues() {
		/*
		 * Handle the drawing of sprites specifically
		 */
		
		if(playerQueue != null) {
			int count = 0;
			while(count < playerQueue.size()) {
				this.draw(playerQueue.get(count).getSprite().getTexture(), playerQueue.get(count).getPlayerX(), playerQueue.get(count).getPlayerY());
				count++;
			}
		}
		
		/*
		 * Handle the drawing of other textures 
		 */
		
		if(textureQueue != null) {
			int count = 0;
			while(count < textureQueue.size()) {
				this.draw(textureQueue.get(count), 100, 100);
				count++;
			}
		}
	}
	
	/***
	 * Adds a sprite to the game's 'render queue' - all objects in the queue are rendered to the screen
	 * every time the application's render() method is called. 
	 * 
	 * @param player
	 */
	public void addToPlayerRenderQueue(Player player) {
		playerQueue.add(player);
	}
	
	/***
	 * Removes a sprite from the game's 'render queue' - this means that next time the render() method is
	 * called, this sprite won't be painted again. 
	 * 
	 * @param sprite
	 */
	
	public void removeFromPlayerRenderQueue(Player player) {
		playerQueue.remove(player);
	}
}
