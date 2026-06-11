package com.fectch;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Festival {
	@Id
	private int no;
	private String name;
	private String food;
	private int off;
	
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

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public int getOff() {
		return off;
	}

	public void setOff(int off) {
		this.off = off;
	}

	public Festival() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Festival [no=" + no + ", name=" + name + ", food=" + food + ", off=" + off + "]";
	}
	
	
	
}
