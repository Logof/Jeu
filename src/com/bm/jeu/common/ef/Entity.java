package com.bm.jeu.common.ef;

import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class Entity {
	private UUID id;

	// The String part in this map will be the classname of the component. it's
	// used to identify the type.
	private Map<String, Component> components_;

	public Entity() {
		//does this need to be concurrent? it's not the fastest kind of map but at least it's sure to be threadsafe.
		components_ = new ConcurrentHashMap<String, Component>();
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public void addComponent(Component component) {
		// this means there is only 1 of the same component type at the same
		// type allowed (per entity) this is a designchoice and doesn't limit us
		// that much but results in much cleaner design
		this.components_.put(Component.class.getName(), component);
	}
	
	public void removeComponent(Component component){
		this.components_.remove(component.getClass().getName());
	}
	
	public void removeComponent(String type){
		this.components_.remove(type);
	}
	
	//WARNING: this is the slowest one. should not be used until absolutely necessarely!
	public void removeComponent(UUID id){
		for(Entry<String, Component> entry : this.components_.entrySet()){
			if(entry.getValue().getId().compareTo(id)==0){
				this.components_.remove(entry.getKey());
			}
		}
	}

}
