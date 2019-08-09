package com.deloitte.dbcon;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbUtility {
	
	public static Connection getMyConnection() throws FileNotFoundException {
		Connection connection =null; //load the driver
		FileReader reader = null;
		Properties properties = new Properties();
		
		try {		
		reader = new FileReader("c:\\deloitte\\mydb.properties");
		properties.load(reader);
		}
		catch (FileNotFoundException e)
		{			
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		String driver = properties.getProperty("driver");
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		
		try {
			Class.forName(driver);
			System.out.println("Driver Loaded");
			connection = DriverManager.getConnection(url, username, password);
			System.out.println("Connected \n");
		}
		catch (ClassNotFoundException e){
			e.printStackTrace();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		return connection;
	}

}
