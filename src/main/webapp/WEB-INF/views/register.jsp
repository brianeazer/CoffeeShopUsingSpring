<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>Please fill the form to register</p>
<form action = "/summary" method= "post">
		<p>
		First Name: <input name = "firstName" />
		</p>
		
		<p>
		Last Name: <input name = "lastName" />
		</p>
		
		<p>
		Email: <input type = "email" name= "email" />
		</p>
		
		<p>
		Phone Number: <input type = "tel" name= "phoneNumber" />
		</p>
		
		<p>
		Date of Birth: <input type = "date" name= "birthday" />
		<p>
		
		<p>
		<input type="checkbox" name="vehicle1" value="Bike"> I shower in coffee, but I also like to drink it, weird, right?! Welcome to quirksville population all of us<br>
		<input type="checkbox" name="vehicle2" value="Car"> coffee tasts so god. I'm ready cool. No bots. Not excuses clear eyes dry eyes cant lose! Friday Night lights<br>
		<input type="checkbox" name="vehicle3" value="Boat"> SIGN UP FOR OUR NEWSLETTER<br>
		<input type="checkbox" name="vehicle3" value="Boat" checked> I like your password ;)<br>
		</p>
		
		<p>
		Password: <input type = "password" name= "password" />
		</p>
		
		<p>
			<button>Submit</button>
		</p>


</form>
</body>
</html>