<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">

<head>
    <jsp:include page="/WEB-INF/vefvidmot/page/headOfPage.jsp"/>
    <title>All rentals </title>
</head>

<body>
    <c:choose>
        <c:when test="${not empty carList}">
            <table class="carList">
                <thead>
                    <tr>
                        <th>Car model: </th>
                        <th>Car type: </th>
                        <th>Available dates: </th>
                        <th>Price: </th>
                    </tr>
                </thead>
                <c:forEach var ="car" items="${carList}">
                    <tr>
                        <td>
                            <form method="POST">
                                <input type="submit" value="${car.carModel}" /> 
                                <input name="rentalId" type="hidden" value="${car.rentalId}" /> </td>
                            </form>
                        <td>${car.carType} </td>
                        <td>${car.startDate} to: ${car.endDate} </td>
                        <td>${car.price}$ </td>
                    </tr>
                </c:forEach>
            </table>
        </c:when>
        <c:otherwise>
            <h3> There are no available rentals</h3>
        </c:otherwise>
    </c:choose>
</body>

</html>