package com.bm.jeu.guitest;

import java.util.Map.Entry;
import java.util.Random;
import java.util.UUID;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.FPSLogger;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.bm.jeu.common.ef.Component;
import com.bm.jeu.common.ef.Entity;
import com.bm.jeu.common.ef.EntityManager;
import com.bm.jeu.common.ef.Machine;
import com.bm.jeu.common.ef.MachineManager;
import com.bm.jeu.common.ef.MovementComponent;
import com.bm.jeu.common.ef.MovementMachine;
import com.bm.jeu.common.ef.PositionComponent;

public class PlayScreen extends GameScreen<Tester> {
	
	private FPSLogger fps;
	private EntityManager em_;
	private Machine relay;

	public PlayScreen(Tester game) {
		super(game);
		fps = new FPSLogger();
		em_=EntityManager.getinstance();
		InputMachine input = new InputMachine();
		relay = new RelayMachine();
		MachineManager.getinstance().add(input);
		Gdx.input.setInputProcessor(input);
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
		MachineManager.getinstance().update(arg0);
		spritebatch.begin();
		for(Entity buff : relay.getEntities()){
			PositionComponent pos = (PositionComponent) buff.getComponent(PositionComponent.class);
			SpriteComponent spr = (SpriteComponent) buff.getComponent(SpriteComponent.class);
			spritebatch.draw(spr.getSprite(arg0), pos.getPosX(), pos.getPosY());
		}
//		while(!draw_.isEmpty()){
//			Entity buff = em_.get(draw_.poll());
//			PositionComponent pos = (PositionComponent) buff.getComponent(PositionComponent.class);
//			SpriteComponent spr = (SpriteComponent) buff.getComponent(SpriteComponent.class);
//			spritebatch.draw(spr.getSprite(arg0), pos.getPosX(), pos.getPosY());
//		}
		spritebatch.end();
		fps.log();
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
		MachineManager.getinstance().add(new MovementMachine());
		MachineManager.getinstance().add(relay);
		
		for(int i=0; i<50;i++){
			addOne();
		}
	}
	
	public void addOne(){
		Random rand = new Random();
		Entity creator = new Entity();
		creator.addComponent(new MovementComponent(0));
		creator.addComponent(new SpriteComponent());
		creator.addComponent(new PositionComponent(rand.nextFloat() * 750, rand.nextFloat() * 400));
	}

}

