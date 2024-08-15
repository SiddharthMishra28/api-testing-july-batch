package com.rest.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Token {
	
	@JsonProperty("token")
	private String abcd;

	public String getToken() {
		return abcd;
	}

	public void setToken(String token) {
		this.abcd = token;
	}
	
	
}
