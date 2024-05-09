<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Form</title>
<style type="text/css">
.div-form {
display: flex;
align-items: center;
justify-content: center;
border: 2px solid blues;
align-items: center;
padding: 30px;
}
</style>
</head>
<body>
	<div class="div-form">
		<form action="loginform" method="post">
			<h1>Login Form</h1>
			<label>Enter Username</label><br> <input type="text" name="username"><br>
			<br> <label>Enter Password</label><br> <input type="text" name="ps"><br><br>
			<button type="submit">Login</button><br>
			<label>Accept Cookies</label><br><input type="checkbox" name="accept" value="yes">
		</form>
	</div>
</body>
</html>