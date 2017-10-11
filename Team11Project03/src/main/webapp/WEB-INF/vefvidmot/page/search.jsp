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
            Car type<br>
            <input type="radio" name="cartype" value="Hatchback"> Hatchback<br>
            <input type="radio" name="cartype" value="Sedan"> Sedan<br>
            <input type="radio" name="cartype" value="SUV"> SUV<br>
            <input type="radio" name="cartype" value="Convertible"> Convertible<br>

            <br>
            Car type:
            <select>
            <option name="cartype" value="Hatchback"> Hatchback</option>
            <option name="cartype" value="Sedan"> Sedan</option>
            <option name="cartype" value="SUV"> SUV</option>
            <option name="cartype" value="Convertible"> Convertible</option>
            </select>
            <br>

            Start date: 
            <input name="startDate" type="date" placeholder="date" min="2000-01-01" max="2100-01-01"</input > 
            <br>
            End date: 
            <input name="endDate" type="date" placeholder="date"  min="2000-01-01" max="2100-01-01"</input >
            <br>
            <input type="submit" value="Search"/> 

        </form>
    </body>

</html>