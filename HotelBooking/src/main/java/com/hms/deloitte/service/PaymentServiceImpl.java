package com.hms.deloitte.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hms.deloitte.dao.PaymentDAO;
import com.hms.deloitte.model.Payment;

@Service("paymentService")
public class PaymentServiceImpl implements PaymentService {
	
	@Autowired
	private PaymentDAO paymentDAO;
	
	public void setPaymentDAO(PaymentDAO paymentDAO) {
		this.paymentDAO = paymentDAO;
	}

	@Override
	@Transactional
	public boolean verify(Payment p) {
		Optional<Payment> payment = this.paymentDAO.findById(p.getCardNumber());
		if(payment.isPresent())
		{
			Payment pay = payment.get();
			if (p.getCardNumber() == pay.getCardNumber() && p.getClientName().equals(pay.getClientName()) && p.getCvv() == pay.getCvv() && p.getExpiry().equals(pay.getExpiry()) && p.getPassword().equals(pay.getPassword()))
				return true;
			else
				return false;
		}
		else
		{
			return false;
		}
		
	}

	@Override
	@Transactional
	public Payment getPaymentDetails(Integer id) {
		
		Optional<Payment> payment = this.paymentDAO.findById(id);
		if(payment.isPresent())
		{
			return payment.get();
		}
		else
		{
			return null;
		}
	}
	
	

}
