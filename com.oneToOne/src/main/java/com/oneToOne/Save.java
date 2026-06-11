package com.oneToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		Student student = new Student();
		
		student.setRoll_no(1);
		student.setName("Wall");
		student.setAge(23);
		
		Laptop laptop = new Laptop();
		laptop.setIp(101);
		laptop.setName("HP");
		laptop.setPrice(50000);
		student.setLaptop(laptop);
		
		transaction.begin();
		manager.persist(student);
		manager.persist(laptop);
		transaction.commit();
	}

}
