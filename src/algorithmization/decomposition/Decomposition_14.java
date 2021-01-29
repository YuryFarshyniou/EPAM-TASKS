package algorithmization.decomposition;

/* Натуральное число,в записи которого n цифр, называется число Армстронга,
если сумма его цифр, возведенная в степень n, равна самому числу. Найти все числа
Армстронга от 1 до k. Для решения задачи использовать декомпозицию. */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Decomposition_14 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the highest number: ");
        int k = Integer.parseInt(reader.readLine());
        armstrongNumbers(k);
    }


    static void armstrongNumbers(int k) {
        int firstNumber = 1;
        while (firstNumber <= k) {
            int sum = 0;
            char[] arr = Integer.toString(firstNumber).toCharArray();
            for (int i = 0; i < arr.length; i++) {
                sum += Math.pow(Integer.parseInt(String.valueOf(arr[i])), arr.length);
            }
            if (sum == firstNumber) System.out.println(firstNumber + " is the armstrong number");

            firstNumber++;
        }
    }
}
