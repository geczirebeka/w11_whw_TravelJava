import flight.Flight;
import org.junit.Before;
import org.junit.Test;
import passenger.Passenger;
import plane.Plane;
import plane.PlaneType;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    Flight flight;
    Passenger passenger;
    Plane plane;
    ArrayList<Passenger> passengerList;

    @Before
    public void before() {
        passenger = new Passenger("George", 1);
        plane = new Plane(PlaneType.BOEING747);
        passengerList = new ArrayList<Passenger>();
        passengerList.add(passenger);
        flight = new Flight(passengerList, plane, "FA586", "FRU", "GLA", "12:30");
    }

    @Test
    public void hasPassengers() {
        assertEquals(1, flight.getPassengers());
    }

    @Test
    public void hasPlane() {
        assertEquals(plane, flight.getPlane());
    }
    @Test
    public void hasFlightNumber() {
        assertEquals("FA586", flight.getFlightNumber());
    }

    @Test
    public void hasDestination() {
        assertEquals("FRU", flight.getDestination());
    }

    @Test
    public void hasDepartureAirport() {
        assertEquals("GLA", flight.getDepartureAirport());
    }

    @Test
    public void hasDepartureTime() {
        assertEquals("12:30", flight.getDepartureTime());
    }

    @Test
    public void hasAvailableSeats() {
        assertEquals(299, flight.getAvailableSeats());
    }

    @Test
    public void canBookPassenger() {
        flight.addPassenger(passenger);
        assertEquals(2, flight.getPassengers());
    }

}