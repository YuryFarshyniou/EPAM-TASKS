package programming_with_classes.simplest_classes_and_objects.classes_7.by.yurachel.classes_7.logic;

public class Calculations {

    // Площадь произвольного треугольника.

    public double arbitraryTriangleSquare(double firstSide, double heightToFirstSide) {
        return firstSide * heightToFirstSide / 2;
    }

    // Периметр треугольника.

    public double perimeter(double firstSide, double secondSide, double thirdSide) {
        return firstSide + secondSide + thirdSide;
    }

    // Поиск медианы по трем сторонам.

    public double median(double firstSide, double secondSide, double thirdSide) {

        return (Math.sqrt(2 * (firstSide * firstSide) + 2 * (secondSide * secondSide) -
                2 * (thirdSide * thirdSide))) / 2;
    }
}
