package programmingWithClasses.simplestCLassesAndObjects.Classes_6;

import java.io.IOException;
import java.util.GregorianCalendar;

public class TimeRunner {
    public static void main(String[] args) throws IOException {
        Time time = new Time(new GregorianCalendar());

        time.setTime();
        System.out.println("Current time: \n" + time.showTime());
    }
}
