public class FlightManager {
    private Flight flight;
    private Passenger passenger;

    public FlightManager(Flight flight, Passenger passenger){
        this.flight = flight;
        this.passenger = passenger;
    }


    public int howMuchWeight() {
        return (this.passenger.getNumberOfBags() * 5);
    }

    public int totalWeightAllowed() {
        return (howMuchWeight() * 2);
    }
}
