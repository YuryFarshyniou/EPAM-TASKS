package basicOfSoftwareCodeDevelopment;

import java.util.*;
/* Даны два треугольника (в градусах).Определить,существует ли такой треугольник,
и если да, то будет ли он прямоугольным.
 */

public class Branching_1 {

    public static void main(String[] args) {


        Scanner firstC = new Scanner(System.in);
        Scanner secondC = new Scanner(System.in);
        Scanner thirdC = new Scanner(System.in);
        System.out.println("Enter firstCorner : ");
        int firstCorner = firstC.nextInt();
        System.out.println("Enter secondCorner : ");
        int secondCorner = secondC.nextInt();
        System.out.println("Enter thirdCorner : ");
        int thirdCorner = thirdC.nextInt();
        if (firstCorner + secondCorner + thirdCorner == 180) {
            System.out.println("Yes , this triangle exists and ");
            if (firstCorner + secondCorner == 90) {
                System.out.println("its a right triangle");
            } else {
                System.out.println("This is is usually triangle");
            }

        } else {
            System.out.println("This triangle isn't exists");
        }


    }

}
