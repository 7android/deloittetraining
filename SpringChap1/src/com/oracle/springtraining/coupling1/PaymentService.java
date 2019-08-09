package com.oracle.springtraining.coupling1;

public class PaymentService {
	
	private SavingsAccount savingsAccount;
	
	public PaymentService(String accNo) {
		savingsAccount = new SavingsAccount(accNo);
	}
	public void pay(int i){
	
		System.out.println("The account number is (tight coupling) "+ this.savingsAccount.getDetails() + " and the amount paid is " + i);
	}
}
