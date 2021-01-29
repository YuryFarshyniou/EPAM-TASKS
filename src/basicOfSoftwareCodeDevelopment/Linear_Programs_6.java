package basicOfSoftwareCodeDevelopment;

/* Для данной области составить линейную программу,которая печатает true ,
если точка с координатами(x,y) принадлежит закрашенной области, и false - в противном случае.
 */

import java.util.Scanner;

public class Linear_Programs_6 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter x : ");
        int x = a.nextInt();
        System.out.println("Enter y: ");
        int y = a.nextInt();
        if (x >= -4 && x <= 4 && y >= -3 && y <= 0 || x <= 2 && x >= -2 && y >= -3 && y <= 4) {
            System.out.println("The point is in range.");
        } else {
            System.out.println("The point isn't in range.");
        }
    }
}
