<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "/WEB-INF/customtag.tld" prefix = "a" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display</title>
</head>
<body>
<h1>Displaying Customer Details</h1>
<%= session.getAttribute("cust") %>

OR

<br>${cust.customerId}
<br>${cust.customerName}  
<br>${cust.customerAddress}
<br>${cust.billAmount}

<a:tiaadd></a:tiaadd>

</body>
</html>