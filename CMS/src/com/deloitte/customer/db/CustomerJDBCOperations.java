package com.deloitte.customer.db;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.deloitte.dbcon.DbUtility;

public class CustomerJDBCOperations {

		
	
	
	public static void printAllRecords() throws ClassNotFoundException, SQLException, FileNotFoundException {
		
		Connection connection = DbUtility.getMyConnection();
		
		Statement statement = connection.createStatement(); //create statement
		ResultSet res = statement.executeQuery("select * from hr.customer"); //execute statement
		
		while (res.next())
		{
			System.out.print(res.getString(1)+" ");
			System.out.print(res.getString(2)+" ");
			System.out.print(res.getString(3)+" ");
			System.out.println(res.getString(4));
		}
		
	}
	
	public static void insertRecord() throws ClassNotFoundException, SQLException, FileNotFoundException {
		
		Connection connection = DbUtility.getMyConnection();
	
		Scanner scanner = new Scanner (System.in);
		System.out.println("\nPlease enter the record to be added");
		System.out.println("Enter the Customer ID");
		int id = Integer.parseInt(scanner.nextLine());
		System.out.print("Enter the Name: \n");
		String name = scanner.nextLine();
		System.out.print("Enter the Address:\n ");
		String addr = scanner.nextLine();
		System.out.print("Enter the Bill Amount:\n ");
		int bill = Integer.parseInt(scanner.nextLine());
		scanner.close();
		
		/*Statement statement = connection.createStatement(); //create statement
		int noOfRecords = statement.executeUpdate("insert into hr.customer values ("+id+",'"+name+"','"+addr+"',"+bill+")");
		*/
		
		PreparedStatement statement = connection.prepareStatement("insert into hr.customer values(?,?,?,?)");
		statement.setInt(1, id);
		statement.setString(2, name);
		statement.setString(3, addr);
		statement.setInt(4, bill);
		int noOfRecords = statement.executeUpdate();
		
		System.out.println(noOfRecords + " affected");
		
	}
	
	public static void deleteRecord() throws FileNotFoundException, SQLException {
		
		Connection connection = DbUtility.getMyConnection();
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("\nPlease enter the name of the record to be deleted");
		String name = scanner.nextLine();
		scanner.close();
		connection.prepareStatement("delete from hr.customer where customername = '"+name+"'");
		System.out.println("Record deleted");
	}

}

