package com.hib;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
public class Check {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("chandana");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		Menu m = new Menu();
		m.setSl_no(2);
		m.setName("Fried Rice");
		m.setPrice(250);
		m.setQty(1);
		
		Menu m1 = new Menu();
		m1.setSl_no(3);
		m1.setName("French Fries");
		m1.setPrice(100);
		m1.setQty(1);
		
		Menu m3 = new Menu();
		m3.setSl_no(4);
		m3.setName("Momo");
		m3.setPrice(200);
		m3.setQty(1);
		
		Menu m4 = new Menu();
		m4.setSl_no(5);
		m4.setName("Lemon Juice");
		m4.setPrice(140);
		m4.setQty(3);
		
		transaction.begin();
		manager.persist(m4);
		transaction.commit();
	}
	
}
