package com.bm.jeu.common.ef;

import java.util.UUID;


//This will be a per type thing, let it be Textures, sound etc
public interface TypeLoader<T> {
	public T getComponent(UUID id);
	public String getType();

}
