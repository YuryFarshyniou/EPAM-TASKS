package basicOfSoftwareCodeDevelopment;

/* Вычислить значение функции :
     { x^2-3x +9, если x<=3;
F(x)={
     { 1/(x^3 + 6), если x>3;
*/

import java.util.Scanner;

public class Branching_5 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter x: ");
        int x = a.nextInt();
        if (x <= 3) {
            System.out.println(Math.pow(x, 2) - 3 * x + 9);
        } else {
            System.out.println(1 / (Math.pow(x, 3) + 6));
        }
    }
}
