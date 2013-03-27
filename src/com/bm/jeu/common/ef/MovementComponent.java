package com.bm.jeu.common.ef;

public class MovementComponent extends Component {
	
	private int direction;

	public MovementComponent(int direction) {
		super();
		this.setDirection(direction);
		setNetworkFlag(true);
	}

	public int getDirection() {
		return direction;
	}

	public void setDirection(int direction) {
		this.direction = direction;
	}

	@Override
	public String toString() {
		return "MovementComponent [direction=" + direction + "]";
	}

}
