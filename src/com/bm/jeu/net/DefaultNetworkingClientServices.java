package com.bm.jeu.net;

//this is the interface that all future type of Network Client Services should implement. for example if we try apache Mina it's easy interchangeable
public interface DefaultNetworkingClientServices {
	// TODO: write general exceptions, like NotConnectedException etc.

	public boolean connect(String host, int port);

	public boolean connect();

	// this should be changed to an object or later to something protocol
	// specific like an envelope class
	public boolean write(String message);

	public String getNextIncomingItem();

	public String getNextOutgoingItem();

	public int getIncomingQueueSize();

	public int getOutgoingQueueSize();

	public int getPort();

	public void setPort(int port);

	public String getHost();

	public void setHost(String host);

	public boolean disconnect();

	public boolean getConnectionStatus();

}
