package com.pms.deloitte.service;

import java.util.List;

import com.pms.deloitte.model.Product;

public interface ProductService {
	
	public void addProduct (Product product);
	public void deleteProduct (int productId);
	public void updateProduct (Product product);
	public List<Product> getAllProduct ();
	public Product getProductById (int productId);
	public List <Product> findByName (String productName);
	public List <Product> findBetween (int min, int max);
}
