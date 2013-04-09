package com.bm.jeu.guitest;

import com.bm.jeu.common.ef.Entity;
import com.bm.jeu.common.ef.Machine;

public class RelayMachine extends Machine {
	
	
	public RelayMachine() {
		addInterest(SpriteComponent.class);
	}

	@Override
	public void processEntities(Entity entity) {		
		

	}

}
