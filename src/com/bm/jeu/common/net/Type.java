package com.bm.jeu.common.net;

public class Type {
	
	//TODO: Define some packet types
	//testwise let's define component as 1;
	public static final byte UNKNOWN = (byte) -1;
	public static final byte HEARTBEAT = (byte) 0;
	public static final byte GAME = (byte) 1;
	public static final byte LOGOUT = (byte) 10;
	public static final byte LOGIN = (byte) 11;

	private byte TYPE = UNKNOWN;

	public Type(byte type) {
		TYPE=type;
	}
	
	public byte getByteValue(){
		return TYPE;
	}

}
