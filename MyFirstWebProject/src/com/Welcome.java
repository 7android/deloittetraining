package com;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Welcome
 */
public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Welcome() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
    int counter = 0;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Service");
		String gn = request.getParameter("name");
		String[] color = request.getParameterValues("color");
		
		if(gn.equals("Tia"))
		{
			HttpSession session = request.getSession();
			session.setAttribute("name", gn);
			RequestDispatcher disp1 = request.getRequestDispatcher("product.html");
			disp1.forward(request,response);
		}
		else
		{
			RequestDispatcher disp1 = request.getRequestDispatcher("InvalidServelet");
			disp1.forward(request,response);
		}
		
		
		if (color == null) {
			response.getWriter().println("<h1><font color = black>Hello "+gn+" - In Tanvi's Website<br></h1>");

		}
		else{for(int i=0;i<color.length;i++)
	       {
			 String c = color[i];
		response.getWriter().println("<h1><font color = "+c+">Hello "+gn+" - In Tanvi's Website</font><br></h1>");
	       }}		
		 counter++;
		 
		 
		response.setContentType("text/html");
		response.getWriter().println("<h1>You are visitor number : "+ counter);
		response.getWriter().println("<h1><a href = 'index.html'>index</a> </h1>");
		response.getWriter().println("<h1><a href = 'hello.html'>Hello</a> </h1>");
		response.getWriter().println("<h1><a href = 'secondServlet'>Second</a></h1> ");
		
		
 

	}

}
