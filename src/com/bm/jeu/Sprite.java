package com.bm.jeu;

import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Sprite extends JLabel {
	private ImageIcon image;
	private String label;
	
	public Sprite()
	{
		image = new ImageIcon();
		setSize(64,64);
		
		// Align the player's name centred and below their sprite:
		setHorizontalTextPosition(JLabel.CENTER);
		setVerticalTextPosition(JLabel.BOTTOM);
	}
	
	public boolean _setSpriteLabel(String label)
	{
		if(label != null)
		{
			this.label = label;
			this.setText(label);
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public String _getSpriteLabel()
	{
		return label;
	}
	
	public boolean _setSpriteImage(URL spriteURL)
	{
		if(image != null)
		{
			this.setIcon(new ImageIcon(spriteURL));
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public ImageIcon _getSpriteImage()
	{
		return (ImageIcon) this.getIcon();
	}
	
	public String getSpritePathFromURL(URL url)
	{
		String path = url.toString();
		path = path.replace("file:/", "");
		return path;
	}
}
