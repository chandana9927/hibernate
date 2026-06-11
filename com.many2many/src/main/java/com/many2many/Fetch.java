package com.many2many;

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
		
		Student s = manager.find(Student.class, 1);
		System.out.println(s.getRollno());
		System.out.println(s.getName());
		System.out.println(s.getAge());
		
		List<Subject> x = s.getSubjects();
		for(Subject sub : x) {
			System.out.println(sub.getId());
			System.out.println(sub.getName());
			System.out.println(sub.getTrainer());
		}
		

	}

}
