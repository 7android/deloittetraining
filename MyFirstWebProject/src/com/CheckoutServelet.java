package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CheckoutServelet
 */
public class CheckoutServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckoutServelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String[] product = request.getParameterValues("product");
		int cost = 0;

		if (product == null) {
			response.getWriter().println("<h1>You have not selected any item, go back <br></h1>");

		}
		else
		{
			response.getWriter().println("<h1>You items selected and total are <br></h1>");
			for(int i=0;i<product.length;i++)
	       {
			 cost +=10;
		response.getWriter().println("<h1>Product "+(i+1)+" = "+product[i] +"<br></h1>");
	       }
			HttpSession session = request.getSession();
			session.setAttribute("cost", cost);
			
		response.getWriter().println("<h1>Total cost = "+cost +"</font><br></h1>");
		response.getWriter().println("<h1><a href = 'payment'>Payment</a><br></h1>");

		}
	}

}
