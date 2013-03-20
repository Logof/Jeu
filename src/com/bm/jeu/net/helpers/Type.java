package com.bm.jeu.net.helpers;

public class Type {
	
	//TODO: Define some packet types

	private byte TYPE = -1;

	public Type(byte type) {
		TYPE=type;
	}
	
	public byte getByteValue(){
		return TYPE;
	}

}
