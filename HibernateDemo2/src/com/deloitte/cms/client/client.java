package com.deloitte.cms.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.deloitte.cms.model.Customer;
import com.deloitte.cms.model.PremiumCustomer;

public class client {

	public static void main(String[] args) {

		//Customer customer = new Customer(458, "Michelle", "Kochi", 19045);
		Configuration configuration = new Configuration().configure();
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		//Customer customer = new Customer(4,"Potato","Neverland",8888);
		PremiumCustomer customer = new PremiumCustomer(2,"Leslie","Mangalore",11000);
		customer.setRewardPoints(1100); 
		
		session.save(customer);
		transaction.commit();
		session.close();
		factory.close();
		
		System.out.println(customer.getCustomerName()+" your data has been saved!");
	}

}
