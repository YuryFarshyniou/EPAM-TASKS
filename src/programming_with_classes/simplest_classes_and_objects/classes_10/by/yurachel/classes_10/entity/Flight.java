package programming_with_classes.simplest_classes_and_objects.classes_10.by.yurachel.classes_10.entity;


import java.util.Arrays;
import java.util.Objects;


public class Flight {
    private String destination;
    private int flightNumber;
    private String airplaneType;
    private String time;
    private String[] daysOfTheWeeks;

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirplaneType() {
        return airplaneType;
    }

    public void setAirplaneType(String airplaneType) {
        this.airplaneType = airplaneType;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String[] getDaysOfTheWeeks() {
        return daysOfTheWeeks;
    }

    public void setDaysOfTheWeeks(String[] daysOfTheWeeks) {
        this.daysOfTheWeeks = daysOfTheWeeks;
    }


    public Flight(String destination, int flightNumber, String airplaneType, String time, String[] daysOfTheWeeks) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.airplaneType = airplaneType;
        this.time = time;
        this.daysOfTheWeeks = daysOfTheWeeks;
    }

    public String toString() {
        return "Airline's information: " + "destination: " + destination + ", flightNumber: " + flightNumber +
                ", airplaneType: " + airplaneType + ", time: " + time + ", daysOfTheWeeks: " + Arrays.toString(daysOfTheWeeks);
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return flightNumber == flight.flightNumber && Objects.equals(destination, flight.destination) &&
                Objects.equals(airplaneType, flight.airplaneType) && Objects.equals(time, flight.time) &&
                Arrays.equals(daysOfTheWeeks, flight.daysOfTheWeeks);
    }

    public int hashCode() {
        int result = Objects.hash(destination, flightNumber, airplaneType, time);
        result = 31 * result + Arrays.hashCode(daysOfTheWeeks);
        return result;
    }
}
