package algorithmization.decomposition;

/* Даны числа X,Y,Z,T - длины сторон четырехугольника.Написать метод(методы)
вычисления его площади,если угол между сторонами длиной X and Y прямой. */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Decomposition_9 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter x side: ");
        double x = Double.parseDouble(reader.readLine());
        System.out.println("Enter y side: ");
        double y = Double.parseDouble(reader.readLine());
        System.out.println("Enter z side: ");
        double z = Double.parseDouble(reader.readLine());
        System.out.println("Enter t side: ");
        double t = Double.parseDouble(reader.readLine());
        if (Double.isNaN(area(x, y, z, t))) {
            System.out.println("Wrong parameters of triangle");
        } else {
            System.out.println("The area is: " + area(x, y, z, t));
        }
    }

    static double area(double x, double y, double z, double t) {
        // Проводим диагональ от x до y.Вычисляем площадь полученного прямоугольного треугольника.

        double rightTriangleArea = (x * y) / 2;

        // Находим длинну гипотенузы с помощью теоремы Пифагора.

        double hypotenuse = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

        // Площадь второго треугольника находим по формуле Герона.

        double perimeter = (hypotenuse + z + t) / 2;
        double otherTriangleArea = Math.sqrt(perimeter * (perimeter - hypotenuse) * (perimeter - z) * (perimeter - t));

        return rightTriangleArea + otherTriangleArea;
    }

}
