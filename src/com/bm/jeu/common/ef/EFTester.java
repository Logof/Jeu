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
//		test.addComponent(new MovementComponent(-1));
		System.out.println(test);
		
		for (int y = -1; y < 2; ++y) {
			test.addComponent(new MovementComponent(y));
			for (int i = 0; i < 10; i++) {
//				System.out.println(test);
				MachineManager.getinstance().update(1);
			}
			
			//TODO: solve concurrency problem!!
			
			
		}
//		try {
//			Thread.sleep(500);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		MachineManager.getinstance().shutdown();

	}

}
