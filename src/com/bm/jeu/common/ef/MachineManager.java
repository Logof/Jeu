package com.bm.jeu.common.ef;

import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MachineManager implements ComponentListener, EntityListener, ManagerInterface<Machine> {

	/* Here is the instance of the Singleton */
	private static MachineManager instance_;

	private static EntityManager em_;

	/* Need the following object to synchronize */
	/* a block */
	private static Object syncObject_ = new Object();

	private static Map<UUID, Machine> machines_;

	// here should be some sort of Threadpool that runs the Machines

	private static ExecutorService pool_;
	
	
	private static AtomicFloat timeDelta;

	// Prevent direct access to the constructor
	private MachineManager() {
		super();
		timeDelta = new AtomicFloat();
		em_ = EntityManager.getinstance();
		pool_ = Executors.newFixedThreadPool(10);
//		pool_ = Executors.newCachedThreadPool();
		machines_ = new ConcurrentHashMap<UUID, Machine>();
		ComponentEventHandler.registerDataChangeListener(this);
		EntityEventHandler.registerDataChangeListener(this);
	}

	public static MachineManager getinstance() {

		/*
		 * in a non-thread-safe version of a Singleton the following line could
		 * be executed, and the thread could be immediately swapped out
		 */
		if (instance_ == null) {

			synchronized (syncObject_) {

				if (instance_ == null) {
					instance_ = new MachineManager();
				}

			}

		}
		return instance_;
	}
	
	//TODO: getting components that are already present when machine is added!!

	public static float getTimeDelta() {
		return timeDelta.floatValue();
	}

	public static void setTimeDelta(float delta) {
		MachineManager.timeDelta.set(delta);
	}

	@Override
	public void add(Machine element) {
		machines_.put(element.getId(), element);
		em_.machineAdded(element);

	}

	@Override
	public void remove(Machine element) {
		remove(element.getId());

	}

	@Override
	public void remove(UUID id) {
		machines_.remove(id);
	}

	@Override
	public int getCount() {
		return machines_.size();
	}

	@Override
	public Machine get(Machine element) {
		return get(element.getId());
	}

	@Override
	public Machine get(UUID id) {
		return machines_.get(id);
	}

	@Override
	public void update(float delta) {
		timeDelta.set(delta);
		for (Entry<UUID, Machine> entry : machines_.entrySet()) {
			pool_.execute(entry.getValue());
		}
	}

	@Override
	public void shutdown() {
		pool_.shutdown();
		while (!pool_.isTerminated()) {
		}

	}

	@Override
	public void componentAddedEvent(Component component) {
//		System.out.println("COMPONENT: " + component);
		Entity buffer = em_.get(component.getENTITYID());
		for (Entry<UUID, Machine> entry : machines_.entrySet()) {
			entry.getValue().addEntity(buffer);
		}
	}

	@Override
	public void componentRemovedEvent(Component component) {
		Entity buffer = em_.get(component.getENTITYID());
		for (Entry<UUID, Machine> entry : machines_.entrySet()) {
			entry.getValue().removeIfObsolete(buffer);
		}

	}

	@Override
	public void EntityAddedEvent(Entity entity) {
//		System.out.println("ENTITY: " + entity);
		for (Entry<UUID, Machine> entry : machines_.entrySet()) {
			entry.getValue().addEntity(entity);
		}

	}

	@Override
	public void EntityRemovedEvent(Entity entity) {
		for (Entry<UUID, Machine> entry : machines_.entrySet()) {
			entry.getValue().removeEntity(entity);
		}

	}

}
