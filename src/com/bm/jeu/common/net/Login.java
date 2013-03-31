package com.bm.jeu.common.net;

import org.apache.commons.codec.digest.DigestUtils;

public class Login {

	private String username;
	private String password;

	public Login(String username, String password) {
		super();
		this.username = username;
		this.password = hashPassword(password);
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password =hashPassword(password);
	}

	// this part is somewhat replacable to a better hasfunction. now just simple
	// MD5 used
	// Security info: as secure as SSL and the likes are, it's never a good idea
	// to send a plain text password over the network. it's best to create a non
	// reversible hash of it locally, then send the hash.
	private String hashPassword(String password) {
		return DigestUtils.md5Hex(password);
	}

}
