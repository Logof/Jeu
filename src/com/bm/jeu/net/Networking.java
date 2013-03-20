package com.bm.jeu.net;

import java.util.concurrent.ConcurrentLinkedQueue;

//This is implemented as a threadsafe Singleton

public class Networking {
	
	private ConcurrentLinkedQueue<String> incomingQueue;

	/* Here is the instance of the Singleton */
	private static Networking instance_;

	/* Need the following object to synchronize */
	/* a block */
	private static Object syncObject_;

	// Prevent direct access to the constructor
	private Networking() {
		super();
		incomingQueue = new ConcurrentLinkedQueue<String>();
	}
	
	DefaultNetworkingClientServices test;
	
	//always use this if you need a Function that's designed in "Networking"

	public static Networking getinstance() {

		/*
		 * in a non-thread-safe version of a Singleton the following line could
		 * be executed, and the thread could be immediately swapped out
		 */
		if (instance_ == null) {

			synchronized (syncObject_) {

				if (instance_ == null) {
					instance_ = new Networking();
				}

			}

		}
		return instance_;
	}
	
	public void connect(String host, int port){
		test = new NettyClient(host, port);
	}
	
	public void relayCommand(String cmd){
		test.write(cmd);
	}
	
	public void addToQueue(String item){
		incomingQueue.add(item);
	}
	
	public String getFromQueue(){
		return incomingQueue.poll();
	}
	
}
