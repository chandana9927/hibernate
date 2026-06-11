package com.mock;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertData {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		Wpl w1 = new Wpl("RCB", "Bangalore", "Mandhana");
		Wpl w2 = new Wpl("DC", "Delhi", "Lanning");
		Wpl w3 = new Wpl("MI", "Mumbai", "Kaur");
		Wpl w4 = new Wpl("GG", "Gujarat", "Mooney");
//		
		Wpl w5 = new Wpl();
		w5.setTeam_name("UP Warriors");
		w5.setPlace("UP");
		w5.setCaptain("Healy");
		
		transaction.begin();
		manager.persist(w1);
		manager.persist(w2);
		manager.persist(w3);
		manager.persist(w4);
		manager.persist(w5);
		transaction.commit();

	}

}
