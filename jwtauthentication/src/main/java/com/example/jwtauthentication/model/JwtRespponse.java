package com.example.jwtauthentication.model;

public class JwtRespponse {

	String token;

	public JwtRespponse() {

	}
	

	public JwtRespponse(String token) {
		super();
		this.token = token;
	}


	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
		
}
