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
		Passenger testPassenger2 = new Passenger();
		testPassenger2.setName("Anudeep Nayakoti");
		assertEquals("Anudeep Nayakoti", testPassenger2.getterName());
	}

}
