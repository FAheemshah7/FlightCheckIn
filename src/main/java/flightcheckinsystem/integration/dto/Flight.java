package flightcheckinsystem.integration.dto;

import java.sql.Timestamp;
import java.util.Date;

public class Flight {

	private int id;
	private String fNumber;

	private String operAirline;

	private String dCity;

	private String arCity;

	private Date dateOfDeparture;

	private Timestamp estimedDepartureTime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getfNumber() {
		return fNumber;
	}

	public void setfNumber(String fNumber) {
		this.fNumber = fNumber;
	}

	public String getOperAirline() {
		return operAirline;
	}

	public void setOperAirline(String operAirline) {
		this.operAirline = operAirline;
	}

	public String getdCity() {
		return dCity;
	}

	public void setdCity(String dCity) {
		this.dCity = dCity;
	}

	public String getArCity() {
		return arCity;
	}

	public void setArCity(String arCity) {
		this.arCity = arCity;
	}

	public Date getDateOfDeparture() {
		return dateOfDeparture;
	}

	public void setDateOfDeparture(Date dateOfDeparture) {
		this.dateOfDeparture = dateOfDeparture;
	}

	public Timestamp getEstimedDepartureTime() {
		return estimedDepartureTime;
	}

	public void setEstimedDepartureTime(Timestamp estimedDepartureTime) {
		this.estimedDepartureTime = estimedDepartureTime;
	}

}
