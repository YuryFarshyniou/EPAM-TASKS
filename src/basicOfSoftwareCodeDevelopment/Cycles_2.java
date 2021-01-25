package basicOfSoftwareCodeDevelopment;
/* Вычислить значения функции на отрезке [a,b] с шагом  h:
   {x,x>2;
y ={
   {-x,x<=2;
 */

import java.util.*;

public class Cycles_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y;
        System.out.println("Enter a : ");
        int a = sc.nextInt();
        System.out.println("Enter b : ");
        int b = sc.nextInt();
        System.out.println("Enter h : ");
        int h = sc.nextInt();

        for (int i = a; i <= b; i += h) {
            if (i > 2) {
                y = i;
            } else {
                y = i * (-1);
            }
            System.out.println("for x = " + i + " y = " + y);


        }

    }
}
