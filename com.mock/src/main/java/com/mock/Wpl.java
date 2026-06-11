package com.mock;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Wpl {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int teamid;
	private String team_name;
	private String place;
	private String Captain;
	public int getTeamid() {
		return teamid;
	}
	public void setTeamid(int teamid) {
		this.teamid = teamid;
	}
	public String getTeam_name() {
		return team_name;
	}
	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getCaptain() {
		return Captain;
	}
	public void setCaptain(String captain) {
		Captain = captain;
	}
	public Wpl() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Wpl(String team_name, String place, String captain) {
		super();
		this.team_name = team_name;
		this.place = place;
		Captain = captain;
	}
	
	
}
