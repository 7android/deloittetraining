/*package com.pms.deloitte.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pms.deloitte.dao.ProductDAO;
import com.pms.deloitte.model.Product;
import com.pms.deloitte.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	ProductService productService;
	
	@RequestMapping("/product")
	public String gettProduct(Model model) {
		model.addAttribute("pr", new Product());
		return "product";
	}
	
	@RequestMapping("/addProduct")
	public String addProduct() {
		Product product = new Product(2, "Rin", 10, 1000);
		productService.addProduct(product);
		return "Product saved successfully";
	}
		
	@RequestMapping("/updateProduct")
	public String updateProduct() {
		Product product = new Product(2, "Rin", 10, 7000);
		productService.updateProduct(product);
		return "Product updated successfully";
	}
		
	@RequestMapping("/deleteProduct/{pId}")
	public String deleteProduct(@PathVariable ("pId") Integer productId) {
		productService.deleteProduct(productId);
		return "Product deleted successfully";
	}
	
	@RequestMapping("/listProduct")
	public List<Product> listProduct() {
		List<Product> product = productService.getAllProduct();
		return product;
	}	
	
	@RequestMapping("/getProduct/{pId}")
	public Product getProduct(@PathVariable ("pId") Integer productId) {
		Product product = productService.getProductById(productId);
		return product;
				
	}
	
	@RequestMapping("/findByName/{proName}")
	public List<Product> findByProductName (@PathVariable ("proName")String productName){
		List <Product> product = productService.findByName(productName);
		return product;
	}
	
	@RequestMapping("/findBetween/{min}/{max}")
	public List<Product> getBetween (@PathVariable ("min")Integer minimum, @PathVariable ("max")Integer maximum){
		List <Product> product = productService.findBetween(minimum, maximum);
		return product;
	}
}
*/