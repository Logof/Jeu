package com.bm.jeu.net.helpers;

import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.handler.codec.oneone.OneToOneEncoder;

public class EnvelopePackageEncoder extends OneToOneEncoder {
	
	public static NetworkEnvelope encodeMessage(EncodedString message) throws IllegalArgumentException {
		return new NetworkEnvelope(new Version(Version.TESTING), new Type(Type.GAME), message.getEncodedMessage());
	}

	@Override
	protected Object encode(ChannelHandlerContext ctx, Channel channel, Object msg) throws Exception {
		//TODO: is this possible with an switch clause?
		if (msg instanceof EncodedString) {
			return encodeMessage((EncodedString) msg);
		} else if (msg instanceof Heartbeat) {
			return new NetworkEnvelope(new Version(Version.TESTING), new Type(Type.HEARTBEAT), (byte)1);
		} else {
			return msg;
		}
	}

}
