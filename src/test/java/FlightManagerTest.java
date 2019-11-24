import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {
    private Plane plane;
    private Flight flight;
    private Passenger passenger;
    private FlightManager flightManager;


    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING747);
        passenger = new Passenger("Bob", 2);
        flight = new Flight(plane, "TK101", "Tokyo", "Edinburgh", "12:30");
        flightManager = new FlightManager(flight, passenger);
    }

    @Test
    public void howMuchWeightAllowed(){
        flight.addPassenger(passenger);
        assertEquals(20, flightManager.totalWeightAllowed());
    }

    @Test
    public void findHowMuchWeightIsNeededPerPassenger(){
        assertEquals(10, flightManager.howMuchWeight());
    }
}
