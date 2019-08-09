package com.asv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.deloitte.cms.dao.CustomerDAO;
import com.deloitte.cms.dao.impl.CustomerDAOImpl;
import com.deloitte.cms.model.Customer;
import com.deloitte.cms.service.CustomerService;

@Controller
public class CustomerController {
	
	@Autowired
	CustomerService customerService;

	@RequestMapping("/add")
	public String a() {
		return "addCustomer";
	}
	
	@RequestMapping("/update")
	public String b() {
		return "updateCustomer";
	}
	
	@RequestMapping("/del")
	public String c() {
		return "deleteCustomer";
	}
	
	@RequestMapping("/find")
	public String d() {
		return "findCustomerById";
	}
	
	@RequestMapping("/all")
	public String e() {
		return "allCustomer";
	}
	
	@RequestMapping("/addCustomer")
	public ModelAndView addCustomer(Customer customer)
	{
		
		customerService.insertCustomer(customer);
		return new ModelAndView ("success", "a", customer);
	}
	
	@RequestMapping("/updateCustomer")
	public ModelAndView updateCustomer(Customer customer)
	{
		
		customerService.updateCustomer(customer);
		return new ModelAndView ("success", "a", customer);
	}
	
	@RequestMapping("/CustomerByIdForm")
	public ModelAndView CustomerByIdForm(Customer customer)
	{
		return new ModelAndView ("CustomerbyId", "command", new Customer());
	}
	
	@RequestMapping("/CustomerById")
	public ModelAndView CustomerById(Customer customer)
	{
		Customer customer2 = new Customer();
		customer2 = customerService.searchCustomerById(customer.getCustomerId());
		return new ModelAndView ("CustomerbyId", "command", customer2);
	}
}
