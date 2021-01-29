package basicOfSoftwareCodeDevelopment;

/* Дан числовой ряд и некоторое число е.Найти сумму тех членов ряда,
модуль которых больше или равен заднному е.Общий член ряда имеет вид:
An = 1/2n + 1/3n ; */

import java.util.Scanner;

public class Cycles_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0.0;
        double e = 0.1;
        double an;
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            an = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);
            if (Math.abs(an) >= e) {
                sum += an;
            }
        }
        System.out.println("Sum is : " + sum);
    }
}
