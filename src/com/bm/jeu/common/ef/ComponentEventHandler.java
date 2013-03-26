package com.bm.jeu.common.ef;

import java.util.ArrayList;
import java.util.List;

public class ComponentEventHandler {
	private static List<ComponentListener> listeners = new ArrayList<ComponentListener>();

    public static void registerDataChangeListener(ComponentListener listener) {
        listeners.add(listener);
    }

    public static void fireComponentAdded(Component component) {
    	System.out.println("HANDLER: " + component);
        for(ComponentListener listener : listeners) {
            listener.componentAddedEvent(component);
        }
    }
    
    public static void fireComponentRemoved(Component component) {
        for(ComponentListener listener : listeners) {
            listener.componentRemovedEvent(component);
        }
    }

}
