package programming_with_classes.simplest_classes_and_objects.classes_6.by.yurachel.classes_6.entity;

import java.util.Calendar;

public class Time {

    private int year;
    private int month;
    private int day;
    private int hours;
    private int minutes;
    private int seconds;
    private Calendar calendar;


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

    public Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;

    }

    public Time(Calendar calendar, int year, int month, int day, int hours, int minutes, int seconds) {
        this.calendar = calendar;
        this.year = year;
        this.month = month;
        if (this.month > 11 || this.month < 0) this.month = 0;
        this.day = day;
        if (this.day < 1 || this.day > 31) this.day = 1;
        this.hours = hours;
        if (this.hours < 0 || this.hours > 24) this.hours = 0;
        this.minutes = minutes;
        if (this.minutes < 0 || this.minutes > 60) this.minutes = 0;
        this.seconds = seconds;
        if (this.seconds < 0 || this.seconds > 60) this.seconds = 0;
        calendar.set(getYear(), getMonth(), getDay(), getHours(), getMinutes(), getSeconds());
    }
}

