package org.airline.reservation;

import static org.junit.Assert.*;

import org.junit.Test;
public class FlightTest {

	@Test
	public void flightTest() {
	//Lets create flight objects
		Flight testFlight1 = new Flight();
		assertEquals("unknownCity", testFlight1.getDepartureCity());
		assertEquals("unknownCountry", testFlight1.getArrivalCity());
		assertEquals(100,testFlight1.getFlightNumber());
		
	}
	//Testing the setter
	@Test
	public void departureCityTest() 
	{
	//While testing the setter methods, we need to create a new objects
		Flight flightTest1 = new Flight();
		flightTest1.setDepartureCity("Hyderabad");
		assertEquals("Hyderabad", flightTest1.getDepartureCity());
		
		
	}
	@Test
	public void ArrivalCityTest() 
	{
	//While testing the setter methods, we need to create a new objects
		Flight flightTest2 = new Flight();
		flightTest2.setArrivalCity("Detriot");
		assertEquals("Detriot", flightTest2.getArrivalCity());
		
		
	}

	@Test
	public void FlightNumberTest() 
	{
	//While testing the setter methods, we need to create a new objects
		Flight flightTest3 = new Flight();
		flightTest3.setFlightNumber(1202);
		assertEquals(1202, flightTest3.getFlightNumber());
		
		
	}
}
