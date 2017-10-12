<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">

<head>
    <jsp:include page="/WEB-INF/vefvidmot/page/headOfPage.jsp"/>
    <title>Rental information</title>
</head>
<body>

        <h1>${rental.carModel}</h1>
            <br/>
            <p>Owned by ${rental.ownerName}</p>
            <p>Car rating: </p>
            <p>Description: </p>
            <p>Price per day: ${rental.price}$</p>         
            
        <a href="/page/loggedUser">Lease car</a><br/>
</body>

</html>