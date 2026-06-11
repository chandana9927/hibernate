package com.one2many;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Fetch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		Mobile m = manager.find(Mobile.class, 1);
		System.out.println(m.getImci());
		System.out.println(m.getName());
		System.out.println(m.getPrice());
		
		List<Application> a = m.getApp();
		for(Application b : a) {
			System.out.println(b.getName());
			System.out.println(b.getSize());
			System.out.println(b.getRating());
		}
	}

}
