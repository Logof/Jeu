package com.bm.jeu.common.ef;

import java.util.UUID;

public class ActionComponent extends Component {
	
	private UUID target;
	private int actionID;
	
	
	public ActionComponent(UUID targetEntity, int action) {
		this.setTarget(targetEntity);
		this.setActionID(action);
	}

	public UUID getTarget() {
		return target;
	}

	public void setTarget(UUID target) {
		this.target = target;
	}

	public int getActionID() {
		return actionID;
	}

	public void setActionID(int actionID) {
		this.actionID = actionID;
	}

}
