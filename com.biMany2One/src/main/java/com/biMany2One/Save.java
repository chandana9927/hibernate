package com.biMany2One;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save {
	public static void main(String[] args) {
		EntityManagerFactory f = Persistence.createEntityManagerFactory("dev");
		EntityManager m = f.createEntityManager();
		EntityTransaction t = m.getTransaction();
		
//		Girl g = new Girl("Vivo", "bsnl", "orange");
//		
//		Boyfriend b = new Boyfriend("Canara", "duke", "jjk");
//		Boyfriend b1 = new Boyfriend("SBI", "R15", "tom");
//		Boyfriend b2 = new Boyfriend("BOB", "HeroHonda", "Tye");
//		Boyfriend b3 = new Boyfriend("HDFC", "Activa", "Dan");
//		
//		List<Boyfriend> l = Arrays.asList(b,b1,b2,b3);
//		g.setBoyfriends(l);
//		b.setGirl(g);
//		b1.setGirl(g);
//		b2.setGirl(g);
//		b3.setGirl(g);
//		
//		t.begin();
//		m.persist(g);
//		m.persist(b);
//		m.persist(b1);
//		m.persist(b2);
//		m.persist(b3);
//		t.commit();
//		
		//fetch Many to One
		
		Boyfriend b1 = m.find(Boyfriend.class, "HDFC");
		System.out.println(b1.getBank_acc());
		System.out.println(b1.getBike());
		System.out.println(b1.getName());
		
		Girl g1 = b1.getGirl();
		System.out.println(g1.getAcc_name());
		System.out.println(g1.getMob());
		System.out.println(g1.getSim());
		
		//fetch one to many
		
		Girl g2 = m.find(Girl.class, "Vivo");
		System.out.println(g2.getAcc_name());
		System.out.println(g2.getMob());
		System.out.println(g2.getSim());
		
		List <Boyfriend> bf = g1.getBoyfriends();
		for(Boyfriend x : bf) {
			System.out.println(x.getBank_acc());
			System.out.println(x.getBike());
			System.out.println(x.getName());
		}
	}

}
