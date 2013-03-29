package com.bm.jeu;

import com.bm.jeu.common.ef.Entity;
import com.bm.jeu.common.ef.MachineManager;
import com.bm.jeu.common.ef.MovementComponent;
import com.bm.jeu.common.ef.PositionComponent;
import com.bm.jeu.common.ef.TestMachine;
import com.bm.jeu.common.net.Logout;
import com.bm.jeu.net.NetworkManager;

public class EFTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MachineManager.getinstance();
		MachineManager.getinstance().add(new TestMachine());
		NetworkManager.getinstance().connect("localhost", 8080);
		while (!NetworkManager.getinstance().isSetup()) {
		}

		System.out.println("connected");
		Entity test = new Entity();
		test.addComponent(new PositionComponent(1.0, 1.0));
		test.addComponent(new MovementComponent(1));
		test.getComponent(PositionComponent.class).setNetworkFlag(false);
		NetworkManager.getinstance().send(test.getComponent(PositionComponent.class));
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (int i = 0; i < 100; i++) {
			MachineManager.getinstance().update(1f);
			// System.out.println("check: " +
			// test.getComponent(MovementComponent.class).getNetworkFlag());
		}

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		NetworkManager.getinstance().send(new Logout());

	}

}
