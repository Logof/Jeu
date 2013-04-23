package com.bm.jeu.common.ef;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import com.badlogic.gdx.graphics.Texture;

public class AnimationComponent extends Component {
	
	private String filepath;
	private AtomicInteger activeAnimation;
	private Texture spriteSheet;
	private Map<Integer,AnimationWrapper> animations;
	private float statetime;

	public AnimationComponent() {
		activeAnimation = new AtomicInteger(10);
		animations = new HashMap<Integer, AnimationWrapper>();
		statetime = 0.0f;
		setFilepath( "res/sprites/char.png");
		animations.put(1, new AnimationWrapper());
		animations.put(3, new AnimationWrapper());
	}
	
	

	public String getFilepath() {
		return filepath;
	}

	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}

}
