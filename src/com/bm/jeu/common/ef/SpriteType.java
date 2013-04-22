package com.bm.jeu.common.ef;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Texture;
import com.bm.jeu.guitest.SpriteComponent;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;

public class SpriteType implements TypeLoader<SpriteComponent> {
	
	private Map<String, Texture> mapper;

	public SpriteType() {
		mapper = new HashMap<String, Texture>();
	}

	@Override
	public SpriteComponent getType(UUID id) {
		XStream xstream = new XStream(new StaxDriver());
		String test = "res/ent/" +id.toString() + ".txt";
		SpriteComponent spc = (SpriteComponent) xstream.fromXML(new File(test));
		if(mapper.containsKey(spc.getFilepath())){
			spc.setTexture(mapper.get(spc.getFilepath()));
		}
		else{
			Texture buff = new Texture(new FileHandle(spc.getFilepath()));
			mapper.put(spc.getFilepath(), buff);
			spc.setTexture(buff);
		}
		return spc;
	}


}
