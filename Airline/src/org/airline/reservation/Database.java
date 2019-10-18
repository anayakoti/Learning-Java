package org.airline.reservation;

import java.util.ArrayList;

public class Database {

	private ArrayList<Seat> seats;
	private ArrayList<Flight> flights;
	private ArrayList<Passenger> passengers;
	private ArrayList<Ticket> tickets;

	public Database(){
		// TODO Auto-generated constructor stub
		seats=new ArrayList<Seat>();
		flights=new ArrayList<Flight>();
	}
//We have created getter Methods for Seats only
	public ArrayList<Seat> getSeats() {
		return seats;
	}
	
	//we have created getter Methods for Flight
       public ArrayList<Flight>getFlights() {
		// TODO Auto-generated method stub
		return flights;
	}

     //we have created getter Methods for Passengers
       public ArrayList<Passenger>getPassengers() {
		// TODO Auto-generated method stub
		return passengers;
	}
       //we have created Getter methods for Tickets
	   public ArrayList<Ticket> getTickets() {
		// TODO Auto-generated method stub
		return tickets;
	}
	   
	   public void addSeat(int seatNumber) {
		   //To the seats arrayList it will add the seats 
		   //We are creating new seat object
		   seats.add(new Seat(seatNumber));
		   
	   }
       
       
}
