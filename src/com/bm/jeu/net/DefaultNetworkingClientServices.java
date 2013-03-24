package com.bm.jeu.net;

//this is the interface that all future type of Network Client Services should implement. for example if we try apache Mina it's easy interchangeable
public interface DefaultNetworkingClientServices {
	// TODO: write general exceptions, like NotConnectedException etc.

	public void connect();
	public void connect(String host, int port);
	public void send(Object message);
	public void disconnect();

}
