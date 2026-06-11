package com.mock;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateData {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		Wpl w = manager.find(Wpl.class, 1);
		w.setCaptain("Smriti Mandhana");
		
		transaction.begin();
		manager.merge(w);
		transaction.commit();

	}

}
