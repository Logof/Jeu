package com.bm.jeu.common.ef;

public class MovementMachine extends Machine {

	long threadid;
	boolean holdslock;

	public MovementMachine() {
		addInterest(MovementComponent.class);
		addInterest(PositionComponent.class);
	}

	@Override
	public void processEntities(Entity entity) {
		MovementComponent mc = (MovementComponent) entity.getComponent(MovementComponent.class);
		PositionComponent pc = (PositionComponent) entity.getComponent(PositionComponent.class);
		if (mc != null && pc!=null) {
			mc.setNetworkFlag(false);
			pc.setNetworkFlag(true);
			switch (mc.getDirection()) {
			case 1:
				pc.setPosX(pc.getPosX() + 1);
				break;
			case -1:
				pc.setPosX(pc.getPosX() - 1);
				break;
			}
		}
//		 System.out.println(pc + ";" + mc);

	}

}
