package com.bm.jeu.common.net;

import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.handler.codec.oneone.OneToOneEncoder;

import com.bm.jeu.common.ef.Component;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;

public class XMLEncoder extends OneToOneEncoder {

	public static EncodedString encodeMessage(Component message) throws IllegalArgumentException {
		XStream xstream = new XStream(new StaxDriver());
		xstream.omitField(Component.class, "networkFlag");
		xstream.omitField(Component.class, "lock");
		EncodedString output = new EncodedString(xstream.toXML(message));
		return output;
	}

	@Override
	protected Object encode(ChannelHandlerContext ctx, Channel channel, Object msg) throws Exception {
		if (msg instanceof Component) {
			Component buff = (Component) msg;
			EncodedString str = encodeMessage(buff);
            return str;
        } else {
            return msg;
        }
	}

}
