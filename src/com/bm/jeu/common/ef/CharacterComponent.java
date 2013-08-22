package com.bm.jeu.common.ef;

public class CharacterComponent extends Component {

	private String name;
	private Boolean player;
	//TODO: health etc?
	
	public CharacterComponent(String name, Boolean player) {
		super();
		this.setName(name);
		this.setPlayer(player);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getPlayer() {
		return player;
	}

	public void setPlayer(Boolean player) {
		this.player = player;
	}
	

	
}
