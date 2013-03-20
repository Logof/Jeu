package com.bm.jeu.net.helpers;

import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.handler.codec.oneone.OneToOneEncoder;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;

public class XMLEncoder extends OneToOneEncoder {

	public static String encodeMessage(Component message) throws IllegalArgumentException {
		XStream xstream = new XStream(new StaxDriver());
		String xml = xstream.toXML(message);
		return xml;
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
