package com.bank;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
public class Save {
public static void main(String[] args) {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
	EntityManager manager = factory.createEntityManager();
	EntityTransaction transaction = manager.getTransaction();
	
	Bank b = new Bank(3189,"Canara","rajajinagar");
	Accounts a1 = new Accounts(1, "abc", "saving", b);
	Accounts a2 = new Accounts(2, "pqr", "current", b);
	Accounts a3 = new Accounts(3, "xyz", "loan", b);
	transaction.begin();
	manager.persist(b);
	manager.persist(a1);
	manager.persist(a2);
	manager.persist(a3);
	transaction.commit();
}

}
