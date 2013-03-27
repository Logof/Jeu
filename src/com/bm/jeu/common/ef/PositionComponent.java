package com.bm.jeu.common.ef;

import java.util.concurrent.atomic.AtomicLong;

public class PositionComponent extends Component {

	private double posX;
	private double posY;
	private AtomicLong counter;
	
	
	public PositionComponent(double posX, double posY) {
		super();
		this.posX = posX;
		this.posY = posY;
		this.setCounter(new AtomicLong(0));
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

	public AtomicLong getCounter() {
		return counter;
	}

	public void setCounter(AtomicLong counter) {
		this.counter = counter;
	}

	@Override
	public String toString() {
		return "PositionComponent [posX=" + posX + ", posY=" + posY + "]";
	}
}
