package algorithmization.decomposition;

/* Написать программу, определяющую сумму n - значных чисел,
содержащих только нечетные цифры.Определить так же,сколько четных
цифр в найденной сумме.Для решения задачи использовать декомпозицию. */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Decomposition_16 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter n digit number: ");
        int n = Integer.parseInt(reader.readLine());
        System.out.println("The sum of numbers: " + onlyOddNumbers(n));
        System.out.println("The amount of even numbers in this sum: " + sumEvenNumbers(onlyOddNumbers(n)));
    }

// Определяем сумму чисел

    static int onlyOddNumbers(int n) {
        int lowestNumber = (int) Math.pow(10, n - 1);
        int highestNumber = (int) Math.pow(10, n) - 1;
        int sum = 0;
        while (lowestNumber <= highestNumber) {
            char[] arr = Integer.toString(lowestNumber).toCharArray();
            int nextDigit = 0;
            for (char i : arr) {
                if (i % 2 != 0) {
                    nextDigit++;
                }
            }
            if (nextDigit == n) sum += lowestNumber;
            lowestNumber++;
        }
        return sum;
    }

// Находим количество четных цифр в сумме

    static int sumEvenNumbers(int sum) {
        int evenCount = 0;
        char[] arr = String.valueOf(sum).toCharArray();
        for (char i : arr) {
            if (i % 2 == 0) evenCount++;
        }
        return evenCount;
    }
}
