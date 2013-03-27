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
		// System.out.println(entity);
		MovementComponent mc = (MovementComponent) entity.getComponent(MovementComponent.class);

		PositionComponent pc = (PositionComponent) entity.getComponent(PositionComponent.class);
		// System.out.println(mc + " - " + Thread.currentThread().getId());
		if (mc != null) {
			switch (mc.getDirection()) {
			case 1:
				pc.setPosX(pc.getPosX() + 1);
				pc.getCounter().incrementAndGet();
				break;
			case -1:
				pc.setPosX(pc.getPosX() - 1);
				pc.getCounter().incrementAndGet();
				break;
			default:
				pc.getCounter().incrementAndGet();

			}
		}
		// System.out.println(pc + ";" + mc);

	}

}
