package com.bm.jeu.common.ef;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class EntityLoad {
	
	private UUID entityId;
	public Map<String, UUID> components;

	public EntityLoad() {
		components = new HashMap<String, UUID>();
	}
	
	public EntityLoad(Entity entity) {
		components = new HashMap<String, UUID>();
		fromEntity(entity);
	}

	public UUID getEntityId() {
		return entityId;
	}

	public void setEntityId(UUID entityId) {
		this.entityId = entityId;
	}
	
	public void fromEntity(Entity entity){
		setEntityId(entity.getId());
		List<Component> buff = entity.getAllComponents();
		for(Component comp : buff){
			components.put(comp.getClass().getName(), comp.getId());
		}
	}

	@Override
	public String toString() {
		return "EntityLoad [entityId=" + entityId + ", components=" + components + "]";
	}

}
