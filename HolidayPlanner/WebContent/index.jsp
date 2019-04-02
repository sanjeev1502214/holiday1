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
  <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
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
.login-container{
    margin-top: 5%;
    margin-bottom: 5%;
    margin-left: 35%;
    margin-right: %;
}
.login-form-1{
    padding: 5%;
    box-shadow: 0 5px 8px 0 rgba(0, 0, 0, 0.2), 0 9px 26px 0 rgba(0, 0, 0, 0.19);
}
.login-form-1 h3{
    text-align: center;
    color: #333;
}
.login-container form{
    padding: 10%;
}
.btnSubmit
{
    width: 50%;
    border-radius: 1rem;
    padding: 2.5%;
    border: none;
    cursor: pointer;
}
.login-form-1 .btnSubmit{
    font-weight: 600;
    color: #fff;
    background-color: #2ECC71;
}
.login-form-1 .ForgotPwd{
    color: #2ECC71;
    font-weight: 950;
    text-decoration: none;
}

</style>
</head>
<body class="bg">
<center><h1>Welcome to Holiday Planner</h1></center>
<center><p><h3>ABC Tours is the website built for planning your trip.  Without leaving our site, you can add transportation, lodging, sights, and food.It is very easy to use.</p>

<p>Also, ABC Tours is better than anyone else on this list at visualizing and planning multi-day and multi-city trips (anywhere in the India). ABC Tours is the only online trip planner that makes it easy to plan every single step of your trip including travel between cities!</h3></p></center>
<center>
                  <div  class="container login-container">
            <div class="row">
                <div class="col-md-6 login-form-1">
                    <h3>Login To Plan Your Holiday</h3>
                    <form>
                        <div class="form-group">
                            <input type="text" class="form-control" placeholder="Your Email *" value="" />
                        </div>
                        <div class="form-group">
                            <input type="password" class="form-control" placeholder="Your Password *" value="" />
                        </div>
                        <div class="form-group">
                            <input type="submit" class="btnSubmit" value="Login" />
                        </div>
                        <div class="form-group">
                            <a href="#" class="ForgotPwd">Forgot Password?</a>
                                    </div>
                                    <center><h4>
To Sign-Up :-)<a href="signUp.jsp">Click Here!</a><br></h4></center>
                    </form>
                </div>
                </div></div>
                

</center>

</body>
</html>