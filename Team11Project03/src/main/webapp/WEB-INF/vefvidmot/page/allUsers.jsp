<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">
    
<head>
    <jsp:include page="/WEB-INF/vefvidmot/page/headOfPage.jsp"/>
    <title>All users </title>
</head>

<body>
    <c:choose>
        <c:when test="${not empty users}">
            <table class="users">
                <thead>
                    <tr>
                        <th>Users: </th>
                        
                    </tr>
                </thead>
                <c:forEach var ="user" items="${users}">
                    <tr>
                        <td>${user.logInName} </td>
                    </tr>
                </c:forEach>
            </table>
        </c:when>
        <c:otherwise>
            <h3> No users></h3>
        </c:otherwise>
    </c:choose>
</body>
</html>