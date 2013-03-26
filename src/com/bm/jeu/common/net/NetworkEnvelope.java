package com.bm.jeu.common.net;

import java.util.Arrays;

public class NetworkEnvelope {
	private Version version;
	private Type type;
	private byte[] payload;
	//Note that the payload is in byte form, not String
	
	public NetworkEnvelope() {
	}

	public NetworkEnvelope(Version version, Type type, String payload) {
		this.version = version;
		this.type = type;
		this.payload = payload.getBytes();
	}
	
	public NetworkEnvelope(Version version, Type type, byte[] payload) {
		this.version = version;
		this.type = type;
		this.payload = payload;
	}
	
	public NetworkEnvelope(Version version, Type type, byte payload) {
		this.version = version;
		this.type = type;
		this.payload = new byte[1];
		this.payload[0] = payload;
	}
	
	public Version getVersion() {
		return version;
	}

	public void setVersion(Version version) {
		this.version = version;
	}
	
	public void setVersion(byte version){
		this.version = new Version(version);
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}
	
	public void setType(byte type) {
		this.type = new Type(type);
	}

	public byte[] getPayload() {
		return payload;
	}
	
	public String getPayloadAsString(){
		return new String(payload);
	}

	public void setPayload(byte[] payload) {
		this.payload = payload;
	}
	
	public void setPayload(byte payload) {
		this.payload = new byte[1];
		this.payload[1] = payload;
	}
	
	public int getSize(){
		return 1 + 1 + 4 + this.payload.length;
	}

	@Override
	public String toString() {
		return "NetworkEnvelope [version=" + version + ", type=" + type + ", payload=" + Arrays.toString(payload) + "]";
	}
}