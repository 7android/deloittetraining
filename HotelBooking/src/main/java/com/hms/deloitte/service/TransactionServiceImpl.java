package com.hms.deloitte.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hms.deloitte.dao.TransactionDAO;
import com.hms.deloitte.model.Transaction;
import com.hms.deloitte.service.TransactionService;

@Service("transactionService")
public class TransactionServiceImpl implements TransactionService{
	
	String tr = "TXN60611AC00";
	int i = 1;
	
	@Autowired
	private TransactionDAO transactionDAO;
	
	public void setTransactionDAO (TransactionDAO transactionDAO)
	{
		this.transactionDAO = transactionDAO;
	}

	@Override
	@Transactional
	public void addTransaction(String feed, Integer num) {
		Transaction transaction = new Transaction();
		transaction.setCardNumber(num);
		transaction.setFeedback(feed);
		transaction.setTrnum(tr+i);
		transactionDAO.save(transaction);
		i = i +1;
	}

	@Override
	@Transactional
	public Transaction getTransactionDetails(Integer cardNumber) {
		
		return null;
	}

	
}
