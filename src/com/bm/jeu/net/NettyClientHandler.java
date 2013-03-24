package com.bm.jeu.net;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.jboss.netty.channel.ChannelEvent;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.channel.ChannelStateEvent;
import org.jboss.netty.channel.Channels;
import org.jboss.netty.channel.ExceptionEvent;
import org.jboss.netty.channel.MessageEvent;
import org.jboss.netty.channel.SimpleChannelHandler;

public class NettyClientHandler extends SimpleChannelHandler {

	private static final Logger logger = Logger.getLogger(NettyClientHandler.class.getName());

	// TODO: the up/ and Downstream handlers (can) act as a sort of converter
	// BUT most of this should be done in encoders
	@Override
	public void handleUpstream(ChannelHandlerContext ctx, ChannelEvent e) throws Exception {
		if (e instanceof ChannelStateEvent) {
			logger.info(e.toString());
		}
		Networking.getinstance();
		super.handleUpstream(ctx, e);
	}

	//this acts as soon as something wants to write inte the channel (from everywhere)
	@Override
	public void writeRequested(ChannelHandlerContext ctx, MessageEvent e) throws Exception {
		String message = (String) e.getMessage();
		StringBuilder output = new StringBuilder();
		//here will the commands be parsed or processed (except the dis/-connect one)
		//put it together into the output one, so the server can understand it
		
		//TODO: parse commands
		
		Channels.write(ctx.getChannel(), output.toString());
	}

	@Override
	public void channelConnected(ChannelHandlerContext ctx, ChannelStateEvent e) throws Exception {

	}

	@Override
	public void messageReceived(ChannelHandlerContext ctx, MessageEvent e) {
		System.err.println(e.getMessage());
	}

	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, ExceptionEvent e) {
		logger.log(Level.WARNING, "Unexpected exception from downstream.", e.getCause());
		e.getChannel().close();
	}
}
