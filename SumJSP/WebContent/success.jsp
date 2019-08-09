<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success</title>
</head>
<body>
<font color = "green"> <h1> Congratulations! Welcome user - Validation successful </h1></font>
<% x=3; %>
<% int x=5; %>
<%! int x=7; %>
x = <%=x%>, <%=this.x%>

   <% for (int i = 0; i < 5 ; i++)
     {  %>
         out.print(i);
  <% }  %>



</body>
</html>