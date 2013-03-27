package com.bm.jeu.common.ef;

public class EFTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MachineManager.getinstance();
		MachineManager.getinstance().add(new MovementMachine());
		Entity test = new Entity();
		test.addComponent(new PositionComponent(1.0, 1.0));
		MachineManager.getinstance().add(new MovementMachine());
		// test.addComponent(new MovementComponent(-1));
		// System.out.println(test);

		long start = System.currentTimeMillis();
		for (int y = -1; y < 2; ++y) {
			test.addComponent(new MovementComponent(y));
			for (int i = 0; i < 10; i++) {
				// System.out.println(test);
				MachineManager.getinstance().update(1);
			}
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// TODO: solve concurrency problem!!

		}
		PositionComponent pos = (PositionComponent) test.getComponent(PositionComponent.class);

		MachineManager.getinstance().shutdown();
		long end = System.currentTimeMillis();
		try {
			Thread.sleep(700);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(end - start + " - " + pos.getCounter().get());
		
	}

}
