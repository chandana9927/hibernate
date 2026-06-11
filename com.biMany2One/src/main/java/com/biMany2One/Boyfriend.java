package com.biMany2One;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Boyfriend {
	@Id
	private String bank_acc;
	private String bike;
	private String name;
	@ManyToOne
	private Girl girl;
	public String getBank_acc() {
		return bank_acc;
	}
	public void setBank_acc(String bank_acc) {
		this.bank_acc = bank_acc;
	}
	public String getBike() {
		return bike;
	}
	public void setBike(String bike) {
		this.bike = bike;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Girl getGirl() {
		return girl;
	}
	public void setGirl(Girl girl) {
		this.girl = girl;
	}
	public Boyfriend() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Boyfriend(String bank_acc, String bike, String name) {
		super();
		this.bank_acc = bank_acc;
		this.bike = bike;
		this.name = name;
	}
	
	
	
}
