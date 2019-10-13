package org.airline.reservation;

import java.time.LocalDate;

public class Ticket {
private LocalDate departureDate;
private Passenger passenger;
private Flight flight;
private Seat seat;


//Lets create a constructor
public Ticket() {
departureDate=LocalDate.now();//This will grab the system date of the local machine and set it to the variable//
	
}


public LocalDate getDepartureDate() {
	return departureDate;
}


public void setDepartureDate(LocalDate departureDate) {
	this.departureDate = departureDate;
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


public Seat getSeat() {
	return seat;
}


public void setSeat(Seat seat) {
	this.seat = seat;
}

//Here I am about to create Tostring 
	public String toString() {
		return "Ticket"+this.getPassenger()+this.getFlight()+this.getDepartureDate()+this.getSeat();
	}

}
