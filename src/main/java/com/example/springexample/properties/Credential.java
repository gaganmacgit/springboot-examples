package com.example.springexample.properties;

public class Credential {

	private String provider;
	private String userName;
	private String password;

	@Override
	public String toString() {
		return "Credential [provider=" + provider + ", userName=" + userName + ", password=" + password + ", client="
				+ client + "]";
	}

	private String client;

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}
}
