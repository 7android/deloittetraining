<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% for (int i=0;i<5;i++){ %>
<h1>Tanvi</h1><%}
int marks = 99;
if (marks > 50)
	out.println("<H1><font color = 'green'>Congratulations! You Passed</font></h1>");
	out.println("<h2>Your marks are = "+ marks+"</h2>");
%>
<h2>Your marks are = <%= marks %></h2>


</body>
</html>