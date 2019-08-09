package jdbcdemos;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Demo1 {
	public static void main (String[] args) throws ClassNotFoundException, SQLException
	{
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Please enter your choice 1. View all \n 2. Insert record");
		int option = scanner.nextInt();
		if(option ==1)
			printAllRecords();
		if (option ==2)
			insertRecord();
		sayThanks();
		
	}
	public static void sayThanks() {
		System.out.println("\nThank you for using this program!");
	}
	
	public static void printAllRecords() throws ClassNotFoundException, SQLException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver Loaded");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
		System.out.println("Connected \n");
		
		Statement statement = connection.createStatement(); //create statement
		ResultSet res = statement.executeQuery("select * from hr.student"); //execute statement
		
		while (res.next())
		{
			System.out.print(res.getString(1)+" ");
			System.out.println(res.getString(2));
		}
	}
	
	public static void insertRecord() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver Loaded");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
		System.out.println("Connected\n");
		
		Statement statement = connection.createStatement(); //create statement
		int noOfRecords = statement.executeUpdate("insert into hr.student values (100,'Kalpana')");
		System.out.println(noOfRecords + " affected");
		
	}

}
