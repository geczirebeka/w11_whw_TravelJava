import org.junit.Before;
import org.junit.Test;
import passenger.Passenger;

import static org.junit.Assert.assertEquals;

public class PassengerTest {
    Passenger passenger;

    @Before
    public void before() {
        passenger = new Passenger("George", 1);
    }

    @Test
    public void hasName() {
        assertEquals("George", passenger.getName());
    }

    @Test
    public void hasNumberOfBags() {
        assertEquals(1, passenger.getNumberOfBags());
    }
}
