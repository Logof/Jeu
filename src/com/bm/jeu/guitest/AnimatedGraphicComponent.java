package com.bm.jeu.guitest;

import java.util.ArrayList;
import java.util.List;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.bm.jeu.common.ef.Component;

public class AnimatedGraphicComponent extends Component implements Drawable {
	
	private int STATE;
	private float statetime;
	private List<Animation> animations;

	public AnimatedGraphicComponent() {
		setSTATE(0);
		statetime = 0f;
		animations = new ArrayList<Animation>();
	}
	
	public void addState(TextureRegion[] region, float duration, int playtype){
		Animation buff = new Animation(duration, region);
		buff.setPlayMode(playtype);
	}

	@Override
	public void draw(SpriteBatch batch, float posX, float posY, float width, float height) {
		// TODO Auto-generated method stub

	}
	
	public void draw(SpriteBatch batch, float posX, float posY, float delta){
		statetime += delta;
		batch.draw(animations.get(STATE).getKeyFrame(statetime), posX, posY);
	}

	public int getSTATE() {
		return STATE;
	}

	public void setSTATE(int sTATE) {
		STATE = sTATE;
	}
	
	

}
