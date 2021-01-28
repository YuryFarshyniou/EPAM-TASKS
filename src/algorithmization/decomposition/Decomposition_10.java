package algorithmization.decomposition;

/* Дано натуральное число N. Написать метод(методы) для формирования массива,
элементами которого являются цифры числа N. */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Decomposition_10 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number: ");
        int n = Integer.parseInt(reader.readLine());
        System.out.println("The array is: " + Arrays.toString(arrayOfDigits(n)));
    }


// Создаем массив

    static int[] arrayOfDigits(int n) {
        String number = Integer.toString(n);
        int[] arrayOfDigits = new int[number.length()];
        int s = (int) Math.pow(10, arrayOfDigits.length - 1);
        for (int j = 0; j < arrayOfDigits.length; j++) {
            int digit = (n / s) % 10;
            arrayOfDigits[j] = digit;
            s /= 10;
        }
        return arrayOfDigits;
    }
}
