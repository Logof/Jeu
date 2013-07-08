package com.bm.jeu.common.ef;

public class AnimationMachine extends Machine {

	public AnimationMachine() {
		addInterest(ActionComponent.class);
		addInterest(AnimationComponent.class);
	}

	@Override
	public void processEntities(Entity entity) {
		ActionComponent actC = (ActionComponent) entity.getComponent(ActionComponent.class);
		AnimationComponent aniC = (AnimationComponent) entity.getComponent(AnimationComponent.class);
		if(actC != null && aniC != null){
			aniC.setActiveAnimation(actC.getActionID());
			//here's a simple way to idle, stop the running animation
			if(actC.getActionID()==Actions.IDLE){
				aniC.stop();
			}
			else{
				aniC.start();
			}
		}

	}

}
