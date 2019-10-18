package org.airline.reservation;

public class Seat {
 public int seatNumber;
 
 
//Lets create a constructor
 public Seat() {
	setSeatNumber(10);
 }
 
//Creating Second Constructor
 public Seat(int seat) {
	setSeatNumber(seat);
 }
 //Getters and Setters
 public  int getSeatNumber()
 {
	return seatNumber; 
 }
 public void setSeatNumber(int seatNumber) {
	this.seatNumber=seatNumber;
	 
 }
 
 //Creating toString

	public String toString() {
		return "Seat"+this.getSeatNumber();
	}
 
 
}
