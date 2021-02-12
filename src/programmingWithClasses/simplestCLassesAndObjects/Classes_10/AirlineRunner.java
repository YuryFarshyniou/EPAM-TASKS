package programmingWithClasses.simplestCLassesAndObjects.Classes_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;

public class AirlineRunner {
    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        AirlineList airLine = new AirlineList();

        // Добавляем новые рейсы.

        airLine.airlineList.add(new Airline("Moscow", 657, "Boing 717", "22:40", new String[]{"Monday", "Wednesday", "Saturday"}));
        airLine.airlineList.add(new Airline("New York", 340, "Boing 737", "10:15", new String[]{"Monday", "Saturday"}));
        airLine.airlineList.add(new Airline("London", 125, "Boing 757", "13:26", new String[]{"Tuesday", "Thursday"}));
        airLine.airlineList.add(new Airline("Paris", 869, "Boing 757", "19:06", new String[]{"Thursday", "Sunday"}));
        airLine.airlineList.add(new Airline("Kiev", 666, "Boing 717", "23:01", new String[]{"Monday", "Wednesday", "Sunday"}));
        airLine.airlineList.add(new Airline("Riga", 100, "Boing 717", "4:05", new String[]{"Tuesday", "Thursday", "Sunday"}));
        airLine.airlineList.add(new Airline("Tokyo", 213, "Boing 747", "3:40", new String[]{"Saturday"}));
        airLine.airlineList.add(new Airline("Kiev", 521, "Boing 737", "1:17", new String[]{"Friday"}));

        System.out.println("All our flights: ");
        airLine.showFlight(airLine.airlineList);

        System.out.println("\n********************************************\n");

        System.out.println("What do you want to do? \na) Show the list flights for a given destination.\n" +
                "b) Show the list flights for a given day of the week.\n" +
                "c) Show the list flights for a given day of the week,the departure time for which is longer than the specified one.");
        System.out.println("Write your option(a//b//c): ");
        String answer = reader.readLine();

        // Выводим список рейсов для заданного пункта назначения.

        if (answer.equals("a")) {

            airLine.destinationFlight(airLine.airlineList);

            // Выводим список рейсов для заданного дня недели.

        } else if (answer.equals("b")) {
            airLine.dayOfTheWeekFlight(airLine.airlineList);

            // Выводим список рейсов для заданного дня недели,время вылета которых больше заданного.

        } else if (answer.equals("c")) {

            airLine.dayOfTheWeekAndTimeFlight(airLine.airlineList);
        } else {
            System.out.println("You entered wrong option.Try again");
        }
    }
}
