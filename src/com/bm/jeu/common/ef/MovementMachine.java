package com.bm.jeu.common.ef;

public class MovementMachine extends Machine {
	
	public MovementMachine(){
		addInterest(MovementComponent.class);
		addInterest(PositionComponent.class);
	}

	@Override
	public void processEntities(Entity entity) {
//		System.out.println(entity);
		MovementComponent mc = (MovementComponent) entity.getComponent(MovementComponent.class);

		PositionComponent pc = (PositionComponent) entity.getComponent(PositionComponent.class);
		mc.lock();
		
		pc.lock();
//		System.out.println(mc + " - " + Thread.currentThread().getId());
		
		switch(mc.getDirection()){
		case 1:
			pc.setPosX(pc.getPosX()+1);
			break;
		case -1:
			pc.setPosX(pc.getPosX()-1);
			break;
		}
//		System.out.println(pc + ";" + mc);
		mc.unlock();
		pc.unlock();
		
	}

}
