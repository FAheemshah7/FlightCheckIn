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
Airlines :${reservation.flight}
Flight # :${reservation.flight.fNumber}
Departure City :${reservation.flight.dCity}
Arrival City :${reservation.flight.arCity}
Date of Departure :${reservation.flight.dateOfDeparture}
Estimated Arrival Time :${reservation.flight.estimedDepartureTime}

<h2>Passengers Details </h2>
First Name :${reservation.f_name}
Last Name  :${reservation.l_name}
Email	   :${reservation.email}
Phone #	   :${reservation.phone}

<form action="completeCheckIn" method="post">
Enter The Number of Bags You want to CheckIn:<input type="text" name=NUMBER_OF_BAGS/>
<input type="hidden" value="${reservation.id}"/>
<input type="submit" value="Check In"/>

</form>
</body>
</html>