package com.deloitte.app;



import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.deloitte.model.*;
import com.deloitte.myappexceptions.InvalidCustomerAddressException;
import com.deloitte.myappexceptions.InvalidCustomerBillAmountException;
import com.deloitte.myappexceptions.InvalidCustomerIdException;
import com.deloitte.myappexceptions.InvalidCustomerNameException;


public class CustomerApp {

	public static void main (String args[]) throws FileNotFoundException, IOException, InvalidCustomerBillAmountException, InvalidCustomerIdException, InvalidCustomerNameException, InvalidCustomerAddressException
	{
		Customer c=null;
		
			/*try {
				c = new Customer(1, "Potato", "Bombay",345);
			} catch (InvalidCustomerIdException | InvalidCustomerNameException | InvalidCustomerAddressException|InvalidCustomerBillAmountException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(c); */
			
			saveObjectToFile();
	}
			
			private static void saveObjectToFile() throws FileNotFoundException, IOException, InvalidCustomerBillAmountException, InvalidCustomerIdException, InvalidCustomerNameException, InvalidCustomerAddressException {
				Customer cus = new Customer (566, "Tanvi", "Bombay",345);
				ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream("sai.txt"));
				stream.writeObject(cus);
				stream.close();
				System.out.println(cus);


		}
	}
	
