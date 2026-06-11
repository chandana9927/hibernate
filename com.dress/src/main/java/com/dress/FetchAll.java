package com.dress;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("chandana");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
//		Query query=manager.createQuery("select s from Cloth s");
//		List<Cloth> a=query.getResultList();
//		for(Cloth x : a) {
//			System.out.println(x);
//		}
		
		List<Cloth> z=manager.createQuery("select s from Cloth s").getResultList();
		for(Cloth x : z) {
			System.out.println(x);
		}
		
		

	}

}
