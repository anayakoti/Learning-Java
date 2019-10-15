package org.airline.reservation;

import static org.junit.Assert.*;

import org.junit.Test;

public class DatabaseTest {

	@Test
	public void testDatabase() {
		Database testDB=new Database();
		assertEquals(0, testDB.getSeats().size());
		
	}

}
