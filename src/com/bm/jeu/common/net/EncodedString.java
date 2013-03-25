package com.bm.jeu.common.net;

public class EncodedString {
	
	String EncodedMessage;

	public EncodedString(String encodedMessage) {
		EncodedMessage = encodedMessage;
	}

	public String getEncodedMessage() {
		return EncodedMessage;
	}

	public void setEncodedMessage(String encodedMessage) {
		EncodedMessage = encodedMessage;
	}

	@Override
	public String toString() {
		return "EncodedString [EncodedMessage=" + EncodedMessage + "]";
	}
	
	

}
