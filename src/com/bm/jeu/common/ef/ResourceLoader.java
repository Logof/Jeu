package com.bm.jeu.common.ef;

import java.util.UUID;

public interface ResourceLoader {
	
	public void addType(TypeLoader<?> type);
	public void removeType(TypeLoader<?> type);
	public int getTypeSize(String type);
	public void loadWorkingEnvironment();
	public void loadEntity(UUID id);
	public void loadEntity(Entity entity);
}
