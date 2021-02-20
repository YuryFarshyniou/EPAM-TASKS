package programming_with_classes.simplest_classes_and_objects.classes_6.by.yurachel.classes_6.main;

import programming_with_classes.simplest_classes_and_objects.classes_6.by.yurachel.classes_6.entity.Time;
import programming_with_classes.simplest_classes_and_objects.classes_6.by.yurachel.classes_6.view.Show;

import java.io.IOException;
import java.util.GregorianCalendar;

public class TimeRunner {
    public static void main(String[] args) throws IOException {
        Time time = new Time(new GregorianCalendar(), 2020, 5, 555, 5555, 56, 43);
        Show show = new Show();
        show.showTime(time.getCalendar());
    }
}
