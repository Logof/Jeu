package com.bm.jeu.common.ef;

public class MovementMachine extends Machine {


	public MovementMachine() {
		addInterest(ActionComponent.class);
		addInterest(PositionComponent.class);
	}

	@Override
	public void processEntities(Entity entity) {
		ActionComponent actc = (ActionComponent) entity.getComponent(ActionComponent.class);
		PositionComponent pc = (PositionComponent) entity.getComponent(PositionComponent.class);
		if (actc != null && pc != null) {
			actc.setNetworkFlag(false);
			pc.setNetworkFlag(true);
			switch (actc.getActionID()) {
			case Actions.WALKING_RIGHT:
				pc.setPosX(pc.getPosX() + 1);
				break;
			case Actions.WALKING_LEFT:
				pc.setPosX(pc.getPosX() - 1);
				break;
			case Actions.WALKING_UP:
				pc.setPosY(pc.getPosY() + 1);
				break;
			case Actions.WALKING_DOWN:
				pc.setPosY(pc.getPosY() - 1);
				break;
			
			}
		}
		// System.out.println(pc + ";" + mc);

	}

}
