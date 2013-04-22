package com.bm.jeu.common.ef;

import java.io.File;
import java.util.UUID;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;

public class GenericType implements TypeLoader<Component> {
	
	//here could a mapper be placed which has already loaded textures etc

	public GenericType() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Component getType(UUID id) {
		XStream xstream = new XStream(new StaxDriver());
		String test = "res/ent/" +id.toString() + ".txt";
		Component mvc = (Component) xstream.fromXML(new File(test));
		return mvc;
	}

}
