package com.bm.jeu.common.ef;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import com.almworks.sqlite4java.SQLiteConnection;
import com.almworks.sqlite4java.SQLiteException;
import com.almworks.sqlite4java.SQLiteStatement;


//has the context of the resources. knows where the data is (sql/file etc)
public class ClientLoader implements ResourceLoader {
	
	@SuppressWarnings("rawtypes")
	private Map<String, TypeLoader> loaders;
	private File dbFile;
	private SQLiteConnection entityDB;

	@SuppressWarnings("rawtypes")
	public ClientLoader() {
		dbFile = new File("res\\db\\database.sqlite");
		entityDB = new SQLiteConnection(dbFile);
		try {
			entityDB.openReadonly();
		} catch (SQLiteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loaders = new HashMap<String, TypeLoader>();

		addType(new AnimatedType(entityDB));
		addType(new PositionType(entityDB));
		addType(new CharacterType(entityDB));
		addType(new ActionType(entityDB));
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
//		Entity starter = new Entity(UUID.fromString("678b218c-09c7-4bc9-a1f9-e53fc5f37c8c"));
//		loadEntity(starter);
//		System.out.println("nr2");
//		starter = new Entity(UUID.fromString("3a3d2ae5-2c7e-4161-a95e-b55fe1f46f7e"));
//		loadEntity(starter);
//		starter.addComponent(new PlayerComponent());
		loadEntity(UUID.fromString("3a3d2ae5-2c7e-4161-a95e-b55fe1f46f7e"));
	}

	@Override
	public void loadEntity(UUID id) {
		Entity entload = new Entity(id);
		
		loadEntity(entload);;

	}

	@Override
	public void loadEntity(Entity entity) {
		String preparedStatement = "SELECT * FROM components WHERE entityid == '" + entity.getId().toString() + "'";
		SQLiteStatement statement;
		
		try {
			statement = entityDB.prepare(preparedStatement);
			
			while(statement.step()){
				//checks if the loader for this type exists
				String type = statement.columnString(1);
				if(loaders.containsKey(type)){
					entity.addComponent((Component) loaders.get(type).getComponent(UUID.fromString(statement.columnString(2))));
				}
				else{
					System.out.println("No loader for type: " + type);
				}
			}
			statement.dispose();
		} catch (SQLiteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


}
