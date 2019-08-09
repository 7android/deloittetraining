package com.deloitte.myappexceptions;

public class InvalidCustomerBillAmountException extends Exception {
	
	public InvalidCustomerBillAmountException() {
	}
	public InvalidCustomerBillAmountException(String message) {
		super(message);
	}

}
