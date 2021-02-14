package programmingWithClasses.simplestCLassesAndObjects.classes_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class AirlineList {
    ArrayList<Airline> airlineList = new ArrayList<>();
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    // Выводим список всех рейсов.

    void showFlight(ArrayList<Airline> airlineList) {
        for (Airline airline : airlineList) {
            System.out.println(airline);
        }
    }

    // Список рейсов для заданного пункта назначения.

    void destinationFlight(ArrayList<Airline> airlineList) throws IOException {
        System.out.println("Enter destination: ");
        String destination = reader.readLine();
        int count = 0;
        for (Airline airline : airlineList) {
            if (destination.equalsIgnoreCase(airline.getDestination())) {
                count++;
                System.out.println(airline);
            }
        }
        if (count == 0) System.out.println("There are no flight to this destination.");
    }

    //Список рейсов для заданного дня недели.

    void dayOfTheWeekFlight(ArrayList<Airline> airlineList) throws IOException {
        System.out.println("Enter day of the week: ");
        String dayOfTheWeek = reader.readLine();
        int count = 0;
        for (Airline airline : airlineList) {
            for (int i = 0; i < airline.getDaysOfTheWeeks().length; i++) {
                if (dayOfTheWeek.equalsIgnoreCase(airline.getDaysOfTheWeeks()[i])) {
                    count++;
                    System.out.println(airline);
                }
            }
        }
        if (count == 0) System.out.println("There are no flight this day.Or you enter not day of the week.");
    }

    // Список рейсов для заданного дня недели,время вылета для которых больше заданного.

    void dayOfTheWeekAndTimeFlight(ArrayList<Airline> airlineList) throws IOException, ParseException {
        System.out.println("Enter day of the week: ");
        String dayOfTheWeek = reader.readLine();
        System.out.println("Enter set time(hh:mm in this sample.): ");
        String setTime = reader.readLine();
        SimpleDateFormat format = new SimpleDateFormat("hh:mm");
        Date date = format.parse(setTime);
        for(Airline airline: airlineList){
            for (int i = 0; i < airline.getDaysOfTheWeeks().length; i++) {
                SimpleDateFormat formatter = new SimpleDateFormat("hh:mm");
                Date date2 = format.parse(airline.getTime());
                int compareTime = date.compareTo(date2);
                if(dayOfTheWeek.equalsIgnoreCase(airline.getDaysOfTheWeeks()[i])&&
                compareTime<0){
                    System.out.println(airline);
                }
            }
        }
    }


}
