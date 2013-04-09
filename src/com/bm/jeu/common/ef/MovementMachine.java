package com.bm.jeu.common.ef;

import com.bm.jeu.guitest.SpriteComponent;

public class MovementMachine extends Machine {


	public MovementMachine() {
		addInterest(MovementComponent.class);
		addInterest(PositionComponent.class);
		addInterest(SpriteComponent.class);
	}

	@Override
	public void processEntities(Entity entity) {
		MovementComponent mc = (MovementComponent) entity.getComponent(MovementComponent.class);
		PositionComponent pc = (PositionComponent) entity.getComponent(PositionComponent.class);
		SpriteComponent sprc = (SpriteComponent) entity.getComponent(SpriteComponent.class);
		if (mc != null && pc != null && sprc != null) {
			mc.setNetworkFlag(false);
			pc.setNetworkFlag(true);
			switch (mc.getDirection()) {
			case 1:
				pc.setPosX(pc.getPosX() + 1);
				sprc.setSprite(3);
				break;
			case -1:
				pc.setPosX(pc.getPosX() - 1);
				sprc.setSprite(1);
				break;
			case 2:
				pc.setPosY(pc.getPosY() + 1);
				sprc.setSprite(2);
				break;
			case -2:
				pc.setPosY(pc.getPosY() - 1);
				sprc.setSprite(0);
				break;
			}
		}
		// System.out.println(pc + ";" + mc);

	}

}
