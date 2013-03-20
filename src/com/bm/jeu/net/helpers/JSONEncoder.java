package com.bm.jeu.net.helpers;

import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.handler.codec.oneone.OneToOneEncoder;

import com.google.gson.Gson;

public class JSONEncoder extends OneToOneEncoder {

	public static String encodeMessage(Component message) throws IllegalArgumentException {
		Gson gson = new Gson();
		String json = gson.toJson(message);
		return json;
	}

	@Override
	protected Object encode(ChannelHandlerContext ctx, Channel channel, Object msg) throws Exception {
		if (msg instanceof Component) {
            return encodeMessage((Component) msg);
        } else {
            return msg;
        }
	}

}
