package com.bm.jeu.common.net;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Logout {
	private List<UUID> toRemove;
	
	public Logout(){
		setToRemove(new ArrayList<UUID>());
	}

	public List<UUID> getToRemove() {
		return toRemove;
	}

	public void setToRemove(List<UUID> toRemove) {
		this.toRemove = toRemove;
	}
	
	public void addEntity(UUID entity){
		toRemove.add(entity);
	}

}
