 package flightcheckinsystem.integration;

import flightcheckinsystem.integration.dto.Reservation;
import flightcheckinsystem.integration.dto.ReservationUpdateRequest;

public interface ReservationRestClient {
	
	public Reservation findReservation(int id );
	public Reservation updateResrvation(ReservationUpdateRequest request );
	
	

}
