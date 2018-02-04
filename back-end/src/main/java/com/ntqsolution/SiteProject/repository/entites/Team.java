package com.ntqsolution.SiteProject.repository.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="m_team")
public class Team {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private int id;
	private String name;
	private String note;
	@OneToOne
	@JoinColumn(name="division_id", nullable= false)
	private Division division;
	
	public Team() {
		
	}
	
	public Team(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public Division getDivision() {
		return division;
	}
	public void setDivision(Division division) {
		this.division = division;
	}
}
