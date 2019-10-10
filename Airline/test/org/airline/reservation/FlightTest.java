package org.airline.reservation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FlightTest {

	@Test
	void test() {
	//Lets create flight objects
		Flight testFlight1 = new Flight();
		assertEquals("Unknowncity", testFlight1.getGetDepartureCity());
		assertEquals("UnknownCountry", testFlight1.getGetArrivalCity());
		assertEquals(100,testFlight1.getFlightNumber);
		
	}

}
