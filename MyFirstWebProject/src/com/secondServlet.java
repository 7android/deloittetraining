package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class secondServlet
 */
public class secondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public secondServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
    int counter = 0;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		counter++;
		response.setContentType("text/html");
		response.getWriter().println("<h1>Hello Second - In The Second Website");
		response.getWriter().println("<h1>You are visitor number : "+ counter);
		response.getWriter().println("<h1><a href = 'index.html'>index</a> ");
		response.getWriter().println("<h1><a href = 'hello.html'>Hello</a> ");
		response.getWriter().println("<h1><a href = 'Welcome'>Welcome</a> ");

	
	}

}
