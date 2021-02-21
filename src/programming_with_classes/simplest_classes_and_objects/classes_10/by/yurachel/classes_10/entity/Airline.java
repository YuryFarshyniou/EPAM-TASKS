package programming_with_classes.simplest_classes_and_objects.classes_10.by.yurachel.classes_10.entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Airline {
    private List<Flight> flightList;

    {
        flightList = new ArrayList<>();
    }

    public List<Flight> getFlightList() {
        return flightList;
    }

    public void setFlightList(List<Flight> flightList) {
        this.flightList = flightList;
    }


    // Выводим список всех рейсов.

    public void showFlight() {
        System.out.println("All flights: ");
        for (Flight flight : flightList) {
            System.out.println(flight);
        }
    }

    // Добавляем новые рейсы

    public void addFlight(String destination, int flightNumber, String airplaneType, String time, String[] daysOfTheWeeks) {
        flightList.add(new Flight(destination, flightNumber, airplaneType, time, daysOfTheWeeks));
    }

    // Список рейсов для заданного пункта назначения.

    public void destinationFlight(String destination) {
        int count = 0;
        for (Flight flight : flightList) {
            if (destination.equalsIgnoreCase(flight.getDestination())) {
                count++;
                System.out.println(flight);
            }
        }
        if (count == 0) System.out.println("There are no flight to this destination.");
    }

    //Список рейсов для заданного дня недели.

    public void dayOfTheWeekFlight(String dayOfTheWeek) {
        int count = 0;
        for (Flight flight : flightList) {
            for (int i = 0; i < flight.getDaysOfTheWeeks().length; i++) {
                if (dayOfTheWeek.equalsIgnoreCase(flight.getDaysOfTheWeeks()[i])) {
                    count++;
                    System.out.println(flight);
                }
            }
        }
        if (count == 0) System.out.println("There are no flight this day.Or you enter not day of the week.");
    }

    // Список рейсов для заданного дня недели,время вылета для которых больше заданного.

    public void dayOfTheWeekAndTimeFlight(String dayOfTheWeek,String setTime ) throws ParseException {

        SimpleDateFormat format = new SimpleDateFormat("hh:mm");
        Date date = format.parse(setTime);
        for (Flight flight : flightList) {
            for (int i = 0; i < flight.getDaysOfTheWeeks().length; i++) {
                SimpleDateFormat formatter = new SimpleDateFormat("hh:mm");
                Date date2 = format.parse(flight.getTime());
                int compareTime = date.compareTo(date2);
                if (dayOfTheWeek.equalsIgnoreCase(flight.getDaysOfTheWeeks()[i]) &&
                        compareTime < 0) {
                    System.out.println(flight);
                }
            }
        }
    }


}
