package com.bm.jeu.common.net;

public class EncodedString {
	
	@SuppressWarnings("rawtypes")
	private Class className;
	private String EncodedMessage;

	@SuppressWarnings("rawtypes")
	public EncodedString(Class clazz, String encodedMessage) {
		EncodedMessage = encodedMessage;
		className = clazz;
	}

	public String getEncodedMessage() {
		return EncodedMessage;
	}

	public void setEncodedMessage(String encodedMessage) {
		EncodedMessage = encodedMessage;
	}

	@SuppressWarnings("rawtypes")
	public Class getClassName() {
		return className;
	}

	@SuppressWarnings("rawtypes")
	public void setClassName(Class className) {
		this.className = className;
	}

	@Override
	public String toString() {
		return "EncodedString [EncodedMessage=" + EncodedMessage + "]";
	}
	
	

}
