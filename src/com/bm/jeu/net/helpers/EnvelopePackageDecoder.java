package com.bm.jeu.net.helpers;

import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.handler.codec.oneone.OneToOneDecoder;

public class EnvelopePackageDecoder extends OneToOneDecoder {

	@Override
	protected Object decode(ChannelHandlerContext ctx, Channel channel, Object msg) throws Exception {
		if (msg instanceof NetworkEnvelope) {
			NetworkEnvelope envelope = (NetworkEnvelope) msg;

			// in the switch cases will be specific code to handle the different
			// package types which don't have special decoders
			switch (envelope.getType().getByteValue()) {
			case Type.GAME:
				return new EncodedString(envelope.getPayloadAsString()); // change to a format that the encoder understands
			case Type.HEARTBEAT:
				return envelope; // not decided yet what to do with this one
			}
		}
		return msg;
	}

}
