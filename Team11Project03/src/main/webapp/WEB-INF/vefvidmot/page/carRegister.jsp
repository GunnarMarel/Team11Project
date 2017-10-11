<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">

<head>
    <jsp:include page="/WEB-INF/vefvidmot/page/headOfPage.jsp"/>
    <title>Register your car for rent</title>
</head>
<body>
    
        <form method="POST">
            
            <br>
            Car type:<br>
            <input type="radio" name="cartype" value="Hatchback"> Hatchback<br>
            <input type="radio" name="cartype" value="Sedan"> Sedan<br>
            <input type="radio" name="cartype" value="SUV"> SUV<br>
            <input type="radio" name="cartype" value="Convertible"> Convertible<br>          
            <td>Car model:</td><td> <input name="model" type="text" placeholder="Model" /> </td>         
            <br>
            Available from: 
            <input name="startDate" type="date" placeholder="date" min="2000-01-01" max="2100-01-01"</input > 
            <br>
            Available to: 
            <input name="endDate" type="date" placeholder="date"  min="2000-01-01" max="2100-01-01"</input >            
            <br>
            <td>Price per day:</td><td> <input name="price" type="int" placeholder="Price" /> </td>
            <br>
            <input type="submit" value="Register"/> 

        </form>
</body>
</html>