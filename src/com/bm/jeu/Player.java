package com.bm.jeu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.KeyStroke;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.bm.jeu.canvases.PlayerCanvas;
import com.bm.jeu.net.RemoteHandler;

import java.net.URL;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;

/***
 * 
 * @author BMagee
 * 
 * This class is simply the struct for a player, it includes
 * the player's 'stats' or characteristics, the player's sprite, and getter/setter methods for those
 * stats.
 * 
 *  This class also contains methods directly related to the player itself. 
 *  For example, methods that 'kill' the player, 'respawn' the player, etc.
 *  It's currently unclear if the getter/setter variables will have any use, given that
 *  generally these variables will be set in kill/respawn methods...
 * 
 * If you're looking to create or load a player, check out the 'PlayerHandler' 
 * class. That class contains methods for creating a new player, etc.
 *
 */

class PlayerSprite extends Sprite {
	private Texture texture;
	public PlayerSprite(Texture spriteTexture, TextureHandler textureHandle) {
		this.texture = textureHandle.getTexturePlayer();
		this.setSize(32, 32);
		this.setPosition(30, 30);
		textureHandle.drawSprite(this);
	}

	public void setSprite(URL url) {

	}

	public Texture getTexture() {
		return texture;
	}

	public void setName(String name) {

	}
}

public class Player extends Actor {
	// Player characteristics / variables
	private PlayerSprite sprite;
	private int hp;
	private int level;
	private int playerX;
	private int playerY;
	private int speedX;
	private int speedY;

	/* Movement flags - in capitals as they are flags
	 When a flag is true and the appropriate method is called (eg: moveLeft()) - the player will continue
	 to move left until the flag is set to false again. */

	private boolean MOVING_LEFT;
	private boolean MOVING_RIGHT;
	private boolean MOVING_UP;
	private boolean MOVING_DOWN;

	private RemoteHandler remote;
	private TextureHandler textures;
	private JeuSpriteBatch spriteBatch;

	// The stage in the movement animation. 
	// Controls changing between version one and two of a sprite.
	private int animationStage;
	private int animationInterval = 200;
	private Timer animationTimer;


	// CONSTRUCTOR

	public Player(RemoteHandler remote, TextureHandler textures) {
		this.remote = remote;
		this.textures = textures;

		spriteBatch = textures.getSpriteBatch();

		// Setup player's sprite:
		sprite = new PlayerSprite(textures.getTexturePlayer(),textures);

		// Add the player to the render queue for players. The player should now be rendered
		// each frame.

		spriteBatch.addToPlayerRenderQueue(this);

		// Define Movement Actions:
		// =======================
		// =======================

		this.addListener(new InputListener() {
			int currentX = 0;
			int currentY = 0;

			@Override
			public boolean keyDown(InputEvent event, int keycode) {
				switch(keycode) {
				case Keys.W:
					System.out.println("Key 'w' (MOVE_UP) pressed!");
					currentY = 0;

					if(animationStage == 1)
					{
						sprite.setSprite(getClass().getClassLoader().getResource("sprites/sprite_bk2.png"));
					}

					if(animationStage == 2)
					{
						sprite.setSprite(getClass().getClassLoader().getResource("sprites/sprite_bk1.png"));
					}

					currentY = playerY;
					playerY = playerY - speedY;
					move(playerX,playerY,playerX,currentY);
					break;
				case Keys.A:
					System.out.println("Key 'a' (MOVE_LEFT) pressed!");
					MOVING_LEFT = true;
					moveLeft();

					break;
				case Keys.S:
					System.out.println("Key 's' (MOVE_DOWN) pressed!");
					currentY = 0;
					if(animationStage == 1)
					{
						sprite.setSprite(getClass().getClassLoader().getResource("sprites/sprite_fr2.png"));
					}

					if(animationStage == 2)
					{
						sprite.setSprite(getClass().getClassLoader().getResource("sprites/sprite_fr1.png"));
					}
					currentY = playerY;
					playerY = playerY + speedY;
					move(playerX,playerY,playerX,currentY);
					break;
				case Keys.D:
					System.out.println("Key 'd' (MOVE_RIGHT) pressed!");
					currentX = 0;
					if(animationStage == 1)
					{
						sprite.setSprite(getClass().getClassLoader().getResource("sprites/sprite_rt2.png"));
					}

					if(animationStage == 2)
					{
						sprite.setSprite(getClass().getClassLoader().getResource("sprites/sprite_rt1.png"));
						sprite.setSprite(getClass().getClassLoader().getResource("sprites/sprite_rt1.png"));
						sprite.setSprite(getClass().getClassLoader().getResource("sprites/sprite_rt1.png"));
						sprite.setSprite(getClass().getClassLoader().getResource("sprites/sprite_rt1.png"));
						sprite.setSprite(getClass().getClassLoader().getResource("sprites/sprite_rt1.png"));
					}

					currentX = playerX;
					playerX = playerX + speedX;
					move(playerX,playerY,currentX,playerY);
					break;
				default:
					System.out.println("Unassigned key with keycode " + Integer.toString(keycode) + " pressed!");
					break;
				}

				return true;
			}

			// Key up
			@Override
			public boolean keyUp(InputEvent event, int keycode) {
				MOVING_LEFT = false;
				System.out.println("Not moving!");
				return true;
			}
		});
	}

	public void setLocation(int oldX, int oldY) {

	}

	public void setSprite() {

	}

	public Sprite getSprite() {
		return sprite;
	}

	// Getter/setter methods
	// *********************
	public boolean setHp(int hp)
	{
		if(hp > -1) 
		{
			this.hp = hp; // Set HP to the provided value.
			return true; // Return true, HP updated.
		} 
		else 
		{
			return false; // Couldn't update HP (probably invalid HP value).
		}
	}

	public int getHp()
	{
		return hp; // Return the player's current HP to the calling method.
	}

	public boolean setLevel(int level)
	{
		if(level > 0)
		{
			this.level = level;
			return true;
		}
		else
		{
			return false; // Invalid level given.
		}
	}

	public int getLevel()
	{
		return this.level;
	}

	public boolean setPlayerName(String name)
	{
		if(name != null)
		{
			sprite.setName(name);
			return true;
		}
		else
		{
			return false;
		}
	}

	public boolean setspriteImage(URL spriteSourceImageURL)
	{
		if(spriteSourceImageURL != null)
		{
			sprite.setSprite(spriteSourceImageURL);
			return true;
		} 
		else 
		{
			return false; // Couldn't update sprite. Probably invalid sprite given.
		}		
	}

	public boolean setSpeedY(int speedY)
	{
		if(speedY > -1)
		{
			this.speedY = speedY;
			return true;
		}
		else
		{
			return false;
		}
	}

	public int getSpeedY()
	{
		return this.speedY;
	}

	public boolean setSpeedX(int speedX)
	{
		if(speedX > -1)
		{
			this.speedX = speedX;
			return true;
		}
		else
		{
			return false;
		}
	}

	public int getPlayerX() {
		return playerX;
	}

	public int getPlayerY() {
		return playerY;
	}

	// Interaction methods
	// *******************

	/***
	 * move(...) is a relatively low-level method in the Player class. It handles bounds checking
	 * and the actual movement of the player. 
	 * 
	 * The best way to move a player is by using one of other move() methods - 
	 * eg: moveLeft(), moveRight(), which call the move(...) method themselves, and handle all the arguments necessary rather 
	 * than trying to interact with this method directly.
	 *  
	 * @param x - The X coordinate the player should move to
	 * @param y - The Y coordinate the player should move to
	 * @param oldX - The player's current X coordinate
	 * @param oldY - The player's current Y coordinate.
	 */

	public void move(int x, int y, int oldX, int oldY)
	{
		if(playerX != oldX)
		{
			if(x < 870 && x > 20 && y < 460 && y > 20)
			{
				this.setLocation(x, y);
			}
			else
			{
				// Rebound slightly
				if(x >= 870)
				{
					playerX = playerX - speedX;
					x = playerX;
					this.setLocation(x,y);
				}

				if( x <= 20)
				{
					playerX = playerX + speedX;
					x = playerX;
					this.setLocation(x,y);
				}

				if(y >= 460)
				{
					playerY = playerY - speedY;
					y = playerY;
					this.setLocation(x,y);
				}

				if(y <= 20)
				{
					playerY = playerY + speedY;
					y = playerY;
					this.setLocation(x,y);
				}
			}
		}

		if(playerY != oldY)
		{
			if(y < 460 && y > 20 && x > 20 && x < 870)
			{
				this.setLocation(x,y);
			}
			else
			{
				// Rebound slightly
				if(x >= 870)
				{
					playerX = playerX - speedX;
					x = playerX;
					this.setLocation(x,y);
				}

				if( x <= 20)
				{
					playerX = playerX + speedX;
					x = playerX;
					this.setLocation(x,y);
				}

				if(y >= 460)
				{
					playerY = playerY - speedY;
					y = playerY;
					this.setLocation(x,y);
				}

				if(y <= 20)
				{
					playerY = playerY + speedY;
					y = playerY;
					this.setLocation(x,y);
				}
			}
		}
	}

	public void moveLeft() {
		int currentX = 0;

		if(animationStage == 1)
		{
			sprite.setSprite(getClass().getClassLoader().getResource("sprites/sprite_lf2.png"));
		}

		if(animationStage == 2)
		{
			sprite.setSprite(getClass().getClassLoader().getResource("sprites/sprite_lf1.png"));
		}

		currentX = playerX;
		playerX = playerX - speedX;
		move(playerX, playerY, currentX, playerY);
		System.out.println("Moved left!");
	}

	/***
	 * Spawns this player - placing them on the map and giving them HP and a level.
	 * 
	 * @param x - X coordinate to spawn the player at.
	 * @param y - Y coordinate to spawn the player at.
	 * @param hp - HP to give the player at spawn.
	 * @param level - Level to give the player at spawn
	 */

	public void spawn(int x, int y, int hp, int level)
	{
		// Draws the player at a certain position on the map.
		// Since as far as the user is concerned, the player is 
		// essentially just a sprite, most of this function just
		// manipulates the sprite's position on the map canvas.
		move(x,y,0,0);
		playerX = x;
		playerY = y;

		/*
		 * The animation timer runs every *animationInterval* milliseconds, and switches
		 * the player's sprite image between two states, simulating a walking effect.
		 */

		animationTimer = new Timer();
		AnimationTask animationTask = new AnimationTask();
		animationTimer.scheduleAtFixedRate(animationTask, 0,animationInterval);

		// Set player's stats.
		setHp(hp);
		setLevel(level);
	}

	/***
	 * 
	 * This class is used by the timer to handle the player's walking animation.
	 * The method changes the animation stage between 1 and 2 - each stage has
	 * its own image, and this creates a 'walking' effect. 
	 * 
	 * @author bmagee
	 *
	 */

	class AnimationTask extends TimerTask
	{
		@Override
		public void run() {
			if(animationStage == 1)
			{
				//System.out.println("Animation stage updated to 2!");
				animationStage = 2;
			} else
			{
				//System.out.println("Animation stage updated to 1!");
				animationStage = 1;
			}
		}

	}
}
