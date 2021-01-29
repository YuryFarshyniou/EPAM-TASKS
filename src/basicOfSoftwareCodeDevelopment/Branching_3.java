package basicOfSoftwareCodeDevelopment;

/* Даны три точки A(x1, y1), B(x2, y2), C(x3, y3).
 Определить,будут ли они расположенны на одной прямой.*/

import java.util.Scanner;

public class Branching_3 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter x1: ");
        int x1 = a.nextInt();
        System.out.println("Enter y1: ");
        int y1 = a.nextInt();
        System.out.println("Enter x2: ");
        int x2 = a.nextInt();
        System.out.println("Enter y2: ");
        int y2 = a.nextInt();
        System.out.println("Enter x3: ");
        int x3 = a.nextInt();
        System.out.println("Enter y3: ");
        int y3 = a.nextInt();
        if (((x1 - x3) * (y2 - y3)) - ((x2 - x3) * (y1 - y3)) == 0) {
            System.out.println("Lie on one straight line");
        } else {
            System.out.println("Don't lie on one straight line");
        }
    }
}
