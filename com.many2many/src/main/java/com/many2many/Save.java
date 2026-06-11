package com.many2many;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		Student s = new Student(1,"abc",23);
		Student s1 = new Student(2,"def",22);
		Student s2 = new Student(3,"ghi",27);
		Student s3 = new Student(4,"jkl",21);
		
		Subject a = new Subject(101,"Math", "Loki");
		Subject a1 = new Subject(102,"Chem", "Thor");
		Subject a2 = new Subject(103,"Phy", "Poseidon");
		Subject a3 = new Subject(104,"CS", "Zuke");
		
		List<Subject> subjects = Arrays.asList(a,a1,a2,a3);
		s.setSubjects(subjects);
		s1.setSubjects(subjects);
		s2.setSubjects(subjects);
		s3.setSubjects(subjects);
		
		transaction.begin();
		manager.persist(s);
		manager.persist(s1);
		manager.persist(s2);
		manager.persist(s3);
		
		manager.persist(a);
		manager.persist(a1);
		manager.persist(a2);
		manager.persist(a3);
		
		transaction.commit();
	}
}
