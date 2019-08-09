package com.deloitte.cms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.deloitte.cms.dao.CustomerDAO;
import com.deloitte.cms.model.Customer;

public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerDAO customerDAO;

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return customerDAO.getAllCustomers();
	}

	@Override
	public boolean insertCustomer(Customer customer) {
		// TODO Auto-generated method stub
		if(customer.getCustomerId()>0) {
		return customerDAO.insertCustomer(customer);
		}
		else 
			return false;
	}

	@Override
	public boolean updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		if(customer.getCustomerId()>0) {
		return customerDAO.updateCustomer(customer);
		}
		else 
			return false;
	}

	@Override
	public boolean deleteCustomer(int customerId) {
		// TODO Auto-generated method stub
		return customerDAO.deleteCustomer(customerId);
	}

	@Override
	public Customer searchCustomerById(int customerId) {
		// TODO Auto-generated method stub
		return  customerDAO.searchCustomerById(customerId);
	}

	@Override
	public boolean isCustomerExists(int customerId) {
		// TODO Auto-generated method stub
		return customerDAO.isCustomerExists(customerId);
	}

}