package com.deloitte.myappexceptions;

public class InvalidCustomerNameException extends Exception {
	
	public InvalidCustomerNameException() {
	}
	public InvalidCustomerNameException(String message)
	{
		super(message);
	}
	

}
