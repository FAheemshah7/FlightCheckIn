package flightcheckinsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import flightcheckinsystem.integration.ReservationRestClient;
import flightcheckinsystem.integration.dto.Reservation;
import flightcheckinsystem.integration.dto.ReservationUpdateRequest;

@Controller
public class CheckInController {

	@Autowired
	ReservationRestClient restController;
	
	@RequestMapping("/showStartCheckIn")
	public String showStartCheckIn() {
		
		return "startCheckIn";
		
	}
	@RequestMapping("/startCheckIn")
	public String startCheckin(@RequestParam("reservationId") int reservationId,ModelMap modelMap ) {
		Reservation reservation = restController.findReservation(reservationId);
		System.out.println("Passenger Data :"+reservation.getPassenger());
		System.out.println("Flight Data :"+reservation.getFlight());
		modelMap.addAttribute("reservation",reservation);
		return "displayReservationDetails";
	}
	@RequestMapping("/completeCheckIn")
	public String completeCheckIn(@RequestParam("reservationId") int reservationId,@RequestParam("NUMBER_OF_BAGS")int NUMBER_OF_BAGS) {
		ReservationUpdateRequest resrvationUpdate=new ReservationUpdateRequest();
		resrvationUpdate.setId(reservationId);
		resrvationUpdate.setCheckedIn(true);
		resrvationUpdate.setNumberOfBags(NUMBER_OF_BAGS);
		restController.updateResrvation(resrvationUpdate);
		return "checkInConfirmation";
		
	}

}



