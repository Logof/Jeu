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

import com.bm.jeu.canvases.PlayerCanvas;
import com.bm.jeu.controls.Sprite;

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

public class RemotePlayer {
	// Player characteristics / variables
	private Sprite sprite;
	private int hp;
	private int level;
	private int playerX;
	private int playerY;
	private int speedX;
	private int speedY;

	// The stage in the movement animation. 
	// Controls changing between version one and two of a sprite.
	private int animationStage;
	private int animationInterval = 200;
	private Timer animationTimer;

	// CONSTRUCTOR

	public RemotePlayer(PlayerCanvas parentCanvas) {
		System.out.println("Begin initalising new remote player...");
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

	public boolean setName(String name)
	{
		if(name != null)
		{
			sprite.setSpriteLabel(name);
			return true;
		}
		else
		{
			return false;
		}
	}

	public String getName()
	{
		return sprite.getSpriteLabel();
	}

	public boolean setSpriteImage(URL spriteSourceImageURL)
	{
		if(spriteSourceImageURL != null)
		{
			sprite.setSpriteImage(spriteSourceImageURL);
			return true;
		} 
		else 
		{
			return false; // Couldn't update sprite. Probably invalid sprite given.
		}		
	}

	public Sprite getSprite()
	{
		return sprite;
	}

	public boolean setSprite(Sprite sprite)
	{
		if(sprite != null)
		{
			this.sprite = sprite;
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
	
	public int getX() {
		return playerX;
	}
	
	public int getY() {
		return playerY;
	}


	// Interaction methods
	// *******************
	public void move(int x, int y, int oldX, int oldY)
	{
		if(playerX != oldX)
		{
			if(x < 870 && x > 20 && y < 460 && y > 20)
			{
				sprite.setLocation(x, y);
				sprite.revalidate();
				sprite.repaint();
			}
			else
			{
				// Rebound slightly
				if(x >= 870)
				{
					playerX = playerX - speedX;
					x = playerX;
					sprite.setLocation(x,y);
				}

				if( x <= 20)
				{
					playerX = playerX + speedX;
					x = playerX;
					sprite.setLocation(x,y);
				}

				if(y >= 460)
				{
					playerY = playerY - speedY;
					y = playerY;
					sprite.setLocation(x,y);
				}

				if(y <= 20)
				{
					playerY = playerY + speedY;
					y = playerY;
					sprite.setLocation(x,y);
				}
			}
		}

		if(playerY != oldY)
		{
			if(y < 460 && y > 20 && x > 20 && x < 870)
			{
				sprite.setLocation(x,y);
			}
			else
			{
				// Rebound slightly
				if(x >= 870)
				{
					playerX = playerX - speedX;
					x = playerX;
					sprite.setLocation(x,y);
				}

				if( x <= 20)
				{
					playerX = playerX + speedX;
					x = playerX;
					sprite.setLocation(x,y);
				}

				if(y >= 460)
				{
					playerY = playerY - speedY;
					y = playerY;
					sprite.setLocation(x,y);
				}

				if(y <= 20)
				{
					playerY = playerY + speedY;
					y = playerY;
					sprite.setLocation(x,y);
				}
			}
		}
	}

	public void spawn(int x, int y, int hp, int level, PlayerCanvas playercanvas)
	{
		// Draws the player at a certain position on the map.
		// Since as far as the user is concerned, the player is 
		// essentially just a sprite, most of this function just
		// manipulates the sprite's position on the map canvas.
		playercanvas.add(getSprite());
		getSprite().setVisible(true);
		move(x,y,50,50);
		playerX = x;
		playerY = y;
		
		// Animation timer controls when the player's legs should move.
		// Every *animationInterval*, it switches the current image.
		
		animationTimer = new Timer();
		AnimationTask animationTask = new AnimationTask();
		animationTimer.scheduleAtFixedRate(animationTask, 0,animationInterval);

		// Set player's stats.
		setHp(hp);
		setLevel(level);
	}

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
