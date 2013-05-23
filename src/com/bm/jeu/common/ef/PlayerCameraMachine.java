package com.bm.jeu.common.ef;

import com.badlogic.gdx.graphics.OrthographicCamera;

public class PlayerCameraMachine extends Machine {
	private OrthographicCamera cam;

	public PlayerCameraMachine(OrthographicCamera camera) {
		cam = camera;
		addInterest(PlayerComponent.class);
		addInterest(PositionComponent.class);
	}

	@Override
	public void processEntities(Entity entity) {
		PositionComponent pos = (PositionComponent) entity.getComponent(PositionComponent.class);
		if(pos!=null){
			cam.translate(pos.getPosX()-cam.position.x, pos.getPosY()-cam.position.y);
//			cam.position.set(pos.getPosX(), pos.getPosY(), 0);
		}

	}

}
