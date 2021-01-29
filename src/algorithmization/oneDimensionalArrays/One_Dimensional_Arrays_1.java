package algorithmization.oneDimensionalArrays;

// В массив А[N] занесены натуральные числа.Найти сумму тех элементов,которые кратны данному K.

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class One_Dimensional_Arrays_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int[] arr = new int[rand.nextInt(13) + 2];

        // Заполняем массив

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(30) + 1;
        }
        System.out.println("Our array: " + Arrays.toString(arr));

        // Находим сумму элементов.

        int sum = 0;
        System.out.println("Enter k: ");
        int k = sc.nextInt();
        for (int i : arr) {
            if (i % k == 0) {
                sum = sum + i;
            }
        }
        System.out.println("The sum is: " + sum);
    }
}
