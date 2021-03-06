	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="true" %>
<html>
<head>
	<title>Confirmation Page</title>
	<style type="text/css">
		.tg  {border-collapse:collapse;border-spacing:0;border-color:#ccc;}
		.tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#fff;}
		.tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0;}
		.tg .tg-4eph{background-color:#f9f9f9}
	</style>
</head>
<body>
<h1>
	Confirmation Page
</h1>

<h2>  ${payment}  , your stay has been booked, you will get a confirmation email shortly.</h2>

<form:form action="/trans" modelAttribute="transaction">
<table>
	<tr>
		<td>
			<form:label path="feedback">
				<spring:message text="Please give your valuable feedback:"/>
			</form:label>
		</td>
		<td>
			<form:input path="feedback" size="22"   />
			
		</td> 
	</tr>
	<tr>
		<td colspan="2">
				<input type="submit" value="<spring:message text=" Submit Feedback" />" />
			
		</td>
	</tr>
</table>
</form:form>


</body>
</html>