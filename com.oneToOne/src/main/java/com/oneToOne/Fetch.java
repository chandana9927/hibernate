package com.oneToOne;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



public class Fetch {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		Student s=manager.find(Student.class, 1);
		System.out.println(s.getRoll_no());
		System.out.println(s.getName());
		System.out.println(s.getAge());
		Laptop l = s.getLaptop();
		System.out.println(l.getIp());
		System.out.println(l.getName());
		System.out.println(l.getPrice());
		
		List<Student> stud = manager.createQuery("select s from Student s").getResultList();
		for(Student x : stud) {
			System.out.println(x.getRoll_no());
			System.out.println(x.getName());
			System.out.println(x.getAge());
			System.out.println(x.getLaptop().getName());
		}
	}
}
