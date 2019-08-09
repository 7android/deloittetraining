package com.deloitte.client;
import java.util.List;
import java.util.Scanner;

import com.deloitte.cms.dao.EmployeeDAO;
import com.deloitte.cms.dao.impl.EmployeeDAOImpl;
import com.deloitte.cms.model.Employee;

public class EmployeeClient {

	public static void main(String[] args) {
				
		EmployeeDAO employeeDAO = new EmployeeDAOImpl();
		int id = 000;
		while(true)
		{
			System.out.println("M E N U ");
			System.out.println("1. Add Customer ");
			System.out.println("2. Display All Customers ");
			System.out.println("3. E X I T ");

			Scanner scanner = new Scanner(System.in);
			int option = scanner.nextInt();

			if (option == 1) {

					System.out.println("Enter employee first name ");
					String fname = scanner.next();
					System.out.println("Enter employee last name ");
					String lastname = scanner.next();
					//System.out.println("Enter employee ID ");
					//String empid = scanner.next();
					System.out.println("Enter Date of Birth ");
					String dob = scanner.next();
					System.out.println("Enter Address ");
					String address = scanner.next();
					
					String f= fname.substring(0, 2);
					String l = lastname.substring(0, 2);
					id++;
					String empid = f+l+Integer.toString(id);
					
					Employee employee = new Employee(fname, lastname, empid, dob, address);
					employeeDAO.insertEmployee(employee);
					System.out.println(fname + " Record Added");
			
			}

			if (option == 2) {
					List<Employee> allemployees = employeeDAO.getAllEmployees();
					System.out.println(allemployees);
			}
			if (option == 3) {
				System.out.println("Thanks for using for my employee project ");
				System.exit(0);
			
			}

			

		
			
		}
		
	}
}
