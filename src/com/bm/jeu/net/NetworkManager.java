package com.bm.jeu.net;

import com.bm.jeu.common.ef.Component;
import com.bm.jeu.common.ef.Entity;
import com.bm.jeu.common.ef.EntityManager;
import com.bm.jeu.common.net.ComponentRecievedHandler;
import com.bm.jeu.common.net.ComponentRecievedListener;
import com.bm.jeu.common.net.DefaultNetworkingClientServices;
import com.bm.jeu.common.net.DefaultNetworkingServerServices;
import com.bm.jeu.net.NettyServer;

//This is implemented as a threadsafe Singleton

public class NetworkManager implements ComponentRecievedListener {

	private static EntityManager em_;

	// this part i'm not entirely sure how to generalize better (same thing for
	// server/client)
	private DefaultNetworkingClientServices clienConnection_;
	private DefaultNetworkingServerServices serverConnection_;
	/* Here is the instance of the Singleton */
	private static NetworkManager instance_;

	/* Need the following object to synchronize */
	/* a block */
	private static Object syncObject_ = new Object();

	private static boolean setup;

	// Prevent direct access to the constructor
	private NetworkManager() {
		super();
		setup = false;
		syncObject_ = new Object();
		em_ = EntityManager.getinstance();
		clienConnection_ = null;
		serverConnection_ = null;
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

	// this part is specific for the client

	public void connect(String host, int port) {
		clienConnection_ = new NettyClient(host, port);
		clienConnection_.connect(host, port);
		setup = true;
	}

	public boolean isSetup() {
		return setup;
	}

	// this part is specific for server services

	public void listen(int port) {
		serverConnection_ = new NettyServer(port);
		serverConnection_.listen();
		setup = true;
	}

	public boolean isListening() {
		return serverConnection_.isListening();
	}

	// this part concerns bothe server & client

	public void send(Object message) {
		if (clienConnection_ != null) {
			clienConnection_.send(message);
		}
		if (serverConnection_ != null) {
			serverConnection_.send(message);
		}
	}

	@Override
	public void componentRecievedEvent(Component event) {
		Entity buffer = em_.get(event.getENTITYID());
		if (buffer != null) {
			buffer.addComponent(event);
		} else {
			buffer = new Entity(event.getENTITYID());
			buffer.addComponent(event);
			em_.add(buffer);
		}
	}

}
