package org.airline.reservation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ticketTest {

	@Test
	public void testSetPassenger() {
	//Creating a new object
		Ticket testTicket1 = new Ticket();
		Passenger testPassenger1 = new Passenger("Akarshana");
		testTicket1.setPassenger(testPassenger1);
		assertEquals("Akarshana", testTicket1.getPassenger().getterName());
	}

}
