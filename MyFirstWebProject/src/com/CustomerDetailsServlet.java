package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.deloitte.cms.dao.CustomerDAO;
import com.deloitte.cms.dao.impl.CustomerDAOImpl;
import com.deloitte.cms.model.Customer;

/**
 * Servlet implementation class CustomerDetailsServlet
 */
public class CustomerDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerDetailsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    int counter = 0;
 	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 		System.out.println("Service");
 		
 		int customerId = Integer.parseInt(request.getParameter("customerId"));
 		String customerName = request.getParameter("customerName");
 		String customerAddress = request.getParameter("customerAddress");
 		int billAmount = Integer.parseInt(request.getParameter("billAmount"));

 		
 		response.setContentType("text/html");
 		response.getWriter().println("<h1>Customer ID is: "+customerId+" </h1>");  
 		response.getWriter().println("<h1>Customer Name is: "+customerName+" </h1>");
 		response.getWriter().println("<h1>Customer Address is: "+customerAddress+" </h1>");
 		response.getWriter().println("<h1>Customer Bill Amount is: "+billAmount+" </h1>");
 		
 		Customer customer = new Customer(customerId, customerName, customerAddress, billAmount);
 		CustomerDAO customerDAO = new CustomerDAOImpl();
 		boolean result = customerDAO.insertCustomer(customer);
 		if(result)
 			response.getWriter().println("<H1>"+customerName +" : your record has been saved</H1>");
 		else
 			response.getWriter().println("<H1>"+customerName +" : your record has not been saved</H1>");
 		
 		response.getWriter().println("<h1><a href = 'index.html'>index</a> </h1>");
 		response.getWriter().println("<h1><a href = 'hello.html'>Hello</a> </h1>");
 		response.getWriter().println("<h1><a href = 'secondServlet'>Second</a></h1> ");

 	}


}
