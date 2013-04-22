package com.bm.jeu.common.ef;

import java.io.File;
import java.util.UUID;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;

public class GenericType implements TypeLoader<Component> {
	
	//here could a mapper be placed which has already loaded textures etc

	private XStream xstream;

	public GenericType() {
		xstream = new XStream(new StaxDriver());
	}

	@Override
	public Component getComponent(String path, UUID id) {
		String test = path + "/" +id.toString() + ".txt";
		Component mvc = (Component) xstream.fromXML(new File(test));
		return mvc;
	}
	
	@Override
	public Component getComponent(UUID id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getType() {
		return Component.class.getName();
	}

	

}
