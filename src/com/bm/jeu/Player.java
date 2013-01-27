package com.bm.jeu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
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

public class Player implements KeyListener {
	// Player characteristics / variables
	private Sprite sprite;
	private int hp;
	private int level;
	private int playerX;
	private int playerY;
	private int speedX;
	private int speedY;
	private MapCanvas mapcanvas;

	// The stage in the movement animation. 
	// Controls changing between version one and two of a sprite.
	private int animationStage;
	private int animationInterval = 200;
	private Timer animationTimer;

	// Key constants
	// These are changed when the applicable 
	// key is pressed down/released.
	private boolean keyDownCtrl = false;
	private boolean keyDownLeft = false;
	private boolean keyDownRight = false;
	private boolean keyDownUp = false;
	private boolean keyDownDown = false;
	private boolean keyDownW = false;
	private boolean keyDownA = false;
	private boolean keyDownS = false;
	private boolean keyDownD = false;

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

	public boolean _setSpriteImage(String pathToSpriteSourceImage)
	{
		if(pathToSpriteSourceImage != null)
		{
			sprite._setSpriteImage(pathToSpriteSourceImage);
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

	public boolean _setMapCanvas(MapCanvas mapcanvas)
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

	public void spawn(int x, int y, int hp, int level, MapCanvas mapcanvas, MapFrame mframe)
	{
		// Draws the player at a certain position on the map.
		// Since as far as the user is concerned, the player is 
		// essentially just a sprite, most of this function just
		// manipulates the sprite's position on the map canvas.
		mapcanvas.add(_getSprite());
		mframe.addKeyListener(this);
		_getSprite().setVisible(true);
		move(x,y,50,50);
		playerX = x;
		playerY = y;

		animationTimer = new Timer();
		AnimationTask animationTask = new AnimationTask();
		animationTimer.scheduleAtFixedRate(animationTask, 0,animationInterval);

		// Set player's stats.
		_setHp(hp);
		_setLevel(level);
	}

	/* Event Handlers that control player movement.
	 * The player is able to move with WASD or the arrow keys.
	 * If you want to add any other custom keys for custom actions (eg: attack/jump)
	 * then add them in the method below.
	 * 
	 * When the player is added to the map via the MapFrame class, the a KeyListener
	 * event is added to the MapFrame that points towards the player.
	 */

	@Override
	public void keyPressed(KeyEvent key) 
	{
		// Switch statement that looks out for specific keys we're interested in being pressed
		// and then changes their key constant to true if detected.
		//
		// There is an equivalent of this method in keyReleased() to check if any hotkeys have been
		// released.
		switch(key.getKeyCode())
		{
		// Control key
		case KeyEvent.VK_CONTROL:
			keyDownCtrl = true;
			System.out.println("CTRL Key Down!");
			break;
		//'W' key and up arrow.
		case KeyEvent.VK_W:
			keyDownW = true;
			System.out.println("W Key Down!");
			break;
		case KeyEvent.VK_UP:
			keyDownUp = true;
			System.out.println("Up Arrow Key Down!");
			break;
		//'A' key and left arrow.
		case KeyEvent.VK_A:
			keyDownA = true;
			System.out.println("'A' Key Down!");
			break;
		case KeyEvent.VK_LEFT:
			keyDownLeft = true;
			System.out.println("Left Arrow Key Down!");
			break;
		//'S' key and down arrow.
		case KeyEvent.VK_S:
			keyDownS = true;
			System.out.println("'S' Arrow Key Down!");
			break;
		case KeyEvent.VK_DOWN:
			keyDownDown = true;
			System.out.println("Down Arrow Key Down!");
			break;
		//'D' key and right arrow.
		case KeyEvent.VK_D:
			keyDownD = true;
			System.out.println("'D' Key Down!");
			break;
		case KeyEvent.VK_RIGHT:
			keyDownRight = true;
			System.out.println("Right Arrow Key Down!");
			break;
		}
		
		/// These variables are passed to the move() method, and allow for bounds
		/// checking (ie: if the player is about to walk off of the map or not).
		/// ********************************************************************
		int currentX; // The X coordinate of the player's sprite BEFORE the move is executed.
		int currentY; // The Y coordinate of the player's sprite BEFORE the move is executed.
		
		
		
		/* LEFT IN DIRECTION
		 * 
		 */
		
		// Keys applicable to running left:
		if(keyDownCtrl == true && keyDownLeft == true || keyDownCtrl == true && keyDownA == true)
		{
			this._setSpeedX(4);
			this._setSpeedY(4);
			
			if(animationStage == 1)
			{
				sprite._setSpriteImage(sprite.getSpritePathFromURL(getClass().getResource("/sprite_lf2.png")));
			}

			if(animationStage == 2)
			{
				sprite._setSpriteImage(sprite.getSpritePathFromURL(getClass().getResource("/sprite_lf1.png")));
			}

			currentX = playerX;
			playerX = playerX - speedX;
			move(playerX, playerY, currentX, playerY);
		}
		
		// Keys applicable to walking left:
		if(keyDownLeft == true|| keyDownA == true)
		{	
			if(animationStage == 1)
			{
				sprite._setSpriteImage(sprite.getSpritePathFromURL(getClass().getResource("/sprite_lf2.png")));
			}

			if(animationStage == 2)
			{
				sprite._setSpriteImage(sprite.getSpritePathFromURL(getClass().getResource("/sprite_lf1.png")));
			}

			currentX = playerX;
			playerX = playerX - speedX;
			move(playerX, playerY, currentX, playerY);
		}

		/* RIGHT IN DIRECTION
		 * 
		 */
		
		// Keys applicable to running right:
		if(keyDownCtrl == true && keyDownRight == true || keyDownCtrl == true && keyDownD == true)
		{
			this._setSpeedX(4);
			this._setSpeedY(4);
			
			if(animationStage == 1)
			{
				sprite._setSpriteImage(sprite.getSpritePathFromURL(getClass().getResource("/sprite_rt2.png")));
			}

			if(animationStage == 2)
			{
				sprite._setSpriteImage(sprite.getSpritePathFromURL(getClass().getResource("/sprite_rt1.png")));
			}

			currentX = playerX;
			playerX = playerX + speedX;
			move(playerX, playerY, currentX, playerY);
		}
		
		// Keys applicable to walking right:
		if(key.getKeyCode() == KeyEvent.VK_RIGHT || key.getKeyCode() == KeyEvent.VK_D)
		{
			if(animationStage == 1)
			{
				sprite._setSpriteImage(sprite.getSpritePathFromURL(getClass().getResource("/sprite_rt2.png")));
			}

			if(animationStage == 2)
			{
				sprite._setSpriteImage(sprite.getSpritePathFromURL(getClass().getResource("/sprite_rt1.png")));
			}

			currentX = playerX;
			playerX = playerX + speedX;
			move(playerX,playerY,currentX,playerY);
		}
		
		/* UPWARDS IN DIRECTION
		 * 
		 */
		
		// Run upwards
		if(keyDownCtrl == true && keyDownUp == true || keyDownCtrl == true && keyDownW == true)
		{
			this._setSpeedX(4);
			this._setSpeedY(4);
			
			if(animationStage == 1)
			{
				sprite._setSpriteImage(sprite.getSpritePathFromURL(getClass().getResource("/sprite_lf2.png")));
			}

			if(animationStage == 2)
			{
				sprite._setSpriteImage(sprite.getSpritePathFromURL(getClass().getResource("/sprite_lf1.png")));
			}

			currentY = playerY;
			playerY = playerY - speedX;
			move(playerX, playerY, playerX, currentY);
		}

		// Walk upwards
		if(keyDownUp == true || keyDownW == true)
		{
			if(animationStage == 1)
			{
				sprite._setSpriteImage(sprite.getSpritePathFromURL(getClass().getResource("/sprite_bk2.png")));
			}

			if(animationStage == 2)
			{
				sprite._setSpriteImage(sprite.getSpritePathFromURL(getClass().getResource("/sprite_bk1.png")));
			}

			currentY = playerY;
			playerY = playerY - speedY;
			move(playerX,playerY,playerX,currentY);
		}
		
		/* DOWNWARDS IN DIRECTION
		 * 
		 */
		
		// Run downwards
		if(keyDownCtrl == true && keyDownDown == true || keyDownCtrl == true && keyDownS == true)
		{
			this._setSpeedX(4);
			this._setSpeedY(4);
			
			if(animationStage == 1)
			{
				sprite._setSpriteImage(sprite.getSpritePathFromURL(getClass().getResource("/sprite_lf2.png")));
			}

			if(animationStage == 2)
			{
				sprite._setSpriteImage(sprite.getSpritePathFromURL(getClass().getResource("/sprite_lf1.png")));
			}

			currentY = playerY;
			playerY = playerY + speedY;
			move(playerX, playerY, playerX, currentY);
		}

		// Walk downwards
		if(keyDownDown == true || keyDownS == true)
		{
			if(animationStage == 1)
			{
				sprite._setSpriteImage(sprite.getSpritePathFromURL(getClass().getResource("/sprite_fr2.png")));
			}

			if(animationStage == 2)
			{
				sprite._setSpriteImage(sprite.getSpritePathFromURL(getClass().getResource("/sprite_fr1.png")));
			}
			currentY = playerY;
			playerY = playerY + speedY;
			move(playerX,playerY,playerX,currentY);
		}
	}

	@Override
	public void keyReleased(KeyEvent key) {
		
		// Switch statement that looks out for specific keys we're interested in being released
		// and then changes their key constant to false if detected.
		//
		// There is an equivalent of this method in keyPressed() to check if any hotkeys have been
		// pressed.
		switch(key.getKeyCode())
		{
		// Control key
		case KeyEvent.VK_CONTROL:
			keyDownCtrl = false;
			System.out.println("CTRL Key Up!");
			break;
		//'W' key and up arrow.
		case KeyEvent.VK_W:
			keyDownW = false;
			System.out.println("W Key Up!");
			break;
		case KeyEvent.VK_UP:
			keyDownUp = false;
			System.out.println("Up Arrow Key Up!");
			break;
		//'A' key and left arrow.
		case KeyEvent.VK_A:
			keyDownA = false;
			System.out.println("'A' Key Up!");
			break;
		case KeyEvent.VK_LEFT:
			keyDownLeft = false;
			System.out.println("Left Arrow Key Up!");
			break;
		//'S' key and down arrow.
		case KeyEvent.VK_S:
			keyDownS = false;
			System.out.println("'S' Arrow Key Up!");
			break;
		case KeyEvent.VK_DOWN:
			keyDownDown = false;
			System.out.println("Down Arrow Key Up!");
			break;
		//'D' key and right arrow.
		case KeyEvent.VK_D:
			keyDownD = false;
			System.out.println("'D' Key Up!");
			break;
		case KeyEvent.VK_RIGHT:
			keyDownRight = false;
			System.out.println("Right Arrow Key Up!");
			break;
		}
		
		if(keyDownCtrl == false)
		{
			_setSpeedX(3);
			_setSpeedY(3);
		}
		
		if(key.getKeyCode() == KeyEvent.VK_LEFT || key.getKeyCode() == KeyEvent.VK_A)
		{
			sprite._setSpriteImage(sprite.getSpritePathFromURL(getClass().getResource("/sprite_lf2.png")));
		}

		if(key.getKeyCode() == KeyEvent.VK_RIGHT || key.getKeyCode() == KeyEvent.VK_D)
		{
			sprite._setSpriteImage(sprite.getSpritePathFromURL(getClass().getResource("/sprite_rt2.png")));
		}

		if(key.getKeyCode() == KeyEvent.VK_UP || key.getKeyCode() == KeyEvent.VK_W)
		{
			sprite._setSpriteImage(sprite.getSpritePathFromURL(getClass().getResource("/sprite_bk2.png")));
		}

		if(key.getKeyCode() == KeyEvent.VK_DOWN || key.getKeyCode() == KeyEvent.VK_S)
		{
			sprite._setSpriteImage(sprite.getSpritePathFromURL(getClass().getResource("/sprite_fr2.png")));

		}
	}

	@Override
	public void keyTyped(KeyEvent key) {
		// TODO Auto-generated method stub

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
