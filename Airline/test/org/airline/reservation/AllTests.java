package org.airline.reservation;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ PassengerTest.class, FlightTest.class,SeatTest.class})
public class AllTests {

}
