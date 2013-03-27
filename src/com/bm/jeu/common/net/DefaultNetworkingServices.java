package com.bm.jeu.common.net;

//this is the interface that all future type of Network Client Services should implement. for example if we try apache Mina it's easy interchangeable
public interface DefaultNetworkingServices {
	// TODO: write general exceptions, like NotConnectedException etc.

	public void send(Object message);
	public boolean isRunning();
}
