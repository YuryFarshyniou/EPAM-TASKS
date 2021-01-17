package BasicOfSoftwareCodeDevelopment;
// Найти max{min(a, b), min(c, d)}.

import java.util.*;

public class Branching_2 {

    public static void main(String[] args) {
        int min1, min2;
        Scanner x = new Scanner(System.in);

        System.out.println("Enter a :  ");
        int a = x.nextInt();
        System.out.println("Enter b :  ");
        int b = x.nextInt();
        min1 = Math.min(a, b);

        System.out.println("Enter c :  ");
        int c = x.nextInt();
        System.out.println("Enter d :  ");
        int d = x.nextInt();

        min2 = Math.min(c, d);
        if (min1 > min2) {
            System.out.println("max =  min1: " + min1);
        } else if (min2 > min1) {
            System.out.println("max = min2 :  " + min2);
        } else {
            System.out.println("These are equals");
        }

    }

}
