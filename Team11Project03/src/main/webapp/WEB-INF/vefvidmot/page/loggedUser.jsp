<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">

<head>
    <jsp:include page="/WEB-INF/vefvidmot/page/headOfPage.jsp"/>
    <title>Welcome</title>
</head>
<body>
    
    <br/>

        <h1>User home<br/> </h1>
            <br/>
        <a href="/page/listUsers">Show all users</a><br/>
        <a href="/page/carRegister">Register your rental</a><br/>
        <a href="/page/myRentals">Show your rentals</a><br/>
        <a href="/page/allRentals">Show all rentals</a><br/>
        <a href="/page/search">Search rentals</a><br/>
              

</body>

</html>