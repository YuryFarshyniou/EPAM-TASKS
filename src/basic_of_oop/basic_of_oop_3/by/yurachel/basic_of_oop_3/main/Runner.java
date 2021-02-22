package basic_of_oop.basic_of_oop_3.by.yurachel.basic_of_oop_3.main;

import basic_of_oop.basic_of_oop_3.by.yurachel.basic_of_oop_3.entity.Calendar;

public class Runner {
    public static void main(String[] args) throws Exception {
        Calendar calendar = new Calendar();
        calendar.addWeekend("May", 20, "Friday", true, "My birthday");
        calendar.addWeekend("February", 21, "Sunday", false, "Weekend");
        calendar.addWeekend("February", 23, "Tuesday", true, "February 23");
        calendar.showWeekend();

        System.out.println("**********************");
        calendar.sortHolidays("Ascending");
        calendar.showWeekend();

        System.out.println("*****************");

        calendar.showHolidaysOrWeekend("Weekend");
    }
}
