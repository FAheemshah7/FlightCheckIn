package flightcheckinsystem.integration;

import org.springframework.web.client.RestTemplate;

import flightcheckinsystem.integration.dto.Reservation;
import flightcheckinsystem.integration.dto.ReservationUpdateRequest;

public class ReservatioinRestClientImplementation implements ReservationRestClient {

	private static final String RESERVATION_REST_URL="http://localhost:8080/reservations/";
	@Override
	public Reservation findReservation(int id) {
		RestTemplate restTemplate=new RestTemplate();
		Reservation reservation = restTemplate.getForObject(RESERVATION_REST_URL+id,Reservation.class);
		
		return reservation;
	}

	@Override
	public Reservation updateResrvation(ReservationUpdateRequest request) {
		RestTemplate restTemplate=new RestTemplate();
		restTemplate.postForEntity(RESERVATION_REST_URL, request,Reservation.class);
		return null;
	}

}
