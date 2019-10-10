package org.airline.reservation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FlightTest {

	@Test
	void test() {
	//Lets create flight objects
		Flight testFlight1 = new Flight(100);
		assertEquals("Unknowncity", testFlight1.getDepartureCity);
		assertEquals("UnknownCountry", testFlight1.getArrivalCity);
		assertEquals(100,testFlight1.getFlightNumber);
		
	}

}
