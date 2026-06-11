package com.biDir;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save {
	public static void main(String[] args) {
		EntityManagerFactory f = Persistence.createEntityManagerFactory("dev");
		EntityManager m = f.createEntityManager();
		EntityTransaction t = m.getTransaction();

//		Groom g = new Groom(1000000, 2, "Tom");
//		Bride b = new Bride(2, "Lilly", 21);
//		g.setBride(b);
//		b.setGroom(g);
//
//		t.begin();
//		m.persist(b);
//		m.persist(g);
//		t.commit();

		// fetch

		Groom g1 = m.find(Groom.class, 1000000);
		System.out.println(g1.getSal());
		System.out.println(g1.getProperty());
		System.out.println(g1.getName());
		Bride b1 = g1.getBride();
		System.out.println(b1.getEx_bf());
		System.out.println(b1.getName());
		System.out.println(b1.getAge());
		
		Bride b2 = m.find(Bride.class, 2);
		System.out.println(b2.getEx_bf());
		System.out.println(b2.getName());
		System.out.println(b2.getAge());
		Groom g2 = b2.getGroom();
		System.out.println(g2.getSal());
		System.out.println(g2.getProperty());
		System.out.println(g2.getName());
	}

}
