package com.bm.jeu.net.helpers;

public class Type {

	private byte[] TYPE = { 0, 0 };

	public Type(byte[] type) {
		if (type.length == 2) {
			TYPE = type;
		}
	}
	
	public byte[] getByteValue(){
		return TYPE;
	}

}
