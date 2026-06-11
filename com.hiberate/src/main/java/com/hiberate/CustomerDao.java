package com.hiberate;

import java.util.List;
//Data accessing objects

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CustomerDao {
	
	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
	private EntityManager manager = factory.createEntityManager();
	private EntityTransaction transaction = manager.getTransaction();
	
	public void save(Customer c) {
		transaction.begin();
		manager.persist(c);
		transaction.commit();
	}
	
	public Customer fetch(int id) {
		Customer c = manager.find(Customer.class, id);
		return c;
	}
	
	public List<Customer> fetchAll() {
		List<Customer> c = manager.createQuery("select s from Customer s").getResultList();
		for(Customer x : c) {
			return c;
		}
		return c;
	}
	
	public void update(Customer c) {
		transaction.begin();
		manager.merge(c);
		transaction.commit();
	}
	
	public void delete(Customer c) {
		transaction.begin();
		manager.remove(c);
		transaction.commit();
	}

}
