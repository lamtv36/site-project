package com.ntqsolution.SiteProject.repository.entites;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="m_user")
public class User {
	@Id
//    @GeneratedValue(strategy = IDENTITY)
	@Column(unique = true, nullable = false)
	private int id;
	private String name;
	private String email;
	private String password;
	@Column(name="nick_name", nullable = true)
	private String nickName;
	
	public User() {
		
	}
	
	public User(String name, String email, String password, String nickName) {
		this.name = name;
		this.email = email;
		this.password = password;
		this.nickName = nickName;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public int getId() {
		return id;
	}

	public String getNickName() {
		return nickName;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
}
