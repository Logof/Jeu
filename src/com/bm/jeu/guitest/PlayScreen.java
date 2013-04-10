package com.bm.jeu.guitest;

import java.util.Random;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.FPSLogger;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;

import com.badlogic.gdx.Gdx;
import com.bm.jeu.common.ef.Entity;
import com.bm.jeu.common.ef.Machine;
import com.bm.jeu.common.ef.MachineManager;
import com.bm.jeu.common.ef.MovementComponent;
import com.bm.jeu.common.ef.MovementMachine;
import com.bm.jeu.common.ef.PositionComponent;

public class PlayScreen extends GameScreen<Tester> {
	
	private FPSLogger fps;
	private Machine relay;

	public PlayScreen(Tester game) {
		super(game);
		fps = new FPSLogger();
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
//			TextureRegion reg = spr.getSprite(arg0);
//			spritebatch.draw(reg, pos.getPosX(), pos.getPosY());
			spr.draw(spritebatch, pos.getPosX(), pos.getPosY(), arg0);
		}
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

