package com.bm.jeu;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

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
	private ImageIcon spriteSrc;
	private Sprite sprite;
	private int hp;
	private int level;
	private MapCanvas mapcanvas;
	
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
	public void teleport(int x, int y)
	{
		sprite.setLocation(x, y);
	}
	
	public void spawn(int x, int y, int hp, int level, MapCanvas mapcanvas)
	{
		// Draws the player at a certain position on the map, with 
		mapcanvas.add(_getSprite());
		teleport(x,y);
		
		// Set player's characteristics.
		this.hp = hp;
		this.level = level;
	}
}
