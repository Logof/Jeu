package com.bm.jeu.common.ef;

public class PositionComponent extends Component {

	private float posX;
	private float posY;
	
	
	public PositionComponent(float posX, float posY) {
		super();
		this.posX = posX;
		this.posY = posY;
	}
	
	public float getPosX() {
		return posX;
	}
	public void setPosX(float posX) {
		this.posX = posX;
	}
	public float getPosY() {
		return posY;
	}
	public void setPosY(float posY) {
		this.posY = posY;
	}

	@Override
	public String toString() {
		return "PositionComponent [posX=" + posX + ", posY=" + posY + "]";
	}
}
