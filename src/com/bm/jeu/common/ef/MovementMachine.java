package com.bm.jeu.common.ef;

public class MovementMachine extends Machine {


	public MovementMachine() {
		addInterest(MovementComponent.class);
		addInterest(PositionComponent.class);
		addInterest(AnimationComponent.class);
	}

	@Override
	public void processEntities(Entity entity) {
		MovementComponent mc = (MovementComponent) entity.getComponent(MovementComponent.class);
		PositionComponent pc = (PositionComponent) entity.getComponent(PositionComponent.class);
		AnimationComponent anic = (AnimationComponent) entity.getComponent(AnimationComponent.class);
		if (mc != null && pc != null && anic != null) {
			mc.setNetworkFlag(false);
			pc.setNetworkFlag(true);
			switch (mc.getDirection()) {
			case 1:
				pc.setPosX(pc.getPosX() + 1);
				anic.setActiveAnimation(4);
				break;
			case -1:
				pc.setPosX(pc.getPosX() - 1);
				anic.setActiveAnimation(2);
				break;
			case 2:
				pc.setPosY(pc.getPosY() + 1);
				anic.setActiveAnimation(1);
				break;
			case -2:
				pc.setPosY(pc.getPosY() - 1);
				anic.setActiveAnimation(3);
				break;
			}
		}
		// System.out.println(pc + ";" + mc);

	}

}
