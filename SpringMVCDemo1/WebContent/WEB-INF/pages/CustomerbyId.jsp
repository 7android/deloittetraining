<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<f:form action ="CustomerById.do">

<table cellspacing ="0" cellpadding = "10" align = "center">
<tr><td>Customer ID </td><td><f:input type = "text" path = "customerId" id = "customerId" name = "customerId"/></td></tr>
<tr><td><input type = "submit"></td><td><input type = "reset"></td></tr>
<tr><td>Customer Name </td><td><f:input type = "text" path="customerName" id = "customerName" name = "customerName"/></td></tr>
<tr><td>Customer Address </td><td><f:textarea rows = "7" columns = "20" path = "customerAddress" id = "customerAddress" name = "customerAddress"/></td></tr>
<tr><td>Bill Amount </td><td><f:input type = "text" path = "billAmount" id = "billAmount" name = "billAmount"/></td></tr>
</table>
</f:form>


</body>
</html>