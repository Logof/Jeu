package com.bm.jeu.common.ef;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class AnimationWrapper {

	private int startX;
	private int startY;
	private int heigth;
	private int width;
	private int rows;
	private int cols;
	private float duration;
	private int loopType;
	private int paddingHorizontal;
	private int paddingVertical;

	private Animation animation;

	public static final int NORMAL = 0;
	public static final int REVERSED = 1;
	public static final int LOOP = 2;
	public static final int LOOP_REVERSED = 3;
	public static final int LOOP_PINGPONG = 4;
	public static final int LOOP_RANDOM = 5;

	public AnimationWrapper() {
		
	}

	public AnimationWrapper(int startX, int startY, int heigth, int width,
			int rows, int cols, float duration, int loopType,
			int paddingHorizontal, int paddingVertical, Texture sprite) {
		super();
		this.startX = startX;
		this.startY = startY;
		this.heigth = heigth;
		this.width = width;
		this.rows = rows;
		this.cols = cols;
		this.duration = duration;
		this.loopType = loopType;
		this.paddingHorizontal = paddingHorizontal;
		this.paddingVertical = paddingVertical;
		setAnimation(sprite);
	}

	public Animation getAnimation() {
		return animation;
	}

	public void setAnimation(Texture spritesheet) {
		TextureRegion buff[] = new TextureRegion[rows*cols];
		int i = 0;
		int spritewidth = (width/cols)-paddingHorizontal;
		int spriteheigth = (heigth/rows)-paddingVertical;
		int elementwidth = width/cols;
		int elementheigth = width/cols;
		
		for(int y=0;y<rows;y++){
			for(int x=0;x<cols;x++){
				buff[i] = new TextureRegion(spritesheet, startX+(x*elementwidth)+paddingHorizontal, startY+(y*elementheigth)+paddingVertical, spritewidth, spriteheigth);
				i++;
			}
		}
		animation = new Animation(duration, buff);
		animation.setPlayMode(LOOP);
	}
	
	public TextureRegion getKeyFrame(float statetime){
		return animation.getKeyFrame(statetime);
	}

	public int getStartX() {
		return startX;
	}

	public void setStartX(int startX) {
		this.startX = startX;
	}

	public int getStartY() {
		return startY;
	}

	public void setStartY(int startY) {
		this.startY = startY;
	}

	public int getLength() {
		return heigth;
	}

	public void setLength(int length) {
		this.heigth = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getCols() {
		return cols;
	}

	public void setCols(int cols) {
		this.cols = cols;
	}

	public float getDuration() {
		return duration;
	}

	public void setDuration(float duration) {
		this.duration = duration;
	}

	public int getLoopType() {
		return loopType;
	}

	public void setLoopType(int loopType) {
		this.loopType = loopType;
	}

	public int getPaddingHorizontal() {
		return paddingHorizontal;
	}

	public void setPaddingHorizontal(int paddingHorizontal) {
		this.paddingHorizontal = paddingHorizontal;
	}

	public int getPaddingVertical() {
		return paddingVertical;
	}

	public void setPaddingVertical(int paddingVertical) {
		this.paddingVertical = paddingVertical;
	}

	@Override
	public String toString() {
		return "AnimationWrapper [startX=" + startX + ", startY=" + startY
				+ ", heigth=" + heigth + ", width=" + width + ", rows=" + rows
				+ ", cols=" + cols + ", duration=" + duration + ", loopType="
				+ loopType + ", paddingHorizontal=" + paddingHorizontal
				+ ", paddingVertical=" + paddingVertical + "]";
	}

}
