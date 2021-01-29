package basicOfSoftwareCodeDevelopment;

/* Напишите программу,где пользователь вводит любое целое положительное число.
А программа суммирует все числа от 1 до введенного пользователем числа. */

import java.util.Scanner;

public class Cycles_1 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int sum = 0;
        int positiveNumber = x.nextInt();
        if (positiveNumber <= 0) {
            System.out.println("Enter another number!!!");
        } else {
            for (int i = 1; i <= positiveNumber; i++) {
                sum += i;
            }
            System.out.println("Sum is: " + sum);
        }
    }
}
