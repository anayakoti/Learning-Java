package org.airline.reservation;

import java.util.ArrayList;

public class Database {

	private ArrayList<Seat> seats;

	public Database(){
		// TODO Auto-generated constructor stub
		seats=new ArrayList<Seat>();
	}
//We have created getter Methods only
	public ArrayList<Seat> getSeats() {
		return seats;
	}

}
