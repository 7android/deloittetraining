package com.deloitte.cms.dao;

import java.util.List;

import com.deloitte.cms.model.Employee;

public interface EmployeeDAO {
	
	public List<Employee> getAllEmployees ();
	public boolean insertEmployee(Employee employee);

}
