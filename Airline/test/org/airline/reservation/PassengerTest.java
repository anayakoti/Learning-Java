package org.airline.reservation;

import static org.junit.Assert.*;

import org.junit.Test;

public class PassengerTest {

	@Test
	public void testPassenger() {
	 Passenger testPassenger1=new Passenger();
	 String result=testPassenger1.getterName();
	 assertEquals("Not known Yet!", result);
	}



	@Test
	public void testSetName() {
		fail("Not yet implemented");
	}

}
