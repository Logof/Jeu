package com.bm.jeu;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;

import com.badlogic.gdx.utils.Timer;

/***
 * 
 * @author BnMcG
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
		this.texture = textureHandle.getTexturePlayer(1, "down");
		this.setSize(32, 32);
		this.setPosition(30, 30);
	}

	public void setTexture(Texture texture) {
		this.texture = texture;
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
	private float playerX;
	private float playerY;
	private int speedX;
	private int speedY;

	/* Movement flags - in capitals as they are flags
	 When a flag is true and the appropriate method is called (eg: moveLeft()) - the player will continue
	 to move left until the flag is set to false again. */

	private boolean MOVING_LEFT;
	private boolean MOVING_RIGHT;
	private boolean MOVING_UP;
	private boolean MOVING_DOWN;

	private MovementTask taskMoveLeft;
	private MovementTask taskMoveRight;
	private MovementTask taskMoveUp;
	private MovementTask taskMoveDown;

	private ScheduledExecutorService movementTimer;
	private long movementInterval;

	private TextureHandler textures;
	private JeuSpriteBatch spriteBatch;

	// The stage in the movement animation. 
	// Controls changing between version one and two of a sprite.
	private int animationStage;
	private float animationInterval = 0.2f;
	private Timer animationTimer;

	// CONSTRUCTOR

	public Player(final TextureHandler textures) {
		this.textures = textures;

		spriteBatch = textures.getSpriteBatch();

		// Setup player's sprite:
		sprite = new PlayerSprite(textures.getTexturePlayer(1,"down"),textures);

		// Define Movement Actions:
		// =======================
		// =======================

		/*
		 * Define the movement timer, as well as the individual movement tasks.
		 * Each movement task moves the player in a different direction, as indicated
		 * by its argument.
		 * 
		 * When the key listener detects a keyDown event, it will schedule the task
		 * for the appropriate movement to run every *movementInterval* (eg: if the user presses 'w', 
		 * the timer will be scheduled to run taskMoveUp() every *movementInterval*). 
		 * 
		 * When the player releases the key, the timer is cancelled, and the player
		 * stops moving.
		 * 
		 * movementInterval can be changed the change how often the player moves.
		 */

		movementTimer = Executors.newScheduledThreadPool(1);
		movementInterval = 150;

		taskMoveLeft = new MovementTask("left");
		taskMoveRight = new MovementTask("right");
		taskMoveUp = new MovementTask("up");
		taskMoveDown = new MovementTask("down");

		this.addListener(new InputListener() {
			@Override
			public boolean keyDown(InputEvent event, int keycode) {
				switch(keycode) {
				case Keys.W:
					System.out.println("Key 'w' (MOVE_UP) pressed!");
					scheduleMovement("up");
					MOVING_UP = true;
					break;
				case Keys.A:
					System.out.println("Key 'a' (MOVE_LEFT) pressed!");
					scheduleMovement("left");
					MOVING_LEFT = true;
					break;
				case Keys.S:
					System.out.println("Key 's' (MOVE_DOWN) pressed!");
					scheduleMovement("down");
					MOVING_DOWN = true;
					break;
				case Keys.D:
					System.out.println("Key 'd' (MOVE_RIGHT) pressed!");
					scheduleMovement("right");
					MOVING_RIGHT = true;
					break;
				}

				return true;
			}

			// Key up
			@Override
			public boolean keyUp(InputEvent event, int keycode) {
				if(MOVING_RIGHT == true) {
					MOVING_RIGHT = false;
				}

				if(MOVING_LEFT == true) {
					MOVING_LEFT = false;
				}

				if(MOVING_UP == true) {
					MOVING_UP = false;
				}

				if(MOVING_DOWN == true) {
					MOVING_DOWN = false;
				}

				return true;
			}
		});
	}

	public void setLocation(float x, float y) {

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

	public float getPlayerX() {
		return playerX;
	}

	public float getPlayerY() {
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

	public void move(float x, float y, float oldX, float oldY)
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
		float currentX = 0;

		if(animationStage == 1)
		{
			sprite.setTexture(textures.getTexturePlayer(2, "left"));
		}

		if(animationStage == 2)
		{
			sprite.setTexture(textures.getTexturePlayer(1, "left"));
		}

		currentX = playerX;
		playerX = playerX - (speedX * Gdx.graphics.getDeltaTime());
		move(playerX, playerY, currentX, playerY);
		System.out.println("Moved left!");
	}

	public void moveRight() {
		float currentX = 0;

		if(animationStage == 1)
		{
			sprite.setTexture(textures.getTexturePlayer(2, "right"));
		}

		if(animationStage == 2)
		{
			sprite.setTexture(textures.getTexturePlayer(1, "right"));
		}

		currentX = playerX;
		playerX = playerX + (speedX * Gdx.graphics.getDeltaTime());
		move(playerX,playerY,currentX,playerY);
	}

	public void moveUp() {
		float currentY = 0;

		if(animationStage == 1)
		{
			sprite.setTexture(textures.getTexturePlayer(2, "up"));
		}

		if(animationStage == 2)
		{
			sprite.setTexture(textures.getTexturePlayer(1, "up"));
		}
		currentY = playerY;
		playerY = playerY + (speedY * Gdx.graphics.getDeltaTime());
		move(playerX,playerY,playerX,currentY);
	}

	public void moveDown() {
		float currentY = 0;

		if(animationStage == 1)
		{
			sprite.setTexture(textures.getTexturePlayer(2, "down"));
		}

		if(animationStage == 2)
		{
			sprite.setTexture(textures.getTexturePlayer(1,"down"));
		}

		currentY = playerY;
		playerY = playerY - (speedY * Gdx.graphics.getDeltaTime());
		move(playerX,playerY,playerX,currentY);	
	}

	private void scheduleMovement(String direction) {
		if(direction.equals("up")) {
			if(MOVING_UP == false) {
				movementTimer.scheduleAtFixedRate(taskMoveUp, 0, movementInterval,TimeUnit.MILLISECONDS);
			}

			if(MOVING_DOWN == false) {
				movementTimer.scheduleAtFixedRate(taskMoveDown, 0, movementInterval,TimeUnit.MILLISECONDS);
			}

			if(MOVING_LEFT == false) {
				movementTimer.scheduleAtFixedRate(taskMoveLeft, 0, movementInterval,TimeUnit.MILLISECONDS);
			}

			if(MOVING_RIGHT == false) {
				movementTimer.scheduleAtFixedRate(taskMoveRight, 0, movementInterval,TimeUnit.MILLISECONDS);
			}
		}
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

		/* Add the player to the render queue for players. The player should now be rendered
		 * each frame. We don't need to call this again each time we update the texture when animating, because
		 * we pass an instance of the player to the render queue, and not the individual texture itself! */

		spriteBatch.addToPlayerRenderQueue(this);


		/*
		 * The animation timer runs every *animationInterval* milliseconds, and switches
		 * the player's sprite image between two states, simulating a walking effect.
		 */

		animationTimer = new Timer();
		AnimationTask animationTask = new AnimationTask();
		animationTimer.scheduleTask(animationTask, 0, animationInterval);
		animationTimer.start();

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
	 * @author BnMcG
	 *
	 */

	class AnimationTask extends Timer.Task
	{
		@Override
		public void run() {
			if(animationStage == 1)
			{
				animationStage = 2;
			} else
			{
				animationStage = 1;
			}
		}

	}

	/***
	 * This class is ued by a timer to move the player in the given direction every 100ms
	 * while they hold the appropriate key down. When the key is released, the timer stops,
	 * and the player stops moving.
	 * 
	 * @author BnMcG
	 *
	 */

	class MovementTask implements Runnable
	{
		private String direction;
		public MovementTask(String direction) {
			this.direction = direction;
		}

		@Override
		public void run() {
			switch(direction) {
			case "left":
				moveLeft();
				break;
			case "right":
				moveRight();
				break;
			case "up":
				moveUp();
				break;
			case "down":
				moveDown();
				break;
			}
		}
	}
}
