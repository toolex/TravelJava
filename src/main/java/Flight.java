import java.util.ArrayList;

public class Flight {
    private ArrayList<Passenger> listOfPassengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(Plane plane, String flightNumber, String destination, String departureAirport, String departureTime){
        this.listOfPassengers = new ArrayList<Passenger>();
        this.plane = plane;
        this. flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public ArrayList<Passenger> getListOfPassengers() {
        return this.listOfPassengers;
    }

    public Plane getPlane() {
        return this.plane;
    }

    public String getDepartureAirport() {
        return this.departureAirport;
    }

    public String getDepartureTime() {
        return this.departureTime;
    }

    public String getDestination() {
        return this.destination;
    }

    public String getFlightNumber() {
        return this.flightNumber;
    }


    public int passengerAssigned() {
        return this.listOfPassengers.size();
    }

    public void addPassenger(Passenger passenger) {
        this.listOfPassengers.add(passenger);
    }
}
