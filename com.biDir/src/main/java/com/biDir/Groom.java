package com.biDir;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Groom {
	@Id
	private int sal;
	private int property;
	private String name;
	@OneToOne
	private Bride bride;
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getProperty() {
		return property;
	}
	public void setProperty(int property) {
		this.property = property;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Bride getBride() {
		return bride;
	}
	public void setBride(Bride bride) {
		this.bride = bride;
	}
	public Groom() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Groom(int sal, int property, String name) {
		super();
		this.sal = sal;
		this.property = property;
		this.name = name;
	}
	
	
	
}
