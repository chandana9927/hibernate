package com.one2many;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Mobile {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int imci;
	private String name;
	private int price;
	
	@OneToMany
	List<Application> app;

	public int getImci() {
		return imci;
	}

	public void setImci(int imci) {
		this.imci = imci;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public List<Application> getApp() {
		return app;
	}

	public void setApp(List<Application> app) {
		this.app = app;
	}

	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mobile(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	
	
	

}
