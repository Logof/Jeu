package com.bm.jeu.common.ef;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Texture;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;

public class AnimatedType implements TypeLoader<AnimationComponent> {
	
	private Map<String, Texture> mapper;
	private XStream xstream;
	

	public AnimatedType() {
		mapper = new HashMap<String, Texture>();
		xstream = new XStream(new StaxDriver());
	}

	@Override
	public AnimationComponent getComponent(UUID id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AnimationComponent getComponent(String path, UUID id) {
		String test = "res/ent/animations/" +id.toString() + ".txt";
		AnimationComponent anc = (AnimationComponent) xstream.fromXML(new File(test));
		if(mapper.containsKey(anc.getFilepath())){
			anc.setSpriteSheet(mapper.get(anc.getFilepath()));
		}
		else{
			Texture buff = new Texture(new FileHandle(anc.getFilepath()));
			mapper.put(anc.getFilepath(), buff);
			anc.setSpriteSheet(buff);
		}
		
		return anc;
	}

	@Override
	public String getType() {
		return AnimationComponent.class.getName();
	}

}
