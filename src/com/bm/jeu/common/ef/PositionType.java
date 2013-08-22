package com.bm.jeu.common.ef;

import java.util.UUID;
import com.almworks.sqlite4java.SQLiteConnection;
import com.almworks.sqlite4java.SQLiteException;
import com.almworks.sqlite4java.SQLiteStatement;

public class PositionType implements TypeLoader<PositionComponent> {

	// If we do it like this, we could even declare a DB on a per component
	// base, if that would ever be needed
	private SQLiteConnection entityDB;
	private final String POSITIONTABLE = "positions";

	public PositionType(SQLiteConnection db) {
		this.entityDB = db;
	}

	@Override
	public PositionComponent getComponent(UUID id) {
		// getting the path
		String preparedStatement = "SELECT * FROM " + POSITIONTABLE
				+ " WHERE positionid == '" + id.toString() + "'";
		SQLiteStatement statement;
		
		PositionComponent posbuff = null;
		
		try {
			statement = entityDB.prepare(preparedStatement);
			statement.step();
			posbuff = new PositionComponent((float)statement.columnDouble(1), (float)statement.columnDouble(2));

		} catch (SQLiteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return posbuff;
	}

	//TODO: maybe use getSimpleName() over all
	@Override
	public String getType() {
		return PositionComponent.class.getName();
	}

}
