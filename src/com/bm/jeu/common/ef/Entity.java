package com.bm.jeu.common.ef;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class Entity {
	private UUID id;

	// The String part in this map will be the classname of the component. it's
	// used to identify the type.
	private Map<String, Component> components_;

	public Entity() {
		// does this need to be concurrent? it's not the fastest kind of map but
		// at least it's sure to be threadsafe.
		components_ = new ConcurrentHashMap<String, Component>();
		setId(UUID.randomUUID());
		EntityManager.getinstance().add(this);
	}

	public Entity(UUID id) {
		setId(id);
		components_ = new ConcurrentHashMap<String, Component>();
		EntityManager.getinstance().add(this);
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
		// System.out.println("COMPONENT ADDED: " + component);
		component.setENTITYID(id);
		removeComponent(component);
		this.components_.put(component.getClass().getName(), component);
		ComponentEventHandler.fireComponentAdded(component);
	}

	public Component getComponent(String type) {
		return components_.get(type);
	}

	public Component getComponent(Class<? extends Component> type) {
		return getComponent(type.getName());
	}

	public Component getComponent(Component component) {
		return getComponent(component.getClass());
	}

	public void removeComponent(Component component) {
		removeComponent(component.getClass());
	}

	public void removeComponent(Class<? extends Component> type) {
		removeComponent(type.getName());
	}

	public void removeComponent(String type) {
		if (this.components_.containsKey(type)) {
			Component buffer = this.components_.get(type);
			ComponentEventHandler.fireComponentRemoved(buffer);
			buffer.lock();
			try {
				this.components_.remove(type);
			} finally {
				buffer.unlock();
			}

		}
	}

	// WARNING: this is the slowest one. should not be used until absolutely
	// Necessarily!
	public void removeComponent(UUID id) {
		for (Entry<String, Component> entry : this.components_.entrySet()) {
			if (entry.getValue().getId().compareTo(id) == 0) {
				removeComponent(entry.getKey());
			}
		}
	}

	public Set<String> getComponentTypes() {
		return components_.keySet();
	}

	@Override
	public String toString() {
		return "Entity [id=" + id + ", components_=" + components_ + "]";
	}

}
