package com.bm.jeu.net;

import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;

import org.jboss.netty.bootstrap.ServerBootstrap;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelException;
import org.jboss.netty.channel.ChannelFactory;
import org.jboss.netty.channel.group.ChannelGroup;
import org.jboss.netty.channel.group.ChannelGroupFuture;
import org.jboss.netty.channel.group.DefaultChannelGroup;
import org.jboss.netty.channel.socket.nio.NioServerSocketChannelFactory;

import com.bm.jeu.common.ef.EntityManager;
import com.bm.jeu.common.net.DefaultNetworkingServerServices;
import com.bm.jeu.common.net.DefaultNetworkingServices;
import com.bm.jeu.common.net.Logout;

public class NettyServer implements DefaultNetworkingServices, DefaultNetworkingServerServices{
	
	private static Channel serverChannel;
	private static ChannelGroup channels_;

	private static int PORT = 8080;
	private static boolean listening;

	private ServerBootstrap bootstrap;
	private ChannelGroupFuture lastWriteFuture = null;
	
	private static Map<Integer, List<UUID>> channelMapper;

	public NettyServer(int port) {
		NettyServer.PORT = port;
		listening = false;
		channels_ = new DefaultChannelGroup();
		channelMapper = new ConcurrentHashMap<Integer, List<UUID>>();
	}
	
	//TODO: handling only components that are allowed!! (a list of allowed components?)
	//TODO: implement a "Region" kind of handler, that only sends date to people who are in the same region

	public boolean startServer() {

		// TODO: sysouts to Logger calls
		System.out.println("Start listening on: " + PORT);
		// create Threadpools for the workers
		ChannelFactory factory = new NioServerSocketChannelFactory(Executors.newCachedThreadPool(), Executors.newCachedThreadPool());

		bootstrap = new ServerBootstrap(factory);

		bootstrap.setPipelineFactory(new PlayerServerPipelineFactory());

		bootstrap.setOption("child.tcpNoDelay", true);
		bootstrap.setOption("child.keepAlive", true);

		// bind the Server to the specified Port
		try {
			serverChannel = bootstrap.bind(new InetSocketAddress(NettyServer.PORT));
		} catch (ChannelException e) {
			e.printStackTrace();
			return false;
		}
		System.out.println("Now listening on: " + PORT);
		
		return true;

	}

	public static int getPORT() {
		return PORT;
	}

	public static void setPORT(int port) {
		PORT = port;
	}
	
	@Override
	public void listen() {
		listening = startServer();
		
	}

	@Override
	public void listen(int port) {
		setPORT(port);
		listen();
	}

	@Override
	public void send(Object message) {
		lastWriteFuture = channels_.write(message);
	}

	@Override
	public void stopListening() {
		if (lastWriteFuture != null) {
			lastWriteFuture.awaitUninterruptibly();
		}
		serverChannel.close().awaitUninterruptibly();
		bootstrap.releaseExternalResources();
	}

	@Override
	public boolean isListening() {
		return listening;
	}
	
	public static void addChannel(Channel chan){
		channels_.add(chan);
		channelMapper.put(chan.getId(), new ArrayList<UUID>());
	}
	
	public static void addEntityToChannel(Channel chan, UUID entityId){
		channelMapper.get(chan.getId()).add(entityId);
	}
	
	public static void removeChannel(Channel chan){
		for(Entry<Integer,List<UUID>> entry : channelMapper.entrySet()){
			for(UUID id : entry.getValue()){
				EntityManager.getinstance().remove(id);
			}
		}
		channelMapper.remove(chan.getId());
		channels_.remove(chan);
	}
	
	public static void clientLogout(Channel chan, Logout logout){
		channels_.write(logout);
		removeChannel(chan);
	}

	@Override
	public boolean isRunning() {
		if(serverChannel!=null){
			return serverChannel.isConnected();
		}
		return false;
	}

	


}
