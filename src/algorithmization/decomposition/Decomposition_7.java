package algorithmization.decomposition;

/* Написать метод(методы) для вычисления суммы факториалов
всех нечетных чисел от 1 до 9. */

import java.util.Arrays;

public class Decomposition_7 {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        int n = 1;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = n;
            n += 2;
        }
        System.out.println("Our numbers: " + Arrays.toString(numbers));
        System.out.println("The sum of factorials is: " + sumOfFactorials(numbers));
    }

    static int sumOfFactorials(int[] array) {
        int sum = 0;
        for (int number : array) {
            int factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            sum += factorial;
            System.out.println("The factorial of " + number + " number is " + factorial);
        }
        return sum;
    }
}
