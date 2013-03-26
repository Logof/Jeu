package com.bm.jeu.common.ef;

public class PositionComponent extends Component {

	private double posX;
	private double posY;
	
	
	public PositionComponent(double posX, double posY) {
		super();
		this.posX = posX;
		this.posY = posY;
	}
	
	public double getPosX() {
		return posX;
	}
	public void setPosX(double posX) {
		this.posX = posX;
	}
	public double getPosY() {
		return posY;
	}
	public void setPosY(double posY) {
		this.posY = posY;
	}

	@Override
	public String toString() {
		return "PositionComponent [posX=" + posX + ", posY=" + posY + "]";
	}
}
