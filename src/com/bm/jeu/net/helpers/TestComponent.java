package com.bm.jeu.net.helpers;

public class TestComponent extends Component {

	private String map;
	private float posX;
	private float posY;
	
	public TestComponent(String map, float posX, float posY) {
		super();
		this.map = map;
		this.posX = posX;
		this.posY = posY;
	}

	public String getMap() {
		return map;
	}

	public void setMap(String map) {
		this.map = map;
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
		return "TestComponent [map=" + map + ", posX=" + posX + ", posY=" + posY + "]";
	}
	
	
	

	

}
