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

public class NettyClientHandler extends SimpleChannelHandler {

	private static final Logger logger = Logger.getLogger(NettyClientHandler.class.getName());

	// TODO: the up/ and Downstream handlers (can) act as a sort of converter
	// BUT most of this should be done in encoders
	@Override
	public void handleUpstream(ChannelHandlerContext ctx, ChannelEvent e) throws Exception {
		if (e instanceof ChannelStateEvent) {
			// logger.info(e.toString());
		}
		super.handleUpstream(ctx, e);
	}

	@Override
	public void handleDownstream(ChannelHandlerContext ctx, ChannelEvent e) throws Exception {

		// Log all channel state changes.
		if (e instanceof MessageEvent) {
			// logger.info("Writing:: " + e);
		}

		super.handleDownstream(ctx, e);
	}

	// Acts when a message was received
	@Override
	public void messageReceived(ChannelHandlerContext ctx, MessageEvent e) throws Exception {
//		System.out.println(e.getMessage());
		if (e.getMessage() instanceof Component) {
//			logger.info("Recieved:: " + (Component) e);
			ComponentRecievedHandler.fireDataChange((Component) e.getMessage());
		}
		super.messageReceived(ctx, e);
	}

	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, ExceptionEvent e) {
		logger.log(Level.WARNING, "Unexpected exception from downstream.", e.getCause());
		e.getChannel().close();
	}
}
