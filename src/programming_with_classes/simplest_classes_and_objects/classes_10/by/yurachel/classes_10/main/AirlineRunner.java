package programming_with_classes.simplest_classes_and_objects.classes_10.by.yurachel.classes_10.main;

import programming_with_classes.simplest_classes_and_objects.classes_10.by.yurachel.classes_10.entity.Airline;

import java.io.IOException;
import java.text.ParseException;

public class AirlineRunner {
    public static void main(String[] args) throws IOException, ParseException {

        Airline airLine = new Airline();

        airLine.addFlight("Moscow", 657, "Boing 717", "22:40", new String[]{"Monday", "Wednesday", "Saturday"});
        airLine.addFlight("New York", 340, "Boing 737", "10:15", new String[]{"Monday", "Saturday"});
        airLine.addFlight("London", 125, "Boing 757", "13:26", new String[]{"Tuesday", "Thursday"});
        airLine.addFlight("Paris", 869, "Boing 757", "19:06", new String[]{"Thursday", "Sunday"});
        airLine.addFlight("Kiev", 666, "Boing 717", "23:01", new String[]{"Monday", "Wednesday", "Sunday"});
        airLine.addFlight("Riga", 100, "Boing 717", "4:05", new String[]{"Tuesday", "Thursday", "Sunday"});
        airLine.addFlight("Tokyo", 213, "Boing 747", "3:40", new String[]{"Saturday"});
        airLine.addFlight("Kiev", 521, "Boing 737", "1:17", new String[]{"Friday"});

//        airLine.showFlight();
//
//        airLine.destinationFlight("Kiev");
//
//        airLine.dayOfTheWeekFlight("monday");

        airLine.dayOfTheWeekAndTimeFlight("Monday", "15:00");

    }
}
