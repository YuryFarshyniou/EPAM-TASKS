package programming_with_classes.simplest_classes_and_objects.classes_6;

import java.io.IOException;
import java.util.GregorianCalendar;

public class TimeRunner {
    public static void main(String[] args) throws IOException {
        Time time = new Time(new GregorianCalendar());

        time.setTime();
        System.out.println("Current time: \n" + time.showTime());
    }
}
