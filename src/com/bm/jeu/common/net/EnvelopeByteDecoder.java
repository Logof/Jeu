package com.bm.jeu.common.net;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.handler.codec.replay.ReplayingDecoder;

public class EnvelopeByteDecoder extends ReplayingDecoder<EnvelopeByteDecoder.DecodingState> {

	// internal vars

	private NetworkEnvelope message;

	// constructors

	public EnvelopeByteDecoder() {
		this.reset();
	}

	// ReplayingDecoder

	@Override
	protected Object decode(ChannelHandlerContext ctx, Channel channel, ChannelBuffer buffer, DecodingState state) throws Exception {
		// notice the switch fall-through (no break;)
		switch (state) {

		case VERSION: // check version byte
			this.message.setVersion(buffer.readByte());
			checkpoint(DecodingState.TYPE);
		case TYPE: // check type byte
			this.message.setType(buffer.readByte());
			checkpoint(DecodingState.PAYLOAD_LENGTH);
		case PAYLOAD_LENGTH: // check length of payload
			int size = buffer.readInt();
			if (size <= 0) {
				throw new Exception("Invalid content size");
			}
			// pre-allocate content buffer
			byte[] content = new byte[size];
			this.message.setPayload(content);
			checkpoint(DecodingState.PAYLOAD);
		case PAYLOAD:
			// drain the channel buffer to the message content buffer
			buffer.readBytes(this.message.getPayload(), 0, this.message.getPayload().length);

			// This is the only exit point of this method (except for the two
			// other exceptions that
			// should never occur).
			// Whenever there aren't enough bytes, a special exception is thrown
			// by the channel buffer
			// and automatically handled by netty. That's why all conditions in
			// the switch fall through
			try {
				// return the instance var and reset this decoder state after
				// doing so.
				return this.message;
			} finally {
				this.reset();
			}
		default:
			throw new Exception("Unknown decoding state: " + state);
		}
	}

	// private helpers

	private void reset() {
		checkpoint(DecodingState.VERSION);
		this.message = new NetworkEnvelope();
	}

	// private classes

	public enum DecodingState {

		// constants, they'll need adjustment until the protocol is finalized

		VERSION, TYPE, PAYLOAD_LENGTH, PAYLOAD,
	}
}