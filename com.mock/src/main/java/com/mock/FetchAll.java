package com.mock;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FetchAll {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		List<Wpl> w = manager.createQuery("Select s from Wpl s").getResultList();
		for(Wpl x : w) {
			System.out.println(x.getTeamid());
			System.out.println(x.getTeam_name());
			System.out.println(x.getPlace());
			System.out.println(x.getCaptain());
		}

	}

}
