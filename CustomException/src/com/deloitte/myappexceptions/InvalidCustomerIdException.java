package com.deloitte.myappexceptions;


public class InvalidCustomerIdException extends Exception {
	
	public InvalidCustomerIdException() 
	{
	}
	
public InvalidCustomerIdException(String message)
{
	super(message);
}

}
