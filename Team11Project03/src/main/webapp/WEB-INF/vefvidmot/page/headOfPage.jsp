<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">
<body>
    <h3>${user.getFirstName()} ${user.getLastName()} <br> </h3>  
    <h5><a href="/page/loggedUser">Home</a> / <a href="/page/editUser">Edit your user information</a> / 
        <a href="/page/logout">Logout</a></h5>
</body>
</html>