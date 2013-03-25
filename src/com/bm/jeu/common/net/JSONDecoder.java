package com.bm.jeu.common.net;

import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.handler.codec.oneone.OneToOneDecoder;

import com.bm.jeu.common.ef.Component;
import com.google.gson.Gson;

public class JSONDecoder extends OneToOneDecoder {

	@Override
	protected Object decode(ChannelHandlerContext ctx, Channel channel, Object msg) throws Exception {
		if (msg instanceof EncodedString) {
			EncodedString encodedObj = (EncodedString) msg;
			Gson gson = new Gson();
			Component message = (Component) gson.fromJson(encodedObj.getEncodedMessage(), Component.class);
			message.setNetworkFlag(false);
			return message;
		}
		return msg;
	}

}
