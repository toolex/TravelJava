import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    private Flight flight;
    private Plane plane;
    private Passenger passenger1;
    private Passenger passenger2;

    @Before
    public void before(){
     passenger1 = new Passenger("Bob", 2);
     passenger2 = new Passenger("Jim", 1);

     plane = new Plane(PlaneType.BOEING747);

     flight = new Flight(plane, "TK101", "Tokyo", "Edinburgh", "12:30");
    }

    @Test
    public void canGetNumberOfAvailableSeats(){
        assertEquals(25, plane.findCapacity());
    }

    @Test
    public void planeStartsEmpty(){
        assertEquals(0, flight.passengerAssigned());
    }

    @Test
    public void canAddPassengerToFlight(){
        flight.addPassenger(passenger1);
        assertEquals(1, flight.passengerAssigned());
    }
}
