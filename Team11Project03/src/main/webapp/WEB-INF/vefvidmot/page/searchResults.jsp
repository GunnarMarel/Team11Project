<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">

<head>
    <jsp:include page="/WEB-INF/vefvidmot/page/headOfPage.jsp"/>
    <title>Search results </title>
</head>
<body>

    <h1>Search results </h1>
    <c:choose>
        <c:when test="${not empty resList}">
            <table class="resList">
                <thead>
                    <tr>
                        <th>Available rentals: </th>
                        
                    </tr>
                </thead>
                <c:forEach var ="rental" items="${resList}">
                    <tr>
                        <td>${rental.carModel} </td>
                    </tr>
                </c:forEach>
            </table>
        </c:when>
        <c:otherwise>
            <h3> No rentals available at that time</h3>
        </c:otherwise>
    </c:choose>
</body>

</html>