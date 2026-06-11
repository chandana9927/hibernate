package com.hib;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Menu {
	@Id
	private int sl_no;
	private String name;
	private int price;
	private int qty;
	public int getSl_no() {
		return sl_no;
	}
	public void setSl_no(int sl_no) {
		this.sl_no = sl_no;
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
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public Menu() {
		super();
		// TODO Auto-generated constructor stub
	}

}
