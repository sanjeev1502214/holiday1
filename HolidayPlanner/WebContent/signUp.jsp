
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ABC Tours</title>
<link rel = "icon" type = "image/jfif" href = "image/compass.jfif">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<style>
body, html {
  height: 100%;
  margin: 0;
}

.bg {
  background-image: url("Sydney-sunrise.jpg");
  height: 100%; 
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
}
</style>
<script>          
		function myFunction() {
		var x = document.getElementById("myInput");
  		if (x.type === "password") {
    		x.type = "text";
  		} 
		else {
    		x.type = "password";
  		}
		}
		
</script>
</head>
<body class="bg">
<center><h2>Welcome to User Registration Page</h2></center>
<form action="UserReg" method="post" >
<table>
<tr><th>First Name : </th><th><input type="text" name="firstname"maxlength="50"align="right" autocomplete="off" placeholder="First Name"></th></tr><br>
		<tr><th>Last Name : </th><th><input type="text" name="lastname"maxlength="50"align="right"autocomplete="off" placeholder="Last Name"></th></tr><br>
		<tr><th>Age : </th><th><input type="numeric" name="age"maxlength="2"align="right" autocomplete="off" placeholder="Age"></th></tr><br>
 	 	<tr><th>Gender : </th><th> <input type="radio" name="gender" value="male" checked>Male <input type="radio" name="gender" value="female">Female <input type="radio" name="gender" value="other">Other </th></tr>
 	 
  		<tr><th>Contact no : </th><th><input type="text" name="contactno" maxlength="10"align="right" autocomplete="off" placeholder="Active Phone Number"></th></tr><br>
  		<tr><th>Email-ID : </th><th><input type="text" name="emailid" maxlength="50" align="right" autocomplete="off" placeholder="example@gmail.com"></th></tr><br>
  		<tr><th>Password: </th><th><input type="password" name="password" maxlength="30" align="right" id="myInput" autocomplete="off" placeholder="Password"><br></th></tr><br>
  		<tr><th>Retype-Password: </th><th><input type="password" name="password" maxlength="30" align="right" id="myInput" autocomplete="off" placeholder="Retype-Password"><br></th></tr><br>
		<tr><th><input type="checkbox" onclick="myFunction()">Show Password<br></th></tr>

 
   </table><br><br>
   <input type="submit" value="register" /> 
</form>
</body>
</html>