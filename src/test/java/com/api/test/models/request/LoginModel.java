package com.api.test.models.request;

public class LoginModel {
	
	private String email;
	private String password;
	
	public LoginModel setEmail(String email) {
		this.email = email;
		return this;
	}
	
	public LoginModel setPassword(String password) {
		this.password = password;
		return this;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}
	
}
