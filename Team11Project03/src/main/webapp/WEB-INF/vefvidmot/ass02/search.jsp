<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">

    <head>
        <title>Select car type and date</title>
    </head>
    <body>

        <h1>Select car type and date</h1>
        <br>

        <form method="POST" action="/ass02/searchResults">
            <input type="submit" value="Search"/> 
            <br>
            Car type<br>
            <input type="radio" name="cartype" value="Hatchback"> Hatchback<br>
            <input type="radio" name="cartype" value="Sedan"> Sedan<br>
            <input type="radio" name="cartype" value="SUV"> SUV<br>
            <input type="radio" name="cartype" value="Convertible"> Convertible<br>

            <br>

            Start date: 
            <input name="startDate" type="date" placeholder="date" min="2000-01-01" max="2100-01-01"</input > 
            <br>
            End date: 
            <input name="endDate" type="date" placeholder="date"  min="2000-01-01" max="2100-01-01"</input > 

        </form>
    </body>

</html>