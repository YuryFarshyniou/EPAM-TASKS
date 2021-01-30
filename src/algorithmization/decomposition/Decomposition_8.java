package algorithmization.decomposition;

/*Задан массив D. Определить следующие суммы: D[1] + D[2] + D[3];
D[3] + D[4] + D[5];D[4] + D[5] + D[6];Пояснение.Составить метод(методы)
для вычисления суммы трех последовательно расположенных элементов массива
с номерами от k до m. */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class Decomposition_8 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Random rand = new Random();
        System.out.println("Enter the size of our array: ");
        int d = Integer.parseInt(reader.readLine());

        int[] arr = new int[d];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(30) + 1;
        }
        System.out.println("Our array: " + Arrays.toString(arr));
        System.out.println("Enter the index of array: ");
        int k = Integer.parseInt(reader.readLine());
        if (k < 0 || k >= arr.length) {
            System.out.println("You enter wrong index.");
        } else {
            System.out.println("The sum is: " + sums(arr, k));
        }
    }

    // Определяем сумму элементов

    static int sums(int[] array, int firstIndex) {
        int sum = 0;
        for (int i = firstIndex; i < firstIndex + 3; i++) {
            if (i == array.length) {
                break;
            }
            sum += array[i];
            System.out.println("Our " + i + " number is: " + array[i]);
        }
        return sum;
    }
}
