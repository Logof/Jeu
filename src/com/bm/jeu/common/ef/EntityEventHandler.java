package com.bm.jeu.common.ef;

import java.util.ArrayList;
import java.util.List;

public class EntityEventHandler {
	private static List<EntityListener> listeners = new ArrayList<EntityListener>();

    public static void registerDataChangeListener(EntityListener listener) {
        listeners.add(listener);
    }

    public static void fireEntityAdded(Entity entity) {
    	System.out.println("ENTITY HANDLER: " + entity);
        for(EntityListener listener : listeners) {
            listener.EntityAddedEvent(entity);
        }
    }
    
    public static void fireEntityRemoved(Entity entity) {
        for(EntityListener listener : listeners) {
            listener.EntityRemovedEvent(entity);
        }
    }

}
