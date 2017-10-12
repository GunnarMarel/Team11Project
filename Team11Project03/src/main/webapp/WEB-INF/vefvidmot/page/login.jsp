<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">

<head>
    <title>Login</title>
</head>
<body>
    <h4>User login ${logInError}</h4>

<div class="form-group form">
	<form action='login' method="post">
		<div>
			<label>User name:</label>
			<input type="text" id="userId" name="logInName" placeholder="user name" class="form-control"/>
		</div>
		<div>
			<label>Password:</label>
			<input type="password" id="logInPass" name="logInPass" placeholder="password" class="form-control"/>
		</div>
		<button id="loginButton" class="form-control">Login</button>
	</form>
</div>
</body>

</html>