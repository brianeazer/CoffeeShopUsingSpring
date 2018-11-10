<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container-fluid">
<h1>Register to vote!</h1>
<form action = "/summary">
		<p>
		First Name: <input pattern="[A-Z][a-z]*" required minlength="1" name = "firstname" />
		</p>
		
		<p>
		Last Name: <input pattern="[A-Z][a-z]*" required minlength="1" name = "lastname" />
		</p>
		
		<p>
		Email: <input type = "email" required minlength="1" name= "email" />
		</p>
		
		<p>
		Phone Number: <input pattern="[0-9]+" required minlength="7" required maxlength="11" name= "phonenumber" />
		</p>
		
		<p>
		Date of Birth: <input type = "date" required minlength="1" name= "birthday" />
		<p>
		
		<p>
		<input type="checkbox" name="newsletter"> SIGN UP FOR OUR NEWSLETTER<br>
		<input type="checkbox" name="joke"> I like your password ;)<br>
		</p>
		
		<p>
		Password: <input type = "password" required minlength="5" name= "password" />
		</p>
		
		<p>
			<button>Submit</button>
		</p>


</form>
</div>
</body>
</html>