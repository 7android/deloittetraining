package com.pms.deloitte.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import com.pms.deloitte.model.Product;

@org.springframework.stereotype.Repository
public interface ProductDAO extends CrudRepository<Product, Integer> {
 
	public List <Product> findByProductName (String productName);
	public List <Product> findByPriceBetween (int minimum, int maximum);

}
