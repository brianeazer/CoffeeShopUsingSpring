<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<link rel="stylesheet" href="/menu.css" />
<title>Menu</title>
</head>
<body>
	<table>
		<tr><th id ="top" colspan = "3">Menu </th></tr>
		<tr id="cats">
			<th>Item</th><th>Description</th><th>Price</th>
		</tr>
		
		<tr>
		<c:forEach var="menuItem" items= "${menu }">
			<td>${ menuItem.name }</td><td>${menuItem.description }</td><td> <fmt:formatNumber value = "${menuItem.price}" 
         type = "currency"/>	</td>
		</tr>
		</c:forEach>
		<tr><td colspan="3" id = "bottom"><form action="/single">Search<input name="searchname"/></form></td></tr>
	</table>
</body>
</html>


