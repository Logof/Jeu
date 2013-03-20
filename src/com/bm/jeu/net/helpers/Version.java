package com.bm.jeu.net.helpers;

public class Version {
	
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
