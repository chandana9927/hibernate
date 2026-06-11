package com.mock;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FetchData {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		Wpl w = manager.find(Wpl.class, 1);
		System.out.println(w.getTeamid());
		System.out.println(w.getCaptain());
		System.out.println(w.getPlace());
		System.out.println(w.getTeam_name());

	}

}
