package com.bank;



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
		
		Accounts a = manager.find(Accounts.class, 1);
		System.out.println(a.getNo());
		System.out.println(a.getName());
		System.out.println(a.getType());
		Bank b = a.getBank();
		System.out.println(b.getIfsc());
		System.out.println(b.getName());
		System.out.println(b.getBranch());
		List<Accounts> acc = manager.createQuery("select s from Accounts s").getResultList();
		for(Accounts x : acc) {
			System.out.println(x.getNo());
			System.out.println(x.getName());
			System.out.println(x.getType());
			System.out.println(x.getBank().getName());
		}
	}

}
