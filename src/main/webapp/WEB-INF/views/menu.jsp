<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Menu</title>
</head>
<body>
<h1>Menu</h1>
	<table>
		
		<tr>
			<th>Item</th><th>Description</th><th>Price</th>
		</tr>
		
		<tr>
		<c:forEach var="menuItem" items= "${menu }">
			<td>${ menuItem.name }</td><td>${menuItem.description }</td><td>${menuItem.price}</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>