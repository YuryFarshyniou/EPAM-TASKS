package programmingWithClasses.simplestCLassesAndObjects.Classes_7;

import java.io.IOException;

public class TriangleRunner {
    public static void main(String[] args) throws IOException {
        // Равносторонний треугольник.

        Triangle tr = new Triangle(14);
        System.out.println(tr.equilateralTriangleSquare());
        System.out.println(tr.perimeter());
        System.out.println("Median : " + tr.median());

        // Произвольный треугольник.

//        Triangle ran = new Triangle(10,5,8);
//        System.out.println(ran.arbitraryTriangleSquare());
//        System.out.println("Median2: " + ran.median());


    }
}
