package com.bm.jeu.common.ef;

import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class Machine implements Runnable {

	private UUID id;
	// i'm not entirely sure about the implementation of the "interests" system
	private HashSet<String> interests_;
	private Map<UUID, Entity> entities_;
	private AtomicBoolean runWhenEmpty;

	public Machine() {
		setId(UUID.randomUUID());
		setInterests(new HashSet<String>());
		entities_ = new ConcurrentHashMap<UUID, Entity>();
		this.runWhenEmpty = new AtomicBoolean(true);
	}

	public Machine(boolean runWhenEmpty) {
		setId(UUID.randomUUID());
		setInterests(new HashSet<String>());
		entities_ = new ConcurrentHashMap<UUID, Entity>();
		this.runWhenEmpty = new AtomicBoolean(runWhenEmpty);
	}

	public final UUID getId() {
		return id;
	}

	public final void setId(UUID id) {
		this.id = id;
	}

	public boolean getRunWhenEmpty() {
		return runWhenEmpty.get();
	}

	public void setRunWhenEmpty(boolean runWhenEmpty) {
		this.runWhenEmpty.set(runWhenEmpty);
	}

	public final HashSet<String> getInterests() {
		return interests_;
	}

	public final void setInterests(HashSet<String> hashSet) {
		this.interests_ = hashSet;
	}

	public final void addInterest(String interest) {
		this.interests_.add(interest);
	}

	public final void addInterest(Component interest) {
		addInterest(interest.getClass());
	}

	public final void addInterest(Class<? extends Component> interest) {
		addInterest(interest.getName());
	}

	public final boolean checkInterests(Entity entity) {
		if (entity.getComponentTypes() != null) {
			return interests_.containsAll(entity.getComponentTypes());
		}
		return false;
	}

	public final boolean addEntity(Entity entity) {
		if (checkInterests(entity)) {
			entities_.put(entity.getId(), entity);
			return true;
		}
		return false;
	}

	// this is used to add Entities to a Machine that don't have the necessary
	// components. absolutely NOT recommended
	public final boolean addEntity(Entity entity, boolean forced) {
		if (forced) {
			entities_.put(entity.getId(), entity);
			return true;
		} else if (checkInterests(entity)) {
			entities_.put(entity.getId(), entity);
			return true;
		}
		return false;
	}

	public final void removeIfObsolete(Entity entity) {
		if (!checkInterests(entity)) {
			entities_.remove(entity.getId());
		}
	}

	public final void removeEntity(Entity entity) {
		removeEntity(entity.getId());
	}

	public final void removeEntity(UUID id) {
		entities_.remove(id);
	}

	// This method will be used to change components according to the machines
	// purpose. I.e. changing X or Y position components etc.
	public abstract void processEntities(Entity entity);

	// this part may seem "clever" but i've got no idea if this will be useful
	// later (concerning the automatic iteration over the entities)
	@Override
	public final void run() {
		for (Entry<UUID, Entity> entry : entities_.entrySet()) {
			processEntities(entry.getValue());
		}
	}
}
