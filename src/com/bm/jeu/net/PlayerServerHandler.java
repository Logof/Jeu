package com.bm.jeu.net;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.jboss.netty.channel.ChannelEvent;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.channel.ChannelStateEvent;
import org.jboss.netty.channel.ExceptionEvent;
import org.jboss.netty.channel.MessageEvent;
import org.jboss.netty.channel.SimpleChannelHandler;
import com.bm.jeu.common.ef.Component;
import com.bm.jeu.common.net.ComponentRecievedHandler;


public class PlayerServerHandler extends SimpleChannelHandler {

	// TODO: change all the Logging type sysouts to use the Logger
	private static final Logger logger = Logger.getLogger(PlayerServerHandler.class.getName());

	// this groups all connections together in a convenient way and also is
	// threadsafe
	// Maybe we should extend on this class to group the connections in an
	// orderly fashion
	
	//TODO: make a mapper from Entity ID to channel
	//TODO: what about different areas of the map?

	// Logs every Event and sends it to the standard implementation
	@Override
	public void handleUpstream(ChannelHandlerContext ctx, ChannelEvent e) throws Exception {
		if (e instanceof ChannelStateEvent) {
			logger.info(e.toString());
		}
		super.handleUpstream(ctx, e);
	}

	// Acts when a Client connects
	@Override
	public void channelConnected(ChannelHandlerContext ctx, ChannelStateEvent e) throws Exception {
		NettyServer.addChannel(ctx.getChannel());
	}

	// Acts when a Client disconnects
	@Override
	public void channelDisconnected(ChannelHandlerContext ctx, ChannelStateEvent e) throws Exception {
		ctx.getChannel().close();
		NettyServer.removeChannel(ctx.getChannel());
	}

	// Acts when a message was received
	@Override
	public void messageReceived(ChannelHandlerContext ctx, MessageEvent e) throws Exception {
		// Log all channel state changes.
		if (e.getMessage() instanceof Component) {
			logger.info("Recieved:: " + (Component) e.getMessage());
			Component buff = (Component) e.getMessage();
			ComponentRecievedHandler.fireDataChange(buff);
		}
		super.messageReceived(ctx, e);
	}

	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, ExceptionEvent e) {
		logger.log(Level.WARNING, "Unexpected exception from downstream.", e.getCause());
		e.getChannel().close();
		NettyServer.removeChannel(ctx.getChannel());
	}

}
