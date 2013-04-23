package com.bm.jeu.common.ef;

import com.badlogic.gdx.graphics.g2d.Animation;

public class AnimationWrapper {

	private int startX;
	private int startY;
	private int length;
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
		startX = 1;
		startY =2;
		length = 3;
		width = 4;
		rows = 5;
		cols = 6;
		duration = 0.25f;
		loopType = LOOP_PINGPONG;
		paddingHorizontal = 33;
		paddingVertical = 44;
	}

}
