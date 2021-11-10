<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reservation Details</title>
</head>
<body>
<h2> Flight Details</h2>
Airlines :${reservation.flight.operAirline}<br>
Flight # :${reservation.flight.fNumber}<br>
Departure City :${reservation.flight.dCity}<br>
Arrival City :${reservation.flight.arCity}<br>
Date of Departure :${reservation.flight.dateOfDeparture}<br>
Estimated Arrival Time :${reservation.flight.estimedDepartureTime}<br>

<h2>Passengers Details </h2>
First Name :${reservation.passenger.f_name}<br>
Last Name  :${reservation.passenger.l_name}<br>
Email	   :${reservation.passenger.email}<br>
Phone #	   :${reservation.passenger.phone}<br>

<form action="completeCheckIn" method="post">
Enter The Number of Bags You want to CheckIn:<input type="text" name="NUMBER_OF_BAGS"/>
<input type="hidden" value="${reservation.id}" name="reservationId"/>
<input type="submit" value="Check in"/>

</form>
</body>
</html>