package com.deloitte.cms.service;

import java.util.List;

import com.deloitte.cms.model.Customer;

public interface CustomerService {

	public List<Customer> getAllCustomers ();
	public boolean insertCustomer(Customer customer);
	public boolean updateCustomer(Customer customer);
	public boolean deleteCustomer(int customerId);
	public Customer searchCustomerById(int customerId);
	public boolean isCustomerExists(int customerId);

}
