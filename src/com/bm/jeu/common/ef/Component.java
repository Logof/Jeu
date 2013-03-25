package com.bm.jeu.common.ef;

import java.util.UUID;

public class Component {
	private UUID id;
	private UUID ENTITYID;	//this will be the id of the parent entity. this is needed to set it after sending it over the net
	private boolean networkFlag = false;
	
	public Component(){
		this.id = UUID.randomUUID();
	}
	
	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public UUID getENTITYID() {
		return ENTITYID;
	}

	public void setENTITYID(UUID id) {
		ENTITYID = id;
	}

	public void setNetworkFlag(boolean flag){
		this.networkFlag=flag;
	}
	
	public boolean getNetworkFlag(){
		return this.networkFlag;
	}
	
}
