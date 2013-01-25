package com.bm.jeu;

import javax.swing.ImageIcon;

/***
 * 
 * @author BMagee
 * 
 * This class is simply the struct for a player, it includes
 * the player's 'stats' or characteristics, and getter/setter methods for those
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
	private ImageIcon sprite;
	private int hp;
	private int level;
	
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
	
	public boolean _setSprite(ImageIcon sprite)
	{
		if(sprite != null)
		{
			this.sprite = sprite;
			return true;
		} 
		else 
		{
			return false; // Couldn't update sprite. Probably invalid sprite given.
		}		
	}
	
	public ImageIcon _getSprite()
	{
		return this.sprite;
	}
	
	public void spawn(int x, int y, int hp, int level, MapCanvas canvas)
	{
		// Draws the player at a certain position on the map, with 
		
	}
}
