package flight;

import passenger.Passenger;
import plane.Plane;
import plane.PlaneType;

import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> passengers;
    public Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(ArrayList<Passenger> passengers, Plane plane, String flightNumber, String destination, String departureAirport, String departureTime) {
        this.passengers = passengers;
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public int getPassengers() {
        return this.passengers.size();
    }

    public Plane getPlane() {
        return plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public int getAvailableSeats() {
        return this.plane.getCapacity() - getPassengers();
    }

    public void addPassenger(Passenger passenger) {
        if (this.plane.getCapacity() > getPassengers()) {
            this.passengers.add(passenger);
        }
    }
}
