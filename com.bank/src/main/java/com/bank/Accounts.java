package com.bank;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Accounts {
	@Id
	private int no;
	private String name;
	private String type;
	@ManyToOne
	private Bank bank;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}
	public Accounts(int no, String name, String type, Bank bank) {
		super();
		this.no = no;
		this.name = name;
		this.type = type;
		this.bank = bank;
	}
	public Accounts() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
