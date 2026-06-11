package com.fectch;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Fetch {
	
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("chandana");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
//		Festival f = new Festival();
//		f.setNo(8);
//		f.setFood("no food");
//		f.setName("MahaShivrathri");
//		f.setOff(0);
//		
//		Festival festival = new Festival();
//		festival.setNo(9);
//		festival.setName("Ugadi");
//		festival.setFood("Hollige");
//		festival.setOff(1);
//		
//		transaction.begin();
//		manager.persist(f);
//		manager.persist(festival);
//		transaction.commit();
		
//		Festival f = new Festival();
//		f.setOff(3);
//		f.setName("Holi");
//		f.setNo(25);
//		f.setFood("ladoo");
//		
//		transaction.begin();
//		manager.persist(f);
//		transaction.commit();
	
		Festival f1 = manager.find(Festival.class, 25);
		System.out.println(f1);
	}

}
