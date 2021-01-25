package basicOfSoftwareCodeDevelopment;
/* Для каждого натурального числа в промежутке от m до n вывести все делители,кроме единицы и самого числа.
m and n вводятся с клавиатуры. */

import java.util.*;

public class Cycles_7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter m: ");
        int m = sc.nextInt();
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        for (int i = m; i < n; i++) {
            System.out.print(i + ": ");
            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                    System.out.print(j + " ");
                }

            }

            System.out.println("");
        }


    }

}
