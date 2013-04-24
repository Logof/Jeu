package com.bm.jeu.common.ef;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.Map.Entry;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;


//has the context of the resources. knows where the data is (sql/file etc)
public class TestLoader implements ResourceLoader {
	
	@SuppressWarnings("rawtypes")
	private Map<String, TypeLoader> loaders;
	private XStream xstream;
	
	private String entityFolder;
	private String fileType;

	@SuppressWarnings("rawtypes")
	public TestLoader() {
		xstream = new XStream(new StaxDriver());
		xstream.processAnnotations(Component.class);
		loaders = new HashMap<String, TypeLoader>();
		entityFolder = "res/ent/";
		fileType = ".txt";
//		addType(new SpriteType());
		addType(new AnimatedType());
		addType(new GenericType());
	}

	@Override
	public void addType(TypeLoader<?> type) {
		loaders.put(type.getType(), type);
	}

	@Override
	public void removeType(TypeLoader<?> type) {
		loaders.remove(type.getType());

	}

	@Override
	public int getTypeSize(String type) {
		return loaders.size();
	}

	//Loads the needed entites to run, like the "world" or "map" or "player" depending on what's needed to start
	@Override
	public void loadWorkingEnvironment() {
		Entity starter = new Entity(UUID.fromString("678b218c-09c7-4bc9-a1f9-e53fc5f37c8c"));
		loadEntity(starter);
		starter.addComponent(new PlayerComponent());
	}

	@Override
	public void loadEntity(UUID id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void loadEntity(Entity entity) {
		
		EntityLoad load = (EntityLoad) xstream.fromXML(new File(entityFolder+entity.getId().toString()+fileType));
		
		for(Entry<String, UUID> entry : load.components.entrySet()){
			if(loaders.containsKey(entry.getKey())){
				entity.addComponent((Component) loaders.get(entry.getKey()).getComponent(entityFolder+entity.getId().toString(),entry.getValue()));
			}
			else {
				entity.addComponent((Component) loaders.get(Component.class.getName()).getComponent(entityFolder+entity.getId().toString(),entry.getValue()));
			}
		}

	}

}
