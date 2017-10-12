<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">

<head>
    <jsp:include page="/WEB-INF/vefvidmot/page/headOfPage.jsp"/>
    <title>Sign up</title>
</head>
<body>
    <h4>${user.logInName}<h4>
    <div class="form-group form">
	<form method="post">
            	<div>
			<label>First name: ${user.firstName}</label>
			<input type="text" id="firstName" name="firstName" placeholder="Change first name"  maxlength="12" required="required" class="form-control"/>
		</div>
            	<div>
			<label>Last name: ${user.lastName}</label>
			<input type="text" id="lastName" name="lastName" placeholder="Change last name"  maxlength="12" required="required" class="form-control"/>
		</div>
                <button id="loginButton" class="form-control">Confirm</button>
	</form>
                        
            <form method="post" action="/page/loggedUser">
                <button id="cancelButton" class="form-control">Cancel</button>
            </form>
</div>
</body>
</html>