package com.bm.jeu.net;

import static org.jboss.netty.channel.Channels.pipeline;

import org.jboss.netty.channel.ChannelPipeline;
import org.jboss.netty.channel.ChannelPipelineFactory;

import com.bm.jeu.common.net.EnvelopeByteDecoder;
import com.bm.jeu.common.net.EnvelopeByteEncoder;
import com.bm.jeu.common.net.EnvelopePackageDecoder;
import com.bm.jeu.common.net.EnvelopePackageEncoder;
import com.bm.jeu.common.net.XMLDecoder;
import com.bm.jeu.common.net.XMLEncoder;

public class PlayerServerPipelineFactory implements ChannelPipelineFactory {

	// Simplified, the pipeline is a list of encoder/decoders and protocols that
	// are used on this datastream

	@Override
	public ChannelPipeline getPipeline() throws Exception {
		ChannelPipeline pipeline = pipeline();

		// TODO: watch the directions of upstream and downstream handlers
		// upstrea from top down / downstream from last to the top
		// add one of the serialization codecs,
		// envelopes with Components in them (specified in Type)
		// add the Network protocol codecs
		pipeline.addLast("decoder1", new EnvelopeByteDecoder());
		pipeline.addLast("encoder1", new EnvelopeByteEncoder());

		// add the Package interpreters
		pipeline.addLast("decoder2", new EnvelopePackageDecoder());
		pipeline.addLast("encoder2", new EnvelopePackageEncoder());

		pipeline.addLast("decoder3", new XMLDecoder());
		pipeline.addLast("encoder3", new XMLEncoder());

		pipeline.addLast("handler", new PlayerServerHandler());
		return pipeline;
	}

}
