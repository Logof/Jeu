package com.bm.jeu.guitest;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.FPSLogger;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.bm.jeu.common.ef.Entity;
import com.bm.jeu.common.ef.EntityManager;
import com.bm.jeu.common.ef.MachineManager;
import com.bm.jeu.common.ef.MovementComponent;
import com.bm.jeu.common.ef.MovementMachine;
import com.bm.jeu.common.ef.PositionComponent;

public class PlayScreen extends GameScreen<Tester> {
	
	private Label testlabel;
	private Entity ent;
	private FPSLogger fps;
	private EntityManager em_;

	public PlayScreen(Tester game) {
		super(game);
		fps = new FPSLogger();
		em_=EntityManager.getinstance();
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
		if(Gdx.input.isKeyPressed(Input.Keys.UP)){
			ent.addComponent(new MovementComponent(2));
		}
		else if(Gdx.input.isKeyPressed(Input.Keys.DOWN)){
			ent.addComponent(new MovementComponent(-2));
		}
		else if(Gdx.input.isKeyPressed(Input.Keys.RIGHT)){
			ent.addComponent(new MovementComponent(1));
		}
		else if(Gdx.input.isKeyPressed(Input.Keys.LEFT)){
			ent.addComponent(new MovementComponent(-1));
		}
		else {
			ent.addComponent(new MovementComponent(0));
		}
		MachineManager.getinstance().update(arg0);
		spritebatch.begin();
		while(!draw_.isEmpty()){
			Entity buff = em_.get(draw_.poll());
			PositionComponent pos = (PositionComponent) buff.getComponent(PositionComponent.class);
			SpriteComponent spr = (SpriteComponent) buff.getComponent(SpriteComponent.class);
			spritebatch.draw(spr.getSprite(arg0), pos.getPosX(), pos.getPosY());
		}
		spritebatch.end();
//		fps.log();
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
		ent = new Entity();
		MachineManager.getinstance().add(new MovementMachine());
		MachineManager.getinstance().add(new DrawingMachine(this));

		ent.addComponent(new MovementComponent(0));
		ent.addComponent(new PositionComponent(0, 0));
		ent.addComponent(new SpriteComponent());
		BitmapFont testfont = new BitmapFont(Gdx.files.internal("res/font/dragonfly.fnt"), false);
		testlabel = new Label("Play", new Label.LabelStyle(testfont, Color.RED));
		testlabel.setPosition(100, 200);		
		
	}

}

