package org.airline.reservation;

import static org.junit.Assert.*;

import org.junit.Test;
public class seatTest {

	@Test
	public  void testSeat() {
	//Now lets test the constructor 
		Seat seatNumber1 = new Seat();
		assertEquals(1202, seatNumber1.getSeatNumber());
		
	}
	
	@Test
	public void testSetter() {
	//Now lets test the setters
		Seat seatNumber2 = new Seat();
		seatNumber2.setSeatNumber(12);
	    assertEquals(12, seatNumber2.getSeatNumber());
		
	}

}
