package com.bm.jeu.common.ef;

public interface ResourceLoader {
	
	public void addType(TypeLoader<?> type);
	public void removeType(TypeLoader<?> type);
}
