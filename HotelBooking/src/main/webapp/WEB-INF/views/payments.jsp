	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="true" %>
<html>
<head>
	<title>Payments Page</title>
	<style type="text/css">
		.tg  {border-collapse:collapse;border-spacing:0;border-color:#ccc;}
		.tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#fff;}
		.tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0;}
		.tg .tg-4eph{background-color:#f9f9f9}
	</style>
</head>
<body>
<h1>
	Enter Payment Details
</h1>

<c:url var="payment" value="/verifyPayment" ></c:url>

<form:form action="${payment}" modelAttribute="payment">
<table>
	<tr>
		<td>
			<form:label path="cardNumber">
				<spring:message text="Card Number"/>
			</form:label>
		</td>
		<td>
			<form:input path="cardNumber" size="8"   />
			
		</td> 
	</tr>
	<%-- </c:if> --%>
	<tr>
		<td>
			<form:label path="clientName">
				<spring:message text="Name as written on the card"/>
			</form:label>
		</td>
		<td>
			<form:input path="clientName" />
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="expiry">
				<spring:message text="Expiry date"/>
			</form:label>
		</td>
		<td>
			<form:input path="expiry" />
		</td>
	</tr>
	<tr>
		<td>
			<form:label path="cvv">
				<spring:message text="CVV"/>
			</form:label>
		</td>
		<td>
			<form:input path="cvv" />
		</td>
	</tr>
	<tr>
		<td>
			<form:label path="password">
				<spring:message text="Enter Password"/>
			</form:label>
		</td>
		<td>
			<form:input type="password" path="password" />
		</td>
	</tr>
	<tr>
		<td colspan="2">
				<input type="submit" value="<spring:message text=" Verify and Pay" />" />
			
		</td>
	</tr>
</table>	
</form:form>
<br>
</body>
</html>
