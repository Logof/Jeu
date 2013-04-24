package com.bm.jeu.guitest;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.scenes.scene2d.ui.Label;

public class MainMenuScreen extends GameScreen<Tester> {

	private Label testlabel;

	public MainMenuScreen(Tester game) {
		super(game);
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		System.out.println("hiding");
//		spritebatch.dispose();
		clear();
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(float arg0) {
		clear();
		spritebatch.begin();
		testlabel.draw(spritebatch, 1);
		if(Gdx.input.isKeyPressed(Input.Keys.ENTER)){
			game.setScreen(game.play);
		}
		spritebatch.end();
	}

	@Override
	public void resize(int arg0, int arg1) {
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		BitmapFont testfont = new BitmapFont(Gdx.files.internal("res/font/dragonfly.fnt"), false);
		testlabel = new Label("Press Enter", new Label.LabelStyle(testfont, Color.RED));
		testlabel.setPosition(100, 200);		
		
	}

}

