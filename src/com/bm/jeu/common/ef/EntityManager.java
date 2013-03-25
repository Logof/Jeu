package com.bm.jeu.common.ef;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class EntityManager implements ManagerInterface<Entity> {

	/* Here is the instance of the Singleton */
	private static EntityManager instance_;

	/* Need the following object to synchronize */
	/* a block */
	private static Object syncObject_;

	private static Map<UUID, Entity> entities_;

	// Prevent direct access to the constructor
	private EntityManager() {
		super();
		entities_ = new ConcurrentHashMap<UUID, Entity>();
	}

	public static EntityManager getinstance() {

		/*
		 * in a non-thread-safe version of a Singleton the following line could
		 * be executed, and the thread could be immediately swapped out
		 */
		if (instance_ == null) {

			synchronized (syncObject_) {

				if (instance_ == null) {
					instance_ = new EntityManager();
				}

			}

		}
		return instance_;
	}

	// As only 1 entity with the same ID should exist (UUID is unique enough for
	// that) this will overwrite every existing element with the same id
	@Override
	public void add(Entity element) {
		entities_.put(element.getId(), element);

	}

	public void addComponent(Component component) {
		Entity buffer = get(component.getENTITYID());
		if (buffer != null) {
			buffer.addComponent(component);
		}
	}

	@Override
	public void remove(UUID id) {
		entities_.remove(id);
	}

	@Override
	public void remove(Entity element) {
		entities_.remove(element.getId());

	}

	@Override
	public int getCount() {
		return entities_.size();
	}

	@Override
	public Entity get(Entity element) {
		return entities_.get(element.getId());
	}

	@Override
	public Entity get(UUID id) {
		return entities_.get(id);
	}

	@Override
	public void update(int delta) {
		// TODO Auto-generated method stub

	}

	@Override
	public void shutdown() {
		// TODO Auto-generated method stub

	}

}
