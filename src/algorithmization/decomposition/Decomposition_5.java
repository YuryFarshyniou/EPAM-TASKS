package algorithmization.decomposition;

/* Составить программу,которая находит в массиве А[N] второе по величине число
(вывести на печать число, которе меньше максимального элемента массива ,но
больше всех других элементов). */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Decomposition_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Random rand = new Random();
        System.out.println("Enter the size of array: ");
        int n = Integer.parseInt(reader.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(30) + 1;
        }
        System.out.println("Our array: ");
        for (int number : arr) {
            System.out.print(number + " ");
        }
        System.out.println("");
        System.out.println("Before the max number: " + beforeMaxNumber(arr));
    }

    // Находим второе по величине число.

    static int beforeMaxNumber(int[] array) {
        int max = Integer.MIN_VALUE;
        int indexOfMax = 0;
        int beforeMaxNumber = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                indexOfMax = i;
            }
        }
        array[indexOfMax] = Integer.MIN_VALUE;
        for (int number : array) {
            if (number > beforeMaxNumber && number != max) {
                beforeMaxNumber = number;
            }
        }
        array[indexOfMax] = max;
        return beforeMaxNumber;
    }
}
