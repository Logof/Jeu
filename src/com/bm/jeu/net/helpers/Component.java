package com.bm.jeu.net.helpers;

public class Component {
	
	private int number;
	private String word;
	
	public Component(int number, String word) {
		this.number = number;
		this.word = word;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	@Override
	public String toString() {
		return "Component [number=" + number + ", word=" + word + "]";
	}
}
