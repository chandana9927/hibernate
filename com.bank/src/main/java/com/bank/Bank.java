package com.bank;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bank {
	@Id
	private int ifsc;
	private String name;
	private String branch;
	public int getIfsc() {
		return ifsc;
	}
	public void setIfsc(int ifsc) {
		this.ifsc = ifsc;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bank(int ifsc, String name, String branch) {
		super();
		this.ifsc = ifsc;
		this.name = name;
		this.branch = branch;
	}

		

}
