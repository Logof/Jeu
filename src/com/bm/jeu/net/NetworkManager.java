package com.bm.jeu.net;

import com.bm.jeu.common.ef.Component;
import com.bm.jeu.common.ef.EntityManager;
import com.bm.jeu.common.net.ComponentRecievedListener;

//This is implemented as a threadsafe Singleton

public class NetworkManager implements ComponentRecievedListener {
	
	EntityManager em_;

	/* Here is the instance of the Singleton */
	private static NetworkManager instance_;

	/* Need the following object to synchronize */
	/* a block */
	private static Object syncObject_;

	// Prevent direct access to the constructor
	private NetworkManager() {
		super();
		em_ = EntityManager.getinstance();
		ComponentRecievedHandler.registerDataChangeListener(this);
	}

	public static NetworkManager getinstance() {

		/*
		 * in a non-thread-safe version of a Singleton the following line could
		 * be executed, and the thread could be immediately swapped out
		 */
		if (instance_ == null) {

			synchronized (syncObject_) {

				if (instance_ == null) {
					instance_ = new NetworkManager();
				}

			}

		}
		return instance_;
	}

	@Override
	public void componentRecievedEvent(Component event) {
		em_.addComponent(event);
		
	}

}
