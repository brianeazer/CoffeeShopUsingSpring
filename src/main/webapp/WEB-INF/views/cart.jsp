<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:forEach var = "cartItem" items=${cartItems}> 
Quantity: ${cartItem.quantity}
Name: ${cartItem.menuItem.name}
Price: ${cartItem.menuItem.price }
</c:forEach>
</body>
</html>