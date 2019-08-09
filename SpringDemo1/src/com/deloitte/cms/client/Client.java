package com.deloitte.cms.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.deloitte.cms.model.Address;
import com.deloitte.cms.model.Customer;

public class Client {

	public static void main (String[] args)
	{
		Resource resource = new ClassPathResource("beans.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Customer customer = (Customer) factory.getBean("cust");
				
		System.out.println(customer);
	}
}
 