package com.bm.jeu.common.ef;

import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class Machine implements Runnable{

	private UUID id;
	//i'm not entirely sure about the implementation of the "interests" system
	private HashSet<String> interests_;
	private List<Entity> entities_;
	
	
	public Machine(){
		setId(UUID.randomUUID());
		setInterests(new HashSet<String>());
		entities_ = new CopyOnWriteArrayList<Entity>();
	}
	
	public final UUID getId() {
		return id;
	}

	public final void setId(UUID id) {
		this.id = id;
	}

	public final HashSet<String> getInterests() {
		return interests_;
	}

	public final void setInterests(HashSet<String> hashSet) {
		this.interests_ = hashSet;
	}
	
	public final void addInterest(String interest){
		this.interests_.add(interest);
	}
	
	public final void addInterest(Component interest){
		addInterest(interest.getClass());
	}
	
	public final void addInterest(Class<? extends Component> interest){
		addInterest(interest.getName());
	}

	//This method will be used to change components according to the machines purpose. I.e. changing X or Y position components etc.
	public abstract void processEntities();
	
	
	@Override
	public final void run(){
		processEntities();
	}
}
