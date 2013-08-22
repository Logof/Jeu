package com.bm.jeu.common.ef;

import java.util.UUID;
import com.almworks.sqlite4java.SQLiteConnection;
import com.almworks.sqlite4java.SQLiteException;
import com.almworks.sqlite4java.SQLiteStatement;

public class ActionType implements TypeLoader<ActionComponent> {

	// If we do it like this, we could even declare a DB on a per component
	// base, if that would ever be needed
	private SQLiteConnection entityDB;
	private final String ACTIONTABLE = "actions";

	public ActionType(SQLiteConnection db) {
		this.entityDB = db;
	}

	@Override
	public ActionComponent getComponent(UUID id) {
		// getting the path
		String preparedStatement = "SELECT * FROM " + ACTIONTABLE
				+ " WHERE actionid == '" + id.toString() + "'";
		SQLiteStatement statement;
		
		ActionComponent actionbuff = null;
		
		try {
			statement = entityDB.prepare(preparedStatement);
			statement.step();
			actionbuff = new ActionComponent(null, statement.columnInt(1) );

		} catch (SQLiteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return actionbuff;
	}

	//TODO: maybe use getSimpleName() over all
	@Override
	public String getType() {
		return ActionComponent.class.getName();
	}

}
