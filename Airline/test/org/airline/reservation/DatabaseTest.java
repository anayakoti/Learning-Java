package org.airline.reservation;

import static org.junit.Assert.*;

import org.junit.Test;

public class DatabaseTest {

	@Test
	public void testDatabase() {
		Database testDB=new Database();
		assertEquals(0, testDB.getSeats().size());
		assertEquals(0, testDB.getFlights().size());
		assertEquals(0, testDB.getTickets().size());
		assertEquals(0, testDB.getPassengers().size());
	
		
	}
	
	@Test
	public void testAddSeat() {
	Database testDB1 = new Database ();
	testDB1.addSeat(1);
	assertEquals(1, testDB1.getSeats().size());
	}

	

	

}
