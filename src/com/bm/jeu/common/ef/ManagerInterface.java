package com.bm.jeu.common.ef;

import java.util.UUID;

public interface ManagerInterface <T> {
	
	public void add(T element);
    public void remove(T element);
    public void remove(UUID id);
    public int getCount();
    public T get(T element);
    public T get(UUID id);
    public void update(float delta);
    public void shutdown();

}
