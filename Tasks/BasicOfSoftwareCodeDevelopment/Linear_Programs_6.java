package BasicOfSoftwareCodeDevelopment;
/* Для данной области составить линейную программу,которая печатает true ,
если точка с координатами(x,y) принадлежит закрашенной области, и false - в противном случае.
 */

import java.util.*;

public class Linear_Programs_6 {
    public static void main(String[] args) {
        boolean c = true;
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        System.out.println("Enter x : ");
        int x = a.nextInt();
        System.out.println("Enter y: ");
        int y = b.nextInt();
        if (x >= -4 && x <= 4 && y >= -3 && y <= 0 || x <= 2 && x >= -2 && y >= -3 && y <= 4) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }


    }
}
