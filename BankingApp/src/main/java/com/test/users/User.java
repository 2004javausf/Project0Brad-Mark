package com.test.users;

import java.io.Serializable;

class User implements Serializable {
	private static final long serialVersionUID = -352637876741399998L;
	protected String username;
	protected String password;
	
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
		this.password = password;
	}
}
