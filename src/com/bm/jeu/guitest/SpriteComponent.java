package com.bm.jeu.guitest;

import java.util.concurrent.atomic.AtomicInteger;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.bm.jeu.common.ef.Component;

public class SpriteComponent extends Component {
	private int FRAME_COLS;
	private int FRAME_ROWS;
	private float ANIMATION_DURATION;
	private String filepath = "res/sprites/char.png";
	private TextureRegion sprite[][];
	private Animation[] animations;
	private Texture spriteSheet;
	private AtomicInteger actAni;
	private float statetime;

	public SpriteComponent() {
		super();
		statetime = 0;
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
	
	public void setTexture(Texture texture){
		sprite = new Sprite[FRAME_ROWS][FRAME_COLS];
		animations = new Animation[FRAME_ROWS];
		spriteSheet = texture;
		sprite = TextureRegion.split(spriteSheet, spriteSheet.getWidth() / FRAME_COLS, spriteSheet.getHeight() / FRAME_ROWS);
		for (int i = 0; i < FRAME_ROWS; i++) {
            animations[i] = new Animation(ANIMATION_DURATION, sprite[i]);
            animations[i].setPlayMode(Animation.LOOP);
		}
	}
	
	public void draw(SpriteBatch sb, float posX, float posY, float delta){
		sb.draw(getSprite(delta), posX, posY);
	}

	public String getFilepath() {
		return filepath;
	}

	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}

}
