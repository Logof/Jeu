package com.bm.jeu.net;

import java.net.InetSocketAddress;
import java.util.concurrent.Executors;

import org.jboss.netty.bootstrap.ClientBootstrap;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelFuture;
import org.jboss.netty.channel.socket.nio.NioClientSocketChannelFactory;

import com.bm.jeu.common.net.DefaultNetworkingClientServices;
import com.bm.jeu.common.net.DefaultNetworkingServices;

public class NettyClient implements DefaultNetworkingServices, DefaultNetworkingClientServices {

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

	public NettyClient() {
		setup();
	}

	private void setup() {
		bootstrap = new ClientBootstrap(new NioClientSocketChannelFactory(Executors.newCachedThreadPool(), Executors.newCachedThreadPool()));

		// Configure the pipeline factory.
		bootstrap.setPipelineFactory(new NettyClientPipelineFactory());

	}

	public String getHOST() {
		return HOST;
	}

	public void setHOST(String host) {
		HOST = host;
	}

	public int getPORT() {
		return PORT;
	}

	public void setPORT(int port) {
		PORT = port;
	}

	@Override
	public void connect() {
		// Start the connection attempt.
		ChannelFuture future = bootstrap.connect(new InetSocketAddress(HOST, PORT));
		clientConnection = future.awaitUninterruptibly().getChannel();
		if (!future.isSuccess()) {
			System.out.println("no connection");
			future.getCause().printStackTrace();
			bootstrap.releaseExternalResources();
		}
	}

	@Override
	public void connect(String host, int port) {
		setHOST(host);
		setPORT(port);
		connect();
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

	@Override
	public boolean isConnected() {
		if (clientConnection != null) {
			return clientConnection.isConnected();
		}
		return false;
	}

	@Override
	public boolean isRunning() {
		return isConnected();
	}

}