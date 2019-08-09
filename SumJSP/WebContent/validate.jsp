<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Validate</title>
</head>
<body>
<%
String username = request.getParameter("username");
String password = request.getParameter("password");
if (username.equals("Tia") && password.equals("potato"))
{
%>	<jsp:forward page = "success.jsp"></jsp:forward> <%
}
else
{
	session.setAttribute("errMsg", "Incorrect username and password");
	response.sendRedirect("index.jsp");
}
%>
</body>
</html>