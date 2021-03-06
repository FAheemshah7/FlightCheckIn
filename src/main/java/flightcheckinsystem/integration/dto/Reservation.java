package flightcheckinsystem.integration.dto;


public class Reservation {
	
	private int id;
	private Boolean CHECKED_IN;
	private int NUMBER_OF_BAGS;

	private Passenger passenger;

	private Flight flight;
	


	public Boolean getCHECKED_IN() {
		return CHECKED_IN;
	}
	public void setCHECKED_IN(Boolean cHECKED_IN) {
		CHECKED_IN = cHECKED_IN;
	}
	public int getNUMBER_OF_BAGS() {
		return NUMBER_OF_BAGS;
	}
	public void setNUMBER_OF_BAGS(int nUMBER_OF_BAGS) {
		NUMBER_OF_BAGS = nUMBER_OF_BAGS;
	}
	public Passenger getPassenger() {
		return passenger;
	}
	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}	

}
