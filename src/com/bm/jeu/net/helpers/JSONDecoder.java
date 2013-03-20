package com.bm.jeu.net.helpers;

import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.handler.codec.oneone.OneToOneDecoder;

import com.google.gson.Gson;

public class JSONDecoder extends OneToOneDecoder {

	@Override
	protected Object decode(ChannelHandlerContext ctx, Channel channel, Object msg) throws Exception {
		if (msg instanceof NetworkEnvelope) {
			NetworkEnvelope envelope = (NetworkEnvelope) msg;
			if (envelope.getType().getByteValue() == (byte) 1) {
				Gson gson = new Gson();
				Component message = (Component) gson.fromJson(envelope.getPayloadAsString(), Component.class);
				return message;
			}
		}

		return msg;
	}

}
