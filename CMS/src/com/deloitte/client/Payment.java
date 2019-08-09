package com.deloitte.client;

public class Payment {
	
	static Payment payment = new Payment (); //create private constructor
	private Payment() {
		System.out.println("Object of Payment Created");
	}
	
	public static Payment getPaymentObj() {
		return payment;
	}
	
	public void pay(int amount) {
		System.out.println("Payment done in INR: "+amount);
	}
}
