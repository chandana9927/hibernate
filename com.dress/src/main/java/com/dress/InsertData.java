package com.dress;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("chandana");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		Cloth c1 = new Cloth(1, "tracksuit", "Addidas", 1800);
		Cloth c2 = new Cloth(2, "shoe", "Snickers", 2000);
		Cloth c3 = new Cloth(3, "pant", "Zara", 2800);
		Cloth c4 = new Cloth(4, "shirt", "h&m", 3000);
		
		transaction.begin();
		manager.persist(c1);
		manager.persist(c2);
		manager.persist(c3);
		manager.persist(c4);
		transaction.commit();
	}

}
