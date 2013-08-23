package com.bm.jeu.guitest;

import java.util.concurrent.atomic.AtomicInteger;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.bm.jeu.common.ef.ActionComponent;
import com.bm.jeu.common.ef.Actions;
import com.bm.jeu.common.ef.CharacterComponent;
import com.bm.jeu.common.ef.Entity;
import com.bm.jeu.common.ef.EntityManager;
import com.bm.jeu.common.ef.Machine;

public class InputMachine extends Machine implements InputProcessor {

	private AtomicInteger keydown;
	
	// Here could the interest rely on a "LocalComponent" or a Player component
	// with a "local" flag

	public InputMachine() {
		addInterest(ActionComponent.class);
		addInterest(CharacterComponent.class);
		keydown = new AtomicInteger(0);
	}

	@Override
	public void processEntities(Entity entity) {
		ActionComponent action = (ActionComponent) entity.getComponent(ActionComponent.class);
		CharacterComponent character = (CharacterComponent) entity.getComponent(CharacterComponent.class);
		if (action != null && character.getPlayer()) {
			switch (keydown.get()) {
			case Input.Keys.UP:
				action.setActionID(Actions.WALKING_UP);
				break;
			case Input.Keys.DOWN:
				action.setActionID(Actions.WALKING_DOWN);
				break;
			case Input.Keys.LEFT:
				action.setActionID(Actions.WALKING_LEFT);
				break;
			case Input.Keys.RIGHT:
				action.setActionID(Actions.WALKING_RIGHT);
				break;
			case 112:	// Delete key
				EntityManager.getinstance().remove(entity);
				keydown.set(0);
				break;
			default:
				action.setActionID(Actions.IDLE);
			}
			
			// PROCESS "SPECIAL" KEYS THAT DON'T REQUIRE TO BE CONSTANTLY HELD DOWN
			if(keydown.get() == Input.Keys.F3) {
				System.out.println("Launching database debug tool...");
				keydown.set(0);
			}

		}
	}

	// Using a keymapper class so we could simply change them in a textfile and
	// load them from there would be the best way of action
	@Override
	public boolean keyDown(int keycode) {
		keydown.set(keycode);
		return true;
	}

	@Override
	public boolean keyTyped(char character) {
		return false;
	}

	@Override
	public boolean keyUp(int keycode) {
		if (keycode == keydown.get()) {
			keydown.set(0);
		}
		return true;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean scrolled(int amount) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		return false;
	}

}
