package com.deloitte.client;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.Scanner;
import com.deloitte.customer.db.CustomerJDBCOperations;

public class Client {

	 public static void main(String[] args) throws ClassNotFoundException, SQLException, FileNotFoundException {
		
		System.out.println("\n M E N U ");
		System.out.println("\n1.Display all Customers");
		System.out.println("\n2. Insert Customer Details");
		System.out.println("\n3. Delete a Record");
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("\nPlease enter your choice");
		int option = scanner.nextInt();
		if(option ==1)
			CustomerJDBCOperations.printAllRecords();
		if (option ==2)
			CustomerJDBCOperations.insertRecord();
		if (option ==3)
			CustomerJDBCOperations.deleteRecord();
		
		scanner.close();
	}
	
	

}
