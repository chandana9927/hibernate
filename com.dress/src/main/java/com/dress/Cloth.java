package com.dress;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cloth {
	@Id
	private int id;
	private String name;
	private String brand;
	private int price;
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
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Cloth(int id, String name, String brand, int price) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Cloth [id=" + id + ", name=" + name + ", brand=" + brand + ", price=" + price + "]";
	}
	public Cloth() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
