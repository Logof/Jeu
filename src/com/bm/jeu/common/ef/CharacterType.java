package com.bm.jeu.common.ef;

import java.util.UUID;
import com.almworks.sqlite4java.SQLiteConnection;
import com.almworks.sqlite4java.SQLiteException;
import com.almworks.sqlite4java.SQLiteStatement;

public class CharacterType implements TypeLoader<CharacterComponent> {

	// If we do it like this, we could even declare a DB on a per component
	// base, if that would ever be needed
	private SQLiteConnection entityDB;
	private final String CHARACTERTABLE = "characters";

	public CharacterType(SQLiteConnection db) {
		this.entityDB = db;
	}

	@Override
	public CharacterComponent getComponent(UUID id) {
		// getting the path
		String preparedStatement = "SELECT * FROM " + CHARACTERTABLE
				+ " WHERE characterid == '" + id.toString() + "'";
		SQLiteStatement statement;
		
		CharacterComponent charbuff = null;
		
		try {
			statement = entityDB.prepare(preparedStatement);
			statement.step();
			boolean boolbuff =false;
			if(statement.columnInt(1) == 1){
				boolbuff = true;
			}
			charbuff = new CharacterComponent(statement.columnString(2), boolbuff );

		} catch (SQLiteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return charbuff;
	}

	//TODO: maybe use getSimpleName() over all
	@Override
	public String getType() {
		return CharacterComponent.class.getName();
	}

}
