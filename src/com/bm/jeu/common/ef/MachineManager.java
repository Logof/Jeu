package com.bm.jeu.common.ef;

import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

public class MachineManager implements ComponentListener, ManagerInterface<Machine> {
	
	/* Here is the instance of the Singleton */
	private static MachineManager instance_;

	/* Need the following object to synchronize */
	/* a block */
	private static Object syncObject_;
	
	private static List<Machine> machines_;

	
	//here should be some sort of Threadpool that runs the Machines

	// Prevent direct access to the constructor
	private MachineManager() {
		super();
		machines_ = new LinkedList<Machine>();
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

	@Override
	public void add(Machine element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Machine element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(UUID id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Machine get(Machine element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Machine get(UUID id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(int delta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void shutdown() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void componentAddedEvent(Component component) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void componentRemovedEvent(Component component) {
		// TODO Auto-generated method stub
		
	}

}
