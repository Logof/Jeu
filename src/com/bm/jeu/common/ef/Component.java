package com.bm.jeu.common.ef;

import java.util.UUID;
import java.util.concurrent.locks.ReentrantLock;

public class Component {
	private UUID id;
	private UUID ENTITYID;	//this will be the id of the parent entity. this is needed to set it after sending it over the net
	private boolean networkFlag = false;
	private ReentrantLock lock;
	
	public Component(){
		this.id = UUID.randomUUID();
		this.lock = new ReentrantLock(true);
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
	
	//the following part is Concurrency related
	
	public void lock(){
//		System.out.println("LOCK");
		this.lock.lock();
	}
	
	public void unlock(){
//		System.out.println("UNLOCK");
		this.lock.unlock();
	}
}
