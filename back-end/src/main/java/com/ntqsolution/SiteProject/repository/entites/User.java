package com.ntqsolution.SiteProject.repository.entites;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="m_user")
public class User {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private int id;
	private String name;
	private String email;
	private String password;
	@Column(name="nick_name", nullable = true)
	private String nickName;
	@OneToOne(cascade=CascadeType.ALL)
	private Team team;
	private Date joinDate;
	private String codeFight;
	private boolean active;
	
	
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

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	public String getCodeFight() {
		return codeFight;
	}

	public void setCodeFight(String codeFight) {
		this.codeFight = codeFight;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
}
