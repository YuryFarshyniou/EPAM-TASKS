package BasicOfSoftwareCodeDevelopment;
/* Напишите программу,где пользователь вводит любое целове положительное число.
А программа суммирует все числа от 1 до введенного пользователем числа. */

import java.util.*;

public class Cycles_1 {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int sum = 0;
        int a = x.nextInt();
        if (a <= 0) {
            System.out.println("Enter another number!!!");

        } else {
            for (int i = 0; i < a; i++) {

                sum += i;

            }
            System.out.println("Sum is : " + sum);
        }

    }
}
