package com.hms.deloitte.service;

import com.hms.deloitte.model.Transaction;

public interface TransactionService {

	public void addTransaction (String feed, Integer num); 
	public Transaction getTransactionDetails(Integer cardNumber);
	
}
