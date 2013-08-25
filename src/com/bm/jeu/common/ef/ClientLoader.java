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
		dbFile = new File("res/db/database.sqlite");
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
		//SQLITE boolean seem to be integers with value 1 or 0
		String preparedStatement = "SELECT entityid FROM entities WHERE startup = " + 1;
		SQLiteStatement statement;
		try {
			statement = entityDB.prepare(preparedStatement);
			
			while(statement.step()){
				loadEntity(UUID.fromString(statement.columnString(0)));
			}
			statement.dispose();
		} catch (SQLiteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
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
