package com.bm.jeu.common.ef;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicInteger;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class AnimationComponent extends Component {
	
	private String filepath;
	private AtomicInteger activeAnimation;
	private Texture spriteSheet;
	private Map<Integer,AnimationWrapper> animations;
	private float statetime = 0.0f;
	private boolean running = true;

	public AnimationComponent() {
		setActiveAnimation(1);
		animations = new HashMap<Integer, AnimationWrapper>();
		statetime = 0.0f;
		running = true;
	}

	public String getFilepath() {
		return filepath;
	}

	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}


	public void setActiveAnimation(int activeAnimation) {
		if(this.activeAnimation.get()!=activeAnimation && animations.containsKey(activeAnimation)){
			statetime=0.0f;
			this.activeAnimation.set(activeAnimation);
		}
	}

	public Texture getSpriteSheet() {
		return spriteSheet;
	}

	public void setSpriteSheet(Texture spriteSheet) {
		this.spriteSheet = spriteSheet;
		statetime = 0.0f;
		for(Entry<Integer, AnimationWrapper> entry : animations.entrySet()){
			entry.getValue().setAnimation(spriteSheet);
		}
	}
	
	public TextureRegion getSprite(float delta) {
		statetime +=delta;
		return animations.get(activeAnimation.get()).getKeyFrame(statetime);
		
	}
	public TextureRegion getLastSprite(){
		return animations.get(activeAnimation.get()).getKeyFrame(statetime);
	}
	
	public void draw(SpriteBatch sb, float posX, float posY, float delta){
		if(running){
		sb.draw(getSprite(delta), posX, posY);
		}
		else{
			sb.draw(getLastSprite(), posX, posY);
		}
	}

	public void stop(){
		running = false;
	}
	
	public void start(){
		running = true;
	}

}
