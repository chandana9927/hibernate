package com.one2many;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Application {
	@Id
	private String name;
	private int size;
	private int rating;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public Application() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Application(String name, int size, int rating) {
		super();
		this.name = name;
		this.size = size;
		this.rating = rating;
	}
	
	
}
