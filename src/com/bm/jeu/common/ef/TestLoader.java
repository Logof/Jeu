package com.bm.jeu.common.ef;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Texture;


//has the context of the resources. knows where the data is (sql/file etc)
public class TestLoader implements ResourceLoader {
	public Texture tex;
	
	//this is just static code for the test, later it'll delegate to the type loaders!
	public Map<String, UUID> mapper = new HashMap<String, UUID>();

	public TestLoader() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addType(TypeLoader<?> type) {
		

	}

	@Override
	public void removeType(TypeLoader<?> type) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getTypeSize(String type) {
		// TODO Auto-generated method stub
		return 0;
	}

	//Loads the needed entites to run, like the "world" or "map" or "player" depending on what's needed to start
	@Override
	public void loadWorkingEnvironment() {
		tex =new Texture(new FileHandle("res/sprites/char.png"));

	}

	@Override
	public void loadEntity(UUID id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void loadEntity(Entity entity) {
		//get components out of entity file or so
		mapper.put("com.bm.jeu.common.ef.MovementComponent", UUID.fromString("411fedd1-6096-4854-8532-92f468272a63"));
		mapper.put("com.bm.jeu.common.ef.PositionComponent", UUID.fromString("747364a9-04cc-4e57-b3f8-7526d7d9aef7"));
		mapper.put("com.bm.jeu.common.ef.SpriteComponent", UUID.fromString("a697a8db-14d3-4b9c-be8d-2797cca18177"));
		
		GenericType tt = new GenericType();
		SpriteType st = new SpriteType();
//		System.out.println(tt.getType(mapper.get("com.bm.jeu.common.ef.MovementComponent")));
//		System.out.println(tt.getType(mapper.get("com.bm.jeu.common.ef.PositionComponent")));
		entity.addComponent(tt.getType(mapper.get("com.bm.jeu.common.ef.MovementComponent")));
		entity.addComponent(st.getType(mapper.get("com.bm.jeu.common.ef.SpriteComponent")));
		entity.addComponent(tt.getType(mapper.get("com.bm.jeu.common.ef.PositionComponent")));

	}

}
