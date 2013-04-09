package com.bm.jeu.guitest;

import com.bm.jeu.common.ef.Entity;
import com.bm.jeu.common.ef.Machine;

public class DrawingMachine extends Machine {
	
	private GameScreen screen;
	
	public DrawingMachine(GameScreen Screen) {
		addInterest(SpriteComponent.class);
		this.screen = Screen;
	}

	@Override
	public void processEntities(Entity entity) {
		SpriteComponent sprc = (SpriteComponent) entity.getComponent(SpriteComponent.class);
		if(sprc != null){
			screen.queueDrawable(sprc.getENTITYID());
		}
		
		

	}

}
