package com.deloitte.myTags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;
import java.io.IOException;

public class CustomTagAddress extends TagSupport {
	
	@Override
	public int doStartTag() throws JspException {
		JspWriter out = pageContext.getOut();
		try
		{
			out.println("<h2>Tanvi's Address</h2>");
			out.println("<h2>Flat No.002, Tranquille Apartments</h2>");
			out.println("<h2>#154 Wheeler's Road</h2>");
			out.println("<h2>Fraser Town</h2>");
			out.println("<h2>Bangalore - 560005</h2>");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return super.doStartTag();
	}

}
