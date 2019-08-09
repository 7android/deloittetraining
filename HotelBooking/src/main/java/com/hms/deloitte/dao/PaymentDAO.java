package com.hms.deloitte.dao;

import com.hms.deloitte.model.Payment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentDAO extends CrudRepository<Payment, Integer> {

	
	
}
