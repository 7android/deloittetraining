package com.deloitte.myappexceptions;

public class InvalidCustomerAddressException extends Exception {

	public InvalidCustomerAddressException() {
	}
	public InvalidCustomerAddressException(String message) {
		super (message);
	}
}
