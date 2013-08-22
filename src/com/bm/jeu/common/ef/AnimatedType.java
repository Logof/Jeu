package com.bm.jeu.common.ef;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import com.almworks.sqlite4java.SQLiteConnection;
import com.almworks.sqlite4java.SQLiteException;
import com.almworks.sqlite4java.SQLiteStatement;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Texture;

public class AnimatedType implements TypeLoader<AnimationComponent> {

	private Map<String, Texture> mapper;
	// If we do it like this, we could even declare a DB on a per component
	// base, if that would ever be needed
	private SQLiteConnection entityDB;
	private final String ANIMATIONTABLE = "animation";
	private final String ANIMATIONLISTTABLE = "animationlist";

	public AnimatedType(SQLiteConnection db) {
		mapper = new HashMap<String, Texture>();
		this.entityDB = db;
	}

	@Override
	public AnimationComponent getComponent(UUID id) {
		// getting the path
		String preparedStatement = "SELECT * FROM " + ANIMATIONTABLE
				+ " WHERE animationid == '" + id.toString() + "'";
		SQLiteStatement statement;
		
		String filepath = "";
		Map<Integer, AnimationWrapper> anibuff = new HashMap<Integer, AnimationWrapper>();
		Texture textbuff = null;
		try {
			statement = entityDB.prepare(preparedStatement);
			statement.step();
			filepath = statement.columnString(1);
			statement.dispose();

			preparedStatement = "SELECT * FROM " + ANIMATIONLISTTABLE
					+ " WHERE animationid == '" + id.toString() + "'";
			statement = entityDB.prepare(preparedStatement);
			
			//check if texture already loaded (
			
			if (mapper.containsKey(filepath)) {
				textbuff = mapper.get(filepath);
			} else {
				textbuff = new Texture(new FileHandle(filepath));
				mapper.put(filepath, textbuff);
			}

			while (statement.step()) {
				anibuff.put(
						statement.columnInt(2),
						new AnimationWrapper(statement.columnInt(3), statement
								.columnInt(4), statement.columnInt(5), statement
								.columnInt(6), statement.columnInt(7), statement
								.columnInt(8), (float) statement.columnDouble(9),
								statement.columnInt(10), statement.columnInt(11),
								statement.columnInt(12), textbuff));
			}
		} catch (SQLiteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		AnimationComponent anicomp = new AnimationComponent(1, anibuff, true);
		System.out.println(anicomp);

		return anicomp;
	}

	//TODO: maybe use getSimpleName() over all
	@Override
	public String getType() {
		return AnimationComponent.class.getName();
	}

}
