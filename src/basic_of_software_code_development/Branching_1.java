package basic_of_software_code_development;

/* Даны два треугольника (в градусах).Определить,существует ли такой треугольник,
и если да, то будет ли он прямоугольным. */

import java.util.Scanner;

public class Branching_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Corner: ");
        int firstCorner = sc.nextInt();
        System.out.println("Enter the second Corner: ");
        int secondCorner = sc.nextInt();
        System.out.println("Enter the third Corner: ");
        int thirdCorner = sc.nextInt();
        if (firstCorner + secondCorner + thirdCorner == 180) {
            System.out.print("Yes, this triangle exists and ");
            if (firstCorner + secondCorner == 90) {
                System.out.println("its a right triangle");
            } else {
                System.out.println(" its an usually triangle");
            }
        } else {
            System.out.println("This triangle isn't exists");
        }
    }
}
