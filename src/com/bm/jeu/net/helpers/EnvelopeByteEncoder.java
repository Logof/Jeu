package com.bm.jeu.net.helpers;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.handler.codec.oneone.OneToOneEncoder;

public class EnvelopeByteEncoder extends OneToOneEncoder {
	
	public static ChannelBuffer encodeMessage(NetworkEnvelope message)
            throws IllegalArgumentException {
        // version(1b) + type(1b) + payload length(4b) + payload(nb)
 
		//reserving bytes
        ChannelBuffer buffer = ChannelBuffers.buffer(message.getSize());
        //write version
        buffer.writeByte(message.getVersion().getByteValue());
        //write type
        buffer.writeByte(message.getType().getByteValue());
        //write payload size, remark the writeINT part which will write bytes automagically
        buffer.writeInt(message.getPayload().length);
        //write payload
        buffer.writeBytes(message.getPayload());
 
        return buffer;
    }

	@Override
	protected Object encode(ChannelHandlerContext ctx, Channel channel, Object msg) throws Exception {
		if (msg instanceof NetworkEnvelope) {
            return encodeMessage((NetworkEnvelope) msg);
        } else {
            return msg;
        }
	}

}
