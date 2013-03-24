package com.bm.jeu.net;

import java.net.InetSocketAddress;
import java.util.concurrent.Executors;

import org.jboss.netty.bootstrap.ClientBootstrap;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelFuture;
import org.jboss.netty.channel.socket.nio.NioClientSocketChannelFactory;

public class NettyClient implements DefaultNetworkingClientServices {

	private String HOST;
	private int PORT;
<<<<<<< HEAD
	private boolean connectionStatus;

	private ConcurrentLinkedQueue<String> outgoingQueue;
	private ConcurrentLinkedQueue<String> incomingQueue;

=======
>>>>>>> 5a535f776d5cc95a314ae7e33725306609851a1e
	private ClientBootstrap bootstrap;
	private Channel clientConnection;
	private ChannelFuture lastWriteFuture = null;

	public NettyClient(String host, int port) {
		this.HOST = host;
		this.PORT = port;
<<<<<<< HEAD
		outgoingQueue = new ConcurrentLinkedQueue<String>();
		incomingQueue = new ConcurrentLinkedQueue<String>();
		connectionStatus = false;
=======
		setup();
>>>>>>> 5a535f776d5cc95a314ae7e33725306609851a1e
	}

	private void setup() {
		bootstrap = new ClientBootstrap(new NioClientSocketChannelFactory(Executors.newCachedThreadPool(), Executors.newCachedThreadPool()));

		// Configure the pipeline factory.
		bootstrap.setPipelineFactory(new NettyClientPipelineFactory());

	}

	@Override
	public void connect() {
		// Start the connection attempt.
		ChannelFuture future = bootstrap.connect(new InetSocketAddress(HOST, PORT));
		clientConnection = future.awaitUninterruptibly().getChannel();
		if (!future.isSuccess()) {
			future.getCause().printStackTrace();
			bootstrap.releaseExternalResources();
		}
	}

	@Override
<<<<<<< HEAD
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
		return this.getIncomingQueueSize();
	}

	@Override
	public int getOutgoingQueueSize() {
		return this.outgoingQueue.size();
	}
=======
	public void connect(String host, int port) {
		// TODO Auto-generated method stub
>>>>>>> 5a535f776d5cc95a314ae7e33725306609851a1e

	}

	@Override
	public void send(Object message) {
		lastWriteFuture = clientConnection.write(message);

	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		// Wait until all messages are flushed before closing the channel.
		if (lastWriteFuture != null) {
			lastWriteFuture.awaitUninterruptibly();
		}

		// Close the connection. Make sure the close operation ends because
		// all I/O operations are asynchronous in Netty.
		clientConnection.close().awaitUninterruptibly();

		// Shut down all thread pools to exit.
		bootstrap.releaseExternalResources();

	}
	
	public boolean isConnected(){
		return clientConnection.isConnected();
	}

}
