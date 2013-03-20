package com.bm.jeu.net;

import java.net.InetSocketAddress;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;

import org.jboss.netty.bootstrap.ClientBootstrap;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelFuture;
import org.jboss.netty.channel.socket.nio.NioClientSocketChannelFactory;

public class NettyClient implements DefaultNetworkingClientServices {

	private String HOST;
	private int PORT;
	private boolean connectionStatus;

	private ConcurrentLinkedQueue<String> outgoingQueue;
	private ClientBootstrap bootstrap;
	private Channel connection;

	public NettyClient(String host, int port) {
		this.HOST = host;
		this.PORT = port;
		outgoingQueue = new ConcurrentLinkedQueue<String>();
		connectionStatus = false;
	}

	private void setup() {
		// Configure the client.
		bootstrap = new ClientBootstrap(new NioClientSocketChannelFactory(Executors.newCachedThreadPool(), Executors.newCachedThreadPool()));

		// Configure the pipeline factory.
		bootstrap.setPipelineFactory(new NettyClientPipelineFactory());
	}

	@Override
	public boolean connect() {
		// uses the other connect statement to reduce work
		return connect(HOST, PORT);
	}

	@Override
	public boolean connect(String host, int port) {
		// check if host and port are set
		if (host != null && port > 0) {
			//set up bootstrap
			setup();
			
			// Start the connection attempt.
			ChannelFuture future = bootstrap.connect(new InetSocketAddress(host, port));

			connection = future.awaitUninterruptibly().getChannel();
			if (!future.isSuccess()) {
				future.getCause().printStackTrace();
				bootstrap.releaseExternalResources();
			} else {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean disconnect() {
		// Close the connection.  Make sure the close operation ends because
        // all I/O operations are asynchronous in Netty.
        connection.close().awaitUninterruptibly();
        connectionStatus=false;
     // Shut down all thread pools to exit.
        bootstrap.releaseExternalResources();
        
		return !connection.isOpen();
	}

	@Override
	public boolean write(String message) {
		
		// Sends the received line to the server.
        connection.write(message);
		return true;
	}

	@Override
	public int getIncomingQueueSize() {
		return this.incomingQueue.size();
	}

	@Override
	public int getOutgoingQueueSize() {
		return this.outgoingQueue.size();
	}

	@Override
	public int getPort() {
		return this.PORT;
	}

	// sets the new Port. you still need to reconnect to change the server on
	// the connection
	@Override
	public void setPort(int port) {
		this.PORT = port;

	}

	@Override
	public String getHost() {
		return this.HOST;
	}

	@Override
	public void setHost(String host) {
		this.HOST = host;

	}

	@Override
	public boolean getConnectionStatus() {
		return connectionStatus;
	}

	@Override
	public String getNextIncomingItem() {
		return this.incomingQueue.poll();
	}

	@Override
	public String getNextOutgoingItem() {
		return this.outgoingQueue.poll();
	}

}
