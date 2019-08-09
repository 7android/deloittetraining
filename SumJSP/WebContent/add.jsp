<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Addition</title>
</head>
<body>
<%! int num1=0; int num2 = 0; int total = 0; %>
<%
num1 = Integer.parseInt(request.getParameter("num1"));
num2 = Integer.parseInt(request.getParameter("num2"));
total = num1 + num2;
session.setAttribute("total",total);
%>
<jsp:forward page="result.jsp"></jsp:forward>
</body>
</html>