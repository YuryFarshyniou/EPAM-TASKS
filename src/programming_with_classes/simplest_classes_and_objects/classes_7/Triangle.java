package programming_with_classes.simplest_classes_and_objects.classes_7;

/* Описать класс, представляющий треугольник. Предусмотреть методы для создания
объектов,вычисления площади, периметра и точки пересечения медиан. */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Triangle {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    ;
    private double firstSide;
    private double secondSide;
    private double thirdSide;
    private double angleBetweenFirstSecondSides;
    private double angleBetweenFirstThirdSides;
    private double angleBetweenThirdSecondSides;
    private double heightToFirstSide;

    public double getAngleBetweenFirstSecondSides() {
        return angleBetweenFirstSecondSides;
    }

    public void setAngleBetweenFirstSecondSides(double angleBetweenFirstSecondSides) {
        this.angleBetweenFirstSecondSides = angleBetweenFirstSecondSides;
    }

    public double getAngleBetweenFirstThirdSides() {
        return angleBetweenFirstThirdSides;
    }

    public void setAngleBetweenFirstThirdSides(double angleBetweenFirstThirdSides) {
        this.angleBetweenFirstThirdSides = angleBetweenFirstThirdSides;
    }

    public double getAngleBetweenThirdSecondSides() {
        return angleBetweenThirdSecondSides;
    }

    public void setAngleBetweenThirdSecondSides(double angleBetweenThirdSecondSides) {
        this.angleBetweenThirdSecondSides = angleBetweenThirdSecondSides;
    }

    public double getHeightToFirstSide() {
        return heightToFirstSide;
    }

    public void setHeightToFirstSide(double heightToFirstSide) {
        this.heightToFirstSide = heightToFirstSide;
    }

    public double getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(double firstSide) {
        this.firstSide = firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(double secondSide) {
        this.secondSide = secondSide;
    }

    public double getThirdSide() {
        return thirdSide;
    }

    public void setThirdSide(double thirdSide) {
        this.thirdSide = thirdSide;
    }

    //Равносторонний треугольник.

    Triangle(double Side) {
        this.firstSide = Side;
        this.secondSide = Side;
        this.thirdSide = Side;
    }

    //Произвольный  треугольник.

    Triangle(double firstSide, double secondSide, double thirdSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;

    }

    // Если размер не указан.

    Triangle() {
        this.firstSide = -1;
        this.secondSide = -1;
        this.thirdSide = -1;
    }

    // Площадь равностороннего треугольника.

    double equilateralTriangleSquare() {
        return (getFirstSide() * getFirstSide() * Math.sqrt(3)) / 4;
    }

    // Площадь произвольного треугольника.

    double arbitraryTriangleSquare() throws IOException {
        System.out.println("Enter height to the first side: ");

        setHeightToFirstSide(Double.parseDouble(reader.readLine()));

        return getFirstSide() * getHeightToFirstSide() / 2;
    }

    // Периметр треугольника.

    double perimeter() {
        return getFirstSide() + getSecondSide() + getThirdSide();
    }

    // Поиск медианы по трем сторонам.

    double median() {
        return (Math.sqrt(2 * (getFirstSide() * getFirstSide()) + 2 * (getSecondSide() + getSecondSide()) -
                2 * (getThirdSide() * getThirdSide()))) / 2;
    }


}
