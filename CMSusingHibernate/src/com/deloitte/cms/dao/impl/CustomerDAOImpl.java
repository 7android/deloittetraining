package com.deloitte.cms.dao.impl;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.deloitte.cms.dao.CustomerDAO;
import com.deloitte.cms.model.Customer;
import com.deloitte.utility.DbUtility;

public class CustomerDAOImpl implements CustomerDAO {
	
	Configuration configuration = new Configuration().configure();
	SessionFactory factory = configuration.buildSessionFactory();
	Session session ;

	
	private static final String SELECT_CUSTOMER_QUERY = "select * from hr.customer where customerId =?";
	private static final String INSERT_CUSTOMER_QUERY = "insert into hr.customer values(?,?,?,?)";
	private static final String UPDATE_CUSTOMER_QUERY = "UPDATE hr.customer set customername =?,customeraddress=?,billamount=?  where customerId =?";
	private static final String DELETE_CUSTOMER_QUERY = "delete from hr.customer where customerId =?";
	private static final String GET_CUSTOMER_QUERY = "select * from hr.customer ";
   
	
	@Override
	public List<Customer> getAllCustomers() {
	/*	Connection connection = DbUtility.getMyConnection();
		List<Customer> allCustomer = new ArrayList<Customer>();
		try {
			PreparedStatement statement = connection.prepareStatement(GET_CUSTOMER_QUERY);
			ResultSet resultSet = statement.executeQuery();
			while(resultSet.next())
			{
				Customer customer = new Customer();
				customer.setCustomerId(resultSet.getInt(1));
				customer.setCustomerName(resultSet.getString(2));
				customer.setCustomerAddress(resultSet.getString(3));
				customer.setBillAmount(resultSet.getInt(4));
				allCustomer.add(customer);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
		}
	 	*/
		
		//OR
		
	//	List<Customer> allCustomer = new ArrayList<Customer>();
	//	session = factory.openSession();
	//	Query query = session.createQuery("from com.deloitte.cms.model.Customer");
	//	return query.list();
		
		//OR
		session = factory.openSession();
		Criteria criteria = session.createCriteria(Customer.class);
		criteria.add(Restrictions.like("customerAddress", "Kochi"));
		return criteria.list();
		
		//OR
		
	//	Iterator<Customer> iterator = query.iterate();
	//	while(iterator.hasNext())
	//	{
	//		Customer customer = iterator.next();
	//		allCustomer.add(customer);
	//	}
		
	//	return allCustomer;
	}

	@Override
	public boolean insertCustomer(Customer customer)  {
	/*	Connection connection = DbUtility.getMyConnection();
		PreparedStatement statement;
		int resultSet =0;
		try {
			statement = connection.prepareStatement(INSERT_CUSTOMER_QUERY);
			statement.setInt(1, customer.getCustomerId());
			statement.setString(2, customer.getCustomerName());
			statement.setString(3, customer.getCustomerAddress());
			statement.setInt(4, customer.getBillAmount());
			resultSet = statement.executeUpdate();
			if(resultSet==0)
				return false;
			else return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return false; */
		
		session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(customer);
		transaction.commit();
		session.close();

		System.out.println(customer.getCustomerName()+" your data has been saved!");
		
		return true;
	}

	@Override
	public boolean updateCustomer(Customer customer) {
		/*Connection connection = DbUtility.getMyConnection();
		PreparedStatement statement;
		int resultSet =0;
		try {
			statement = connection.prepareStatement(UPDATE_CUSTOMER_QUERY);
			statement.setInt(4, customer.getCustomerId());
			statement.setString(1, customer.getCustomerName());
			statement.setString(2, customer.getCustomerAddress());
			statement.setInt(3, customer.getBillAmount());
			resultSet = statement.executeUpdate();
			if(resultSet==0)
				return false;
			else return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.update(customer);
		transaction.commit();
		session.close();

		System.out.println(customer.getCustomerName()+" your record has been updated!");
		
		return false;
	}

	@Override
	public boolean deleteCustomer(int customerId) {
		/*Connection connection = DbUtility.getMyConnection();
		PreparedStatement statement;
		int resultSet =0;
		try {
			statement = connection.prepareStatement(DELETE_CUSTOMER_QUERY);
			statement.setInt(1, customerId);
			resultSet = statement.executeUpdate();
			if(resultSet==0)
				return false;
			else return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	*/
		
		session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Customer customer = new Customer();
		customer.setCustomerId(customerId);
		session.delete(customer);
		transaction.commit();
		session.close();
		
		System.out.println(customer.getCustomerName()+" your data has been deleted!");
		
		
		return false;
	}

	@Override
	public Customer searchCustomerById(int customerId) {
		/*Connection connection = DbUtility.getMyConnection();
		Customer customer = new Customer();
		try {
			PreparedStatement statement = connection.prepareStatement(SELECT_CUSTOMER_QUERY);
			statement.setInt(1, customerId);
			ResultSet resultSet = statement.executeQuery();
			resultSet.next();
			
			customer.setCustomerId(resultSet.getInt(1));
			customer.setCustomerName(resultSet.getString(2));
			customer.setCustomerAddress(resultSet.getString(3));
			customer.setBillAmount(resultSet.getInt(4));

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Customer customer = new Customer();
		
		customer = (Customer)session.get(Customer.class, customerId);
		transaction.commit();
		session.close();

		return customer;
	}

	@Override
	public boolean isCustomerExists(int customerId) {
		
	/*	Connection connection = DbUtility.getMyConnection();
		boolean isUserExists =false;
		try {
			PreparedStatement statement = connection.prepareStatement(SELECT_CUSTOMER_QUERY);
			statement.setInt(1, customerId);
			ResultSet resultSet = statement.executeQuery();
			if(resultSet.next())
			{ isUserExists = true;
			  return isUserExists;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Customer customer = new Customer();
		
		customer = (Customer)session.get(Customer.class, customerId);
		transaction.commit();
		session.close();

		if (customer == null)
			return false;
		else
			return true;
		
		
	}

}
