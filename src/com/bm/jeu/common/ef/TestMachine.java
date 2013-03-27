package com.bm.jeu.common.ef;

public class TestMachine extends Machine {
	
	public TestMachine(){
		addInterest(MovementComponent.class);
		addInterest(PositionComponent.class);
	}

	@Override
	public void processEntities(Entity entity) {
		
	}

}
