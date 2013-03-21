package com.bm.jeu.net;

import java.util.ArrayList;
import java.util.List;

import com.bm.jeu.net.helpers.Component;
import com.bm.jeu.net.helpers.ComponentRecievedListener;

public class ComponentRecievedHandler {

	private static List<ComponentRecievedListener> listeners = new ArrayList<ComponentRecievedListener>();

    public static void registerDataChangeListener(ComponentRecievedListener listener) {
        listeners.add(listener);
    }

    public static void fireDataChange(Component componentRecievedEvent) {
        for(ComponentRecievedListener listener : listeners) {
            listener.componentRecievedEvent(componentRecievedEvent);
        }
    }

}
