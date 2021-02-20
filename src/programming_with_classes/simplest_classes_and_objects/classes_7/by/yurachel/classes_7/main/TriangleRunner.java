package programming_with_classes.simplest_classes_and_objects.classes_7.by.yurachel.classes_7.main;

import programming_with_classes.simplest_classes_and_objects.classes_7.by.yurachel.classes_7.entity.Triangle;
import programming_with_classes.simplest_classes_and_objects.classes_7.by.yurachel.classes_7.logic.Calculations;
import programming_with_classes.simplest_classes_and_objects.classes_7.by.yurachel.classes_7.view.Show;

import java.io.IOException;

public class TriangleRunner {
    public static void main(String[] args) throws IOException {

        Triangle ran = new Triangle(10, 5, 8);
        Calculations calculations = new Calculations();
        Show show = new Show();
        show.showSquare(calculations.arbitraryTriangleSquare(ran.getFirstSide(), 4));
        show.showMedian(calculations.median(ran.getFirstSide(), ran.getSecondSide(), ran.getThirdSide()), "Third");
        show.showPerimeter(calculations.perimeter(ran.getFirstSide(), ran.getSecondSide(), ran.getThirdSide()));

    }
}
