package com.hms.deloitte.service;

import com.hms.deloitte.model.Payment;

public interface PaymentService {

	public boolean verify (Payment p);
	public Payment getPaymentDetails (Integer id);
}
