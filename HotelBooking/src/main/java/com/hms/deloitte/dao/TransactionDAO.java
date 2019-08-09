package com.hms.deloitte.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hms.deloitte.model.Transaction;

@Repository
public interface TransactionDAO extends CrudRepository<Transaction, Integer> {

}
