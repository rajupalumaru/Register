<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>REGISTRATION PAGE</title>
</head>
<body>
	<form action="registerStudent" method="post">

		FirstName:<input type="text" name="fname"></br>
		 LastName<input	type="text" name="lname"></br>
			 Password<input	type="password" name="pswrd"></br> 
			MobileNo<input type="text" name="mbile"></br> 
			<input type="submit" value="register"></br>
	</form>
	
	<form action="getData">
	<input type="submit" value="getStud">
	</form>
</body>


</html>