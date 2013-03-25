package com.bm.jeu.common.net;

public class Version {
	
	//TODO: creating Version identifiers/bytes
	
	public static final byte TESTING = 1;
	
	private byte VERSION = -1;
	
	public Version(byte version){
		this.setVERSION(version);
	}

	public byte getVERSION() {
		return VERSION;
	}

	public void setVERSION(byte version) {
		VERSION = version;
	}
	
	public byte getByteValue(){
		return VERSION;
	}

}
