package com.bm.jeu.common.ef;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.Map.Entry;

import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.table.SqlJetDb;

import com.bm.jeu.common.net.Login;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;

public class ServerLoader implements ResourceLoader {
	
	@SuppressWarnings("rawtypes")
	private Map<String, TypeLoader> loaders;
	private File dbFile;
	private SqlJetDb db;

	
	private String userFolder;
	private String fileType;

	public ServerLoader() {
		dbFile = new File("res/db/database.sqlite3");
		try {
			db = SqlJetDb.open(dbFile, true);
		} catch (SqlJetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loaders = new HashMap<String, TypeLoader>();
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
		
	}

	@Override
	public void loadEntity(UUID id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void loadEntity(Entity entity) {
		
		EntityLoad load = (EntityLoad) xstream.fromXML(new File(userFolder+entity.getId().toString()+fileType));
		
		for(Entry<String, UUID> entry : load.components.entrySet()){
			if(loaders.containsKey(entry.getKey())){
				entity.addComponent((Component) loaders.get(entry.getKey()).getComponent(userFolder+entity.getId().toString(),entry.getValue()));
			}
			else {
				entity.addComponent((Component) loaders.get(Component.class.getName()).getComponent(userFolder+entity.getId().toString(),entry.getValue()));
			}
		}

	}
	
	public boolean loadUser(Login login){
		Entity loader = new 
	}

	@Override
	public void load(Object obj) {
		// TODO Auto-generated method stub
		
	}

}
