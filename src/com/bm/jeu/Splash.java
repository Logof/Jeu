package com.bm.jeu;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.MalformedURLException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

import org.lwjgl.opengl.Display;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Splash implements Screen {
	static Timer launcherDisplaySequence;
	static Splash launcher;
	static JeuClient displayF;

	// DEBUG VARIABLES
	static int SKIP_LAUNCHER_SPLASH = 0;
	static int SHOW_LAUNCH_TRACE = 0;
	
	private JeuGameInstance game;

	Splash(JeuGameInstance game)
	{
		this.game = game;
	}

	static class TimerTask implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
		}

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(float arg0) {
		game.setScreen(new Menu(game));
	}

	@Override
	public void resize(int arg0, int arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
} 