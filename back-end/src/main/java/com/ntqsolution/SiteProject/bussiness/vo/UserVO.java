package com.ntqsolution.SiteProject.bussiness.vo;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;

import com.ntqsolution.SiteProject.repository.entites.Division;
import com.ntqsolution.SiteProject.repository.entites.Team;

public class UserVO {
	private int id;
	@Email
	@NotNull
	private String email;
	private String name;
	@NotNull
	private Team team;
	@NotNull
	private Division division;

	public String getEmail() {
		return email;
	}

	public String getName() {
		return name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public Division getDivision() {
		return division;
	}

	public void setDivision(Division division) {
		this.division = division;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
