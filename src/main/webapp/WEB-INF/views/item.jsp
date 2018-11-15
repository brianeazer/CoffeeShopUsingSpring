<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="/item.css" />
<title>Insert title here</title>
</head>
<body>
	<h1>${title }</h1>
	<form method="post">
			<!-- We need to keep the ID and submit it with the form, but we don't want the user to have to see it. -->
			<input type="hidden" name="id" value="${food.id}" />
			<div class="form-group">
			    <label for="name">Name</label>
			    <!-- pre-populate the input value from the existing food (if any) -->
			    <input class="form-control" id="name" name="name" value="${menuItem.name}" required minlength="2" autocomplete="off">
			</div>
			<div class="form-group">
			    <label for="category">Description</label>
			    <input class="form-control" id="description" name="description" value="${menuItem.description}" required>
			</div>
			<div class="form-group">
			    <label for="description">Price</label>
			    <input class="form-control" id="price" name="price" value="${menuItem.price}" required minlength="3">
			</div>
			<button type="/admin/menu" class="btn btn-primary">Submit</button>
			<a href="/admin/menu" class="btn btn-link">Cancel</a>
		</form>
</body>
</html>