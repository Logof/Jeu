package com.bm.jeu.common.net;

import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.handler.codec.oneone.OneToOneEncoder;

import com.bm.jeu.common.ef.Component;

public class EnvelopePackageEncoder extends OneToOneEncoder {

	public static NetworkEnvelope encodeMessage(EncodedString message) throws IllegalArgumentException {
		if(message.getClassName().equals(Component.class)){
			return new NetworkEnvelope(new Version(Version.TESTING), new Type(Type.GAME), message.getEncodedMessage());
		}
		else if(message.getClassName().equals(Logout.class)){
			return new NetworkEnvelope(new Version(Version.TESTING), new Type(Type.LOGOUT), message.getEncodedMessage());
		}
		else if(message.getClassName().equals(Login.class)){
			return new NetworkEnvelope(new Version(Version.TESTING), new Type(Type.LOGIN), message.getEncodedMessage());
		}
		return null;
		
	}

	@Override
	protected Object encode(ChannelHandlerContext ctx, Channel channel, Object msg) throws Exception {
		// TODO: is this possible with an switch clause?
		if (msg instanceof EncodedString) {
			return encodeMessage((EncodedString) msg);
		} else if (msg instanceof Heartbeat) {
			return new NetworkEnvelope(new Version(Version.TESTING), new Type(Type.HEARTBEAT), (byte) 1);
		} else {
			return msg;
		}
	}

}
