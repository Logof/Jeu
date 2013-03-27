package com.bm.jeu.common.net;

//this is the interface that all future type of Network Client Services should implement. for example if we try apache Mina it's easy interchangeable
public interface DefaultNetworkingServerServices {
	// TODO: write general exceptions, like NotConnectedException etc.

	public void listen(int port);
	public void listen();
	public void send(Object message);
	public void stopListening();
	public boolean isListening();
}
