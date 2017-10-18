<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">

<head>
    <title>Sign up</title>
</head>
<body>
    <h4>User registration ${registerError} </h4>
    <div class="form-group form">
	<form method="post">
            	<div>
			<label>First name: </label>
			<input type="text" id="firstName" name="firstName" placeholder="First name" class="form-control"/>
		</div>
            	<div>
			<label>Last name: </label>
			<input type="text" id="lastName" name="lastName" placeholder="Last name" class="form-control"/>
		</div>
		<div>
			<label>User name:</label>
			<input type="text" id="logInName" name="logInName" placeholder="user name" maxlength="12" required="required" class="form-control"/>
		</div>
		<div>
			<label>Password:</label>
			<input type="password" id="logInPass" name="logInPass" placeholder="password" maxlength="12" required="required" class="form-control"/>
		</div>
		<button id="loginButton" class="form-control">Register</button>
	</form>
</div>
</body>
</html>