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
	private ClientBootstrap bootstrap;
	private Channel clientConnection;
	private ChannelFuture lastWriteFuture = null;

	public NettyClient(String host, int port) {
		this.HOST = host;
		this.PORT = port;
		setup();
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
	public void connect(String host, int port) {
		// TODO Auto-generated method stub

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
