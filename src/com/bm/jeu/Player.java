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

import com.bm.jeu.canvases.GenericCanvas;
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

public class Player {
	// Player characteristics / variables
	private Sprite sprite;
	private int hp;
	private int level;
	private int playerX;
	private int playerY;
	private int speedX;
	private int speedY;
	private GenericCanvas mapcanvas;
	
	private RemoteHandler remote;

	// The stage in the movement animation. 
	// Controls changing between version one and two of a sprite.
	private int animationStage;
	private int animationInterval = 200;
	private Timer animationTimer;

	// Keymap
	// Used to map key presses to specific actions
	// eg: walking left/right, etc.

	InputMap playerKeyMap;
	ActionMap playerActionMap;

	// CONSTRUCTOR

	public Player(PlayerCanvas parentCanvas, RemoteHandler remote) {
		this.remote = remote;
		// Initialise keymap:
		System.out.println("Begin initalising key bindings...");
		playerKeyMap = new InputMap();
		playerKeyMap = parentCanvas.getInputMap(JComponent.WHEN_FOCUSED);
		playerActionMap = new ActionMap();
		playerActionMap = parentCanvas.getActionMap();

		// Define Movement Actions:
		// =======================
		// =======================
		
		System.out.println("Defining actions to carry out...");
		
		// Move Left
		playerActionMap.put("MOVELEFT", new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int currentX = 0;

				if(animationStage == 1)
				{
					sprite._setSpriteImage(getClass().getClassLoader().getResource("sprites/sprite_lf2.png"));
				}

				if(animationStage == 2)
				{
					sprite._setSpriteImage(getClass().getClassLoader().getResource("sprites/sprite_lf1.png"));
				}

				currentX = playerX;
				playerX = playerX - speedX;
				move(playerX, playerY, currentX, playerY);
			}
		});

		// Move Right
		playerActionMap.put("MOVERIGHT", new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int currentX = 0;
				if(animationStage == 1)
				{
					sprite._setSpriteImage(getClass().getClassLoader().getResource("sprites/sprite_rt2.png"));
				}

				if(animationStage == 2)
				{
					sprite._setSpriteImage(getClass().getClassLoader().getResource("sprites/sprite_rt1.png"));
				}

				currentX = playerX;
				playerX = playerX + speedX;
				move(playerX,playerY,currentX,playerY);
			}
		});

		// Move Up
		playerActionMap.put("MOVEUP", new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int currentY = 0;

				if(animationStage == 1)
				{
					sprite._setSpriteImage(getClass().getClassLoader().getResource("sprites/sprite_bk2.png"));
				}

				if(animationStage == 2)
				{
					sprite._setSpriteImage(getClass().getClassLoader().getResource("sprites/sprite_bk1.png"));
				}

				currentY = playerY;
				playerY = playerY - speedY;
				move(playerX,playerY,playerX,currentY);
			} 
		});
		
		// Move down
		playerActionMap.put("MOVEDOWN", new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int currentY = 0;
				if(animationStage == 1)
				{
					sprite._setSpriteImage(getClass().getClassLoader().getResource("sprites/sprite_fr2.png"));
				}

				if(animationStage == 2)
				{
					sprite._setSpriteImage(getClass().getClassLoader().getResource("sprites/sprite_fr1.png"));
				}
				currentY = playerY;
				playerY = playerY + speedY;
				move(playerX,playerY,playerX,currentY);
			}
		});
		
		// Running
		playerActionMap.put("RUN", new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				_setSpeedX(4);
				_setSpeedY(4);
			}
		});
		
		// Bind actions to keys
		System.out.println("Attempting to bind keys to actions....");
		
		// Arrow Keys
		playerKeyMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_LEFT, 0, false), "MOVELEFT"); // Move left
		playerKeyMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_RIGHT, 0, false), "MOVERIGHT"); // Move right
		playerKeyMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_DOWN, 0, false), "MOVEDOWN");
		playerKeyMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_UP, 0, false), "MOVEUP");
		
		// WASD
		playerKeyMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_W, 0, false), "MOVEUP"); // Move up
		playerKeyMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_A, 0, false), "MOVELEFT"); // Move left
		playerKeyMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_S, 0, false), "MOVEDOWN"); // Move right
		playerKeyMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_D, 0, false), "MOVERIGHT"); // Move down

		// Running
		playerKeyMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_SHIFT, 0, false), "RUN"); // RUN!
		
		// Debug output
		System.out.println("KEY BINDINGS INITIALISED SUCCESSFULLY.");

	}

	// Getter/setter methods
	// *********************
	public boolean _setHp(int hp)
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

	public int _getHp()
	{
		return hp; // Return the player's current HP to the calling method.
	}

	public boolean _setLevel(int level)
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

	public int _getLevel()
	{
		return this.level;
	}

	public boolean _setName(String name)
	{
		if(name != null)
		{
			sprite._setSpriteLabel(name);
			return true;
		}
		else
		{
			return false;
		}
	}

	public String _getName()
	{
		return sprite._getSpriteLabel();
	}

	public boolean _setSpriteImage(URL spriteSourceImageURL)
	{
		if(spriteSourceImageURL != null)
		{
			sprite._setSpriteImage(spriteSourceImageURL);
			return true;
		} 
		else 
		{
			return false; // Couldn't update sprite. Probably invalid sprite given.
		}		
	}

	public Sprite _getSprite()
	{
		return sprite;
	}

	public boolean _setSprite(Sprite sprite)
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

	public boolean _setSpeedY(int speedY)
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

	public int _getSpeedY()
	{
		return this.speedY;
	}

	public boolean _setSpeedX(int speedX)
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
	
	public int _getX() {
		return playerX;
	}
	
	public int _getY() {
		return playerY;
	}

	public boolean _setMapCanvas(GenericCanvas mapcanvas)
	{
		if(mapcanvas != null)
		{
			this.mapcanvas = mapcanvas;
			return true;
		}
		else
		{
			return false;
		}
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
				if(remote.isConnected() == true) {
					remote.updatePlayerPosition(x, y);
				}
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
					if(remote.isConnected() == true) {
						remote.updatePlayerPosition(x, y);
					}
				}

				if( x <= 20)
				{
					playerX = playerX + speedX;
					x = playerX;
					sprite.setLocation(x,y);
					if(remote.isConnected() == true) {
						remote.updatePlayerPosition(x, y);
					}
				}

				if(y >= 460)
				{
					playerY = playerY - speedY;
					y = playerY;
					sprite.setLocation(x,y);
					if(remote.isConnected() == true) {
						remote.updatePlayerPosition(x, y);
					}
				}

				if(y <= 20)
				{
					playerY = playerY + speedY;
					y = playerY;
					sprite.setLocation(x,y);
					if(remote.isConnected() == true) {
						remote.updatePlayerPosition(x, y);
					}
				}
			}
		}

		if(playerY != oldY)
		{
			if(y < 460 && y > 20 && x > 20 && x < 870)
			{
				sprite.setLocation(x,y);
				if(remote.isConnected() == true) {
					remote.updatePlayerPosition(x, y);
				}
			}
			else
			{
				// Rebound slightly
				if(x >= 870)
				{
					playerX = playerX - speedX;
					x = playerX;
					sprite.setLocation(x,y);
					if(remote.isConnected() == true) {
						remote.updatePlayerPosition(x, y);
					}
				}

				if( x <= 20)
				{
					playerX = playerX + speedX;
					x = playerX;
					sprite.setLocation(x,y);
					if(remote.isConnected() == true) {
						remote.updatePlayerPosition(x, y);
					}
				}

				if(y >= 460)
				{
					playerY = playerY - speedY;
					y = playerY;
					sprite.setLocation(x,y);
					if(remote.isConnected() == true) {
						remote.updatePlayerPosition(x, y);
					}
				}

				if(y <= 20)
				{
					playerY = playerY + speedY;
					y = playerY;
					sprite.setLocation(x,y);
					if(remote.isConnected() == true) {
						remote.updatePlayerPosition(x, y);
					}
				}
			}
		}
	}

	public void spawn(int x, int y, int hp, int level, PlayerCanvas playercanvas, MapFrame mframe)
	{
		// Draws the player at a certain position on the map.
		// Since as far as the user is concerned, the player is 
		// essentially just a sprite, most of this function just
		// manipulates the sprite's position on the map canvas.
		playercanvas.add(_getSprite());
		_getSprite().setVisible(true);
		move(x,y,50,50);
		playerX = x;
		playerY = y;
		
		// Animation timer controls when the player's legs should move.
		// Every *animationInterval*, it switches the current image.
		
		animationTimer = new Timer();
		AnimationTask animationTask = new AnimationTask();
		animationTimer.scheduleAtFixedRate(animationTask, 0,animationInterval);

		// Set player's stats.
		_setHp(hp);
		_setLevel(level);
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
