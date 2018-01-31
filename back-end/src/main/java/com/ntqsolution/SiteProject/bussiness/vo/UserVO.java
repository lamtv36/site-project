package com.ntqsolution.SiteProject.bussiness.vo;

public class UserVO {
	private int id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private String email;
	private String name;
	private String password;
	
	public String getEmail() {
		return email;
	}
	public String getName() {
		return name;
	}
	public String getPassword() {
		return password;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
