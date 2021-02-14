package programmingWithClasses.simplestCLassesAndObjects.classes_6;

/* Составьте описание класса для представления времени. Предусмотрите возможности
установки времени и изменения его отдельных полей(час, минута, секунда) с проверкой
допустимости вводимых значений. В случае неподустимых полей поле устанавливается в
значение 0. Создать методы изменения времени на заданное количество часов,минут,секунд. */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Date;

public class Time {

    private int year;
    private int month;
    private int day;
    private int hours;
    private int minutes;
    private int seconds;
    Calendar calendar;
    BufferedReader reader;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public Time(Calendar calendar) {
        this.calendar = calendar;
    }

    // Устанавливаем время

    void setTime() throws IOException {
        reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please, enter the year: ");
        setYear(Integer.parseInt(reader.readLine()));

        System.out.println("Please,enter the month: ");
        setMonth(Integer.parseInt(reader.readLine()));

        if (getMonth() > 11 || getMonth() < 0) setMonth(0);

        System.out.println("Please,enter the day: ");
        setDay(Integer.parseInt(reader.readLine()));
        if (getDay() < 1 || getDay() > 31) setDay(1);

        System.out.println("Please,enter the hour: ");
        setHours(Integer.parseInt(reader.readLine()));
        if (getHours() < 0 || getHours() > 24) setHours(0);

        System.out.println("Please,enter the minute: ");
        setMinutes(Integer.parseInt(reader.readLine()));
        if (getMinutes() < 0 || getMinutes() > 60) setMinutes(0);

        System.out.println("Please, enter the second: ");
        setSeconds(Integer.parseInt(reader.readLine()));
        if (getSeconds() < 0 || getSeconds() > 60) setSeconds(0);

        calendar.set(getYear(), getMonth(), getDay(), getHours(), getMinutes(), getSeconds());
    }

    // Выводим время.

    Date showTime() {

        return calendar.getTime();
    }
}

