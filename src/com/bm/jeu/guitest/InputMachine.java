package com.bm.jeu.guitest;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.bm.jeu.common.ef.Entity;
import com.bm.jeu.common.ef.EntityManager;
import com.bm.jeu.common.ef.Machine;
import com.bm.jeu.common.ef.MovementComponent;
import com.bm.jeu.common.ef.PositionComponent;

public class InputMachine extends Machine implements InputProcessor {

	private AtomicInteger keydown;

	// Here could the interest rely on a "LocalComponent" or a Player component
	// with a "local" flag

	public InputMachine() {
		addInterest(PositionComponent.class);
		addInterest(MovementComponent.class);
		keydown = new AtomicInteger(0);
	}

	@Override
	public void processEntities(Entity entity) {
		MovementComponent mov = (MovementComponent) entity.getComponent(MovementComponent.class);

		if (mov != null) {
			switch (keydown.get()) {
			case Input.Keys.UP:
				mov.setDirection(2);
				break;
			case Input.Keys.DOWN:
				mov.setDirection(-2);
				break;
			case Input.Keys.LEFT:
				mov.setDirection(-1);
				break;
			case Input.Keys.RIGHT:
				mov.setDirection(1);
				break;
			case 112:	//My goddamn delete key has another value then Key.Del
				EntityManager.getinstance().remove(entity);
				keydown.set(0);
				break;
			default:
				mov.setDirection(0);
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
		// TODO Auto-generated method stub
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
