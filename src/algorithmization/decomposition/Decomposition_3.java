package algorithmization.decomposition;

/* Вычислить площадь правильного шестиугольника со стороной а, используя метод
вычислния площади треугольника. */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Decomposition_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of a side: ");
        int a = Integer.parseInt(reader.readLine());
        double areaOfTriangle = areaOfTriangle(a);
        double areaOfHexagon = areaOfTriangle * 6;
        System.out.print("The area of a hexagon: ");
        System.out.printf("%.2f",areaOfHexagon);
    }


    static double areaOfTriangle(int a) {
        return (Math.pow(a, 2) * Math.sqrt(3)) / 4;
    }
}
