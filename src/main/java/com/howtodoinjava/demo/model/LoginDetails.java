package com.howtodoinjava.demo.model;

public class LoginDetails {
	
	private String loginName;
	private String password;
	
	public void LoginDetails(String loginName, String password) {
		this.loginName= loginName;
		this.password= password;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
