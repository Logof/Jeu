package com.bm.jeu;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/***
 * The TextureHandler class is used to manage textures in the game. If a texture has already been loaded, it will
 * return the already loaded texture, rather than creating a new duplicated instance of that texture that takes up
 * more memory!
 * 
 * @author BnMcG
 *
 */

public class TextureHandler {
	private Texture textureGrass;
	private Texture texturePlayer;
	private JeuSpriteBatch textureHandlerSpriteBatch;

	public TextureHandler() {
		// Constructor, we may need to use this later in development for something!
	}

	/*
	 * Sprite Batch
	 */

	/***
	 * Returns the textureHandlerSpriteBatch object. The theory is this sprite batch should be used as the default
	 * sprite batch, and all drawing should go through it. (Is this efficient?) Presumably it saves memory. 
	 * If no instance of the textureHandlerSpriteBatch exists, one will be created.
	 * 
	 * @return SpriteBatch - textureHandlerSpriteBatch.
	 */

	public JeuSpriteBatch getSpriteBatch() {
		if(textureHandlerSpriteBatch != null) {
			return textureHandlerSpriteBatch;
		} else {
			textureHandlerSpriteBatch = new JeuSpriteBatch();
			return textureHandlerSpriteBatch;
		}
	}

	public void drawSprite(Sprite sprite) {
		textureHandlerSpriteBatch.begin();
		textureHandlerSpriteBatch.draw(sprite.getTexture(), 30, 30, 32, 32);
		textureHandlerSpriteBatch.end();
	}

	/*
	 * Background textures / tiles
	 */

	/***
	 * Returns the texture for grass, as set in the image file. 
	 * If the texture hasn't already been loaded/initialised then it will initialise that texture automatically,
	 * however if the texture has already been loaded once, it will return the same instance, saving memory!
	 * 
	 * @return Texture object - texture for grass.
	 */

	public Texture getTextureGrass() {
		if(textureGrass == null) { // If the texture hasn't already been loaded once, then load now:
			try {
				textureGrass = new Texture(Gdx.files.internal("res/terrain/grass.png")); // Try and load the texture file for grass from the jar's resources.
				return textureGrass;
			} catch(NullPointerException nullPointerException) { // A NullPointerException occurred - this usually happens if the texture file can't be found, or if the method was called on a thread that wasn't OpenGL-initialised.
				System.out.println("Couldn't load texture: GRASS ! The following error occured: " + nullPointerException.getMessage());
			} catch(Exception exception) { // Some other, unknown error occurred, so we'll try and catch it, but it might not work.
				System.out.println("Couldn't load texture: GRASS ! The following error occured: " + exception.getMessage());
			}
		}

		return textureGrass; // The problem is, if we can't load the file, this will still return a NullPointerException, even if we've caught it above. Could implement a try/catch around every TextureHandler.getTexture---(), but it's not a great solution!
	}

	/***
	 * Checks whether the grass texture is already loaded. Note tat the getTexture...() method already implements this check.
	 * @return True if texture has been loaded, returns false if the texture hasn't been loaded. 
	 */

	public Boolean isTextureLoadedGrass() {
		if(textureGrass == null) {
			return false;
		} else {
			return true;
		}
	}

	/*
	 * Player Texture(s)
	 */

	public Texture getTexturePlayer(int animationStage,String direction) {
		if(animationStage == 1 && direction == "up") {
			texturePlayer = new Texture(Gdx.files.internal("res/sprites/sprite_bk1.png"));
		}

		if(animationStage == 2 && direction == "up") {
			texturePlayer = new Texture(Gdx.files.internal("res/sprites/sprite_bk2.png"));
		}

		if(animationStage == 1 && direction == "down") {
			System.out.println("Conditions met for animation stage 1, direction down!");
			texturePlayer = new Texture(Gdx.files.internal("res/sprites/sprite_fr1.png"));
		}

		if(animationStage == 2 && direction == "down") {
			System.out.println("Conditions met for animation stage 2, direction down!");
			texturePlayer = new Texture(Gdx.files.internal("res/sprites/sprite_fr2.png"));
		}

		if(animationStage == 1 && direction.equals("left")) {
			texturePlayer = new Texture(Gdx.files.internal("res/sprites/sprite_lf1.png"));
		}

		if(animationStage == 2 && direction.equals("left")) {
			texturePlayer = new Texture(Gdx.files.internal("res/sprites/sprite_lf2.png"));
		}

		if(animationStage == 1 && direction.equals("right")) {
			texturePlayer = new Texture(Gdx.files.internal("res/sprites/sprite_rt1.png"));
		}

		if(animationStage == 2 && direction.equals("right")) {
			texturePlayer = new Texture(Gdx.files.internal("res/sprites/sprite_rt2.png"));
		}

		return texturePlayer;
	}
}
