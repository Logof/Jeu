package com.bm.jeu.guitest;

import java.util.concurrent.atomic.AtomicInteger;

import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.bm.jeu.common.ef.Component;

public class SpriteComponent extends Component {
	private static final int FRAME_COLS = 9;
	private static final int FRAME_ROWS = 4;
	private static final float ANIMATION_DURATION = 0.25f;
	TextureRegion sprite[][];
	Animation[] animations;
	Texture spriteSheet;
	AtomicInteger actAni;
	float statetime;

	public SpriteComponent() {
		super();
		statetime = 0;
		actAni = new AtomicInteger(0);
		sprite = new Sprite[FRAME_ROWS][FRAME_COLS];
		animations = new Animation[FRAME_ROWS];
		spriteSheet = new Texture(new FileHandle("res/sprites/char.png"));
		sprite = TextureRegion.split(spriteSheet, spriteSheet.getWidth() / FRAME_COLS, spriteSheet.getHeight() / FRAME_ROWS);
		for (int i = 0; i < FRAME_ROWS; i++) {
            animations[i] = new Animation(ANIMATION_DURATION, sprite[i]);
            animations[i].setPlayMode(Animation.LOOP);
		}

	}

	public TextureRegion getSprite(float delta) {
		statetime +=delta;
		return animations[actAni.get()].getKeyFrame(statetime);
		
	}

	public void setSprite(int spr) {
		if(actAni.get()!=spr){
			statetime=0;
			actAni.set(spr);
		}
		
	}
	
	public void draw(SpriteBatch sb, float posX, float posY, float delta){
//		sb.begin();
		sb.draw(getSprite(delta), posX, posY);
//		sb.end();
	}

}
