package com.deloitte.client;

public class PaymentClient {

	public static void main(String[] args) {
		Payment payment1 = Payment.getPaymentObj();
		Payment payment2 = Payment.getPaymentObj();
		Payment payment3 = Payment.getPaymentObj();
		
		payment1.pay(9000);
		payment2.pay(4000);
		payment3.pay(7000);
	}

}
