package com.one2many;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		Mobile mobile = new Mobile("Vivo", 15000);
		
		Application application = new Application("Qtalk", 50, 1);
		Application application1 = new Application("Whatsapp", 48, 1);
		Application application2 = new Application("Snapchat", 100, 4);
		
		/*List <Application> app = new ArrayList<Application>()
		 * app.add(application)
		 * app.add(application1)
		 * app.add(application2)*/
		
		List<Application> app = Arrays.asList(application, application1, application2);
		mobile.setApp(app);
		
		transaction.begin();
		manager.persist(mobile);
		manager.persist(application);
		manager.persist(application1);
		manager.persist(application2);
		transaction.commit();
	}

}
