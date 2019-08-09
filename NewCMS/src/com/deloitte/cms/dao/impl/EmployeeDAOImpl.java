package com.deloitte.cms.dao.impl;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.deloitte.cms.dao.EmployeeDAO;
import com.deloitte.cms.model.Employee;
import com.deloitte.utility.DbUtility;

public class EmployeeDAOImpl implements EmployeeDAO {
	
	private static final String INSERT_employee_QUERY = "insert into hr.employee values(?,?,?,?,?)";
	private static final String GET_employee_QUERY = "select * from hr.employee ";

	@Override
	public List<Employee> getAllEmployees() {
		Connection connection = DbUtility.getMyConnection();
		List<Employee> allemployee = new ArrayList<Employee>();
		try {
			PreparedStatement statement = connection.prepareStatement(GET_employee_QUERY);
			ResultSet resultSet = statement.executeQuery();
			while(resultSet.next())
			{
				Employee employee = new Employee();
				employee.setFname(resultSet.getString(1));
				employee.setLastName(resultSet.getString(2));
				employee.setEmpid(resultSet.getString(3));
				employee.setDOB(resultSet.getString(4));
				employee.setAddress(resultSet.getString(5));
				allemployee.add(employee);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return allemployee;
	}

	@Override
	public boolean insertEmployee (Employee employee)  {
		Connection connection = DbUtility.getMyConnection();
		PreparedStatement statement;
		int resultSet =0;
		try {
			statement = connection.prepareStatement(INSERT_employee_QUERY);
			statement.setString(1, employee.getFname());
			statement.setString(2, employee.getLastName());
			statement.setString(3, employee.getEmpid());
			statement.setString(4, employee.getDOB());
			statement.setString(5, employee.getAddress());
			resultSet = statement.executeUpdate();
			if(resultSet==0)
				return false;
			else return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return false;
	}

	

}
