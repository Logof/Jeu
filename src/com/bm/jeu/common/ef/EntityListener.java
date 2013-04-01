package com.bm.jeu.common.ef;

import java.util.UUID;

public interface EntityListener {
	
	public void EntityAddedEvent(Entity entity);
	public void EntityRemovedEvent(UUID id);

}
