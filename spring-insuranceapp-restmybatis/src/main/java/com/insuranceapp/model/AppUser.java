package com.insuranceapp.model;

import java.util.List;

public class AppUser {
	private String userName;
	private String password;
	private String email;
	private int userId;
	private List<String> roles;
	public AppUser() {
		super();
	}
	public AppUser(String userName, String password, String email, int userId, List<String> roles) {
		super();
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.userId = userId;
		this.roles = roles;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public List<String> getRoles() {
		return roles;
	}
	public void setRoles(List<String> roles) {
		this.roles = roles;
	}
	@Override
	public String toString() {
		return "AppUser [userName=" + userName + ", password=" + password + ", email=" + email + ", userId=" + userId
				+ ", roles=" + roles + "]";
	}
	

}
