package com.biMany2One;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Girl {
	@Id
	private String mob;
	private String sim;
	private String acc_name;
	@OneToMany
	private List<Boyfriend> boyfriends;
	public String getMob() {
		return mob;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}
	public String getSim() {
		return sim;
	}
	public void setSim(String sim) {
		this.sim = sim;
	}
	public String getAcc_name() {
		return acc_name;
	}
	public void setAcc_name(String acc_name) {
		this.acc_name = acc_name;
	}
	public List<Boyfriend> getBoyfriends() {
		return boyfriends;
	}
	public void setBoyfriends(List<Boyfriend> boyfriends) {
		this.boyfriends = boyfriends;
	}
	public Girl() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Girl(String mob, String sim, String acc_name) {
		super();
		this.mob = mob;
		this.sim = sim;
		this.acc_name = acc_name;
	}
	
}
