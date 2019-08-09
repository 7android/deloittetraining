package com.deloitte.cms.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.deloitte.cms.model.Customer;

public class client {

	public static void main(String[] args) {

		Customer customer = new Customer(458, "Michelle", "Kochi", 19045);
		Configuration configuration = new Configuration().configure();
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(customer);
		transaction.commit();
		session.close();
		factory.close();
		
		System.out.println(customer.getCustomerName()+" your data has been saved!");
	}

}
