<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">

    <head>
        <jsp:include page="/WEB-INF/vefvidmot/page/headOfPage.jsp"/>
        <title>Select car type and date</title>
    </head>
    <body>

        <h1>Select car type and date</h1>
        <br>

        <form method="POST" action="/page/searchResults">
            
            <br>

            Start date: 
            <input name="startDate" type="date" placeholder="date" min="2000-01-01" max="2100-01-01"</input > 
            <br>
            End date: 
            <input name="endDate" type="date" placeholder="date"  min="2000-01-01" max="2100-01-01"</input >
            <br>
            Car type:
            <select name="cartype">
            <option value="Hatchback"> Hatchback</option>
            <option value="Sedan"> Sedan</option>
            <option value="SUV"> SUV</option>
            <option value="Convertible"> Convertible</option>
            </select>
            <br>
            <input type="submit" value="Search"/> 

        </form>
    </body>

</html>