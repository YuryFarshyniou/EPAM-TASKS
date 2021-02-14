package programmingWithClasses.simplestCLassesAndObjects.classes_10;

/* Создать класс Airline, спецификация которого приведена ниже. ОПределить конструкторы,
set-, get- методы и метод toString(). Создать второй класс, агрегирующий массив типа Airline,
с подходящими конструкторами и методами. Задать критерии выбора данных и вывести эти данные на экран.
 Airline: пункт назначения, номер рейса, тип самолета, время полета, дни недели.
 Найти и вывести:
 а) список рейсов для заданного пункта назначения.
 б) список рейсов для заданного дня недели.
 с) список рейсов для заданного дня недели, время полета для которого больше заданного.
 */

import java.util.Arrays;


public class Airline {
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


    public Airline(String destination, int flightNumber, String airplaneType, String time, String[] daysOfTheWeeks) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.airplaneType = airplaneType;
        this.time = time;
        this.daysOfTheWeeks = daysOfTheWeeks;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "destination='" + destination + '\'' +
                ", flightNumber=" + flightNumber +
                ", airplaneType='" + airplaneType + '\'' +
                ", time='" + time + '\'' +
                ", daysOfTheWeeks=" + Arrays.toString(daysOfTheWeeks) +
                '}';
    }
}
