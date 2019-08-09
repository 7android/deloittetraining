package com.oracle.springtraining.coupling1;

public class Client {

	public static void main(String[] args) {
		PaymentService paymentService = new PaymentService("123456");
		paymentService.pay(9000);
	}
}
