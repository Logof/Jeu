package com.bm.jeu.common.net;

import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.handler.codec.oneone.OneToOneDecoder;

import com.bm.jeu.common.ef.Component;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;

public class XMLDecoder extends OneToOneDecoder {

	@Override
	protected Object decode(ChannelHandlerContext ctx, Channel channel, Object msg) throws Exception {
		if (msg instanceof EncodedString) {
			EncodedString encodedObj = (EncodedString) msg;
				XStream xstream = new XStream(new StaxDriver());
				if(encodedObj.getClassName().equals(Component.class)){
					Component message = (Component) xstream.fromXML(encodedObj.getEncodedMessage());
					message.setNetworkFlag(false);
					return message;
				}
				else if(encodedObj.getClassName().equals(Logout.class)){
					Logout message = (Logout) xstream.fromXML(encodedObj.getEncodedMessage());
					return message;
				}
				else if(encodedObj.getClassName().equals(Login.class)){
					Login message = (Login) xstream.fromXML(encodedObj.getEncodedMessage());
					return message;
				}
				
		}
		return msg;
	}
}
