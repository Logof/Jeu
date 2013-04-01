package com.bm.jeu.common.ef;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class EntityEventHandler {
	private static List<EntityListener> listeners = new ArrayList<EntityListener>();

    public static void registerDataChangeListener(EntityListener listener) {
        listeners.add(listener);
    }

    public static void fireEntityAdded(Entity entity) {
//    	System.out.println("ENTITY HANDLER: " + entity);
        for(EntityListener listener : listeners) {
            listener.EntityAddedEvent(entity);
        }
    }
    
    public static void fireEntityRemoved(UUID id) {
        for(EntityListener listener : listeners) {
            listener.EntityRemovedEvent(id);
        }
    }

}
