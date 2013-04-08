package com.bm.jeu.common.ef;

import java.util.UUID;
import java.util.concurrent.locks.ReentrantLock;

public class Component {
	private UUID id;
	private UUID ENTITYID;	//this will be the id of the parent entity. this is needed to set it after sending it over the net
	private boolean networkFlag = false;
	private boolean saveable;
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
	

	public boolean isSaveable() {
		return saveable;
	}

	public void setSaveable(boolean saveable) {
		this.saveable = saveable;
	}

	public void lock(){
//		System.out.println("LOCK");
		if(!this.lock.hasQueuedThread(Thread.currentThread())){
			this.lock.lock();
		}
	}
	
	public void unlock(){
//		System.out.println("UNLOCK");
		if(this.lock.isHeldByCurrentThread()){
			this.lock.unlock();
		}
		
	}
	
	public boolean checkLock(){
		return this.lock.isLocked();
	}
	
	//this part is needed for the omitted fields in xstream
	
	private Object readResolve() {
		this.networkFlag = false;
		this.lock = new ReentrantLock(true);
		return this;
	}
}
