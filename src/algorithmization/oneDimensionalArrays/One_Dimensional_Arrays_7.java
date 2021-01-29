package algorithmization.oneDimensionalArrays;

/* Даны действительные числа a1, a2, ..., an.Найти:
max( a1 + a2n, a2 + a2n-1,...,an + an+1). */

import java.util.Arrays;
import java.util.Random;

public class One_Dimensional_Arrays_7 {
    public static void main(String[] args) {
        Random rand = new Random();
        float[] arr = new float[rand.nextInt(10) + 2];
        int halfLength = arr.length / 2;
        float[] arr2 = new float[halfLength];

        // Заполняем массив.

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextFloat() * 30;
        }
        System.out.println("Our initial array: " + Arrays.toString(arr));

        // Находим суммы и заносим их в другой массив.

        for (int i = 0; i < arr.length; i++) {
            if (i == halfLength) break;
            arr2[i] = arr[i] + (arr[arr.length - i - 1]);
        }
        System.out.println("Our sums: " + Arrays.toString(arr2));

        // Находим max.

        float max = Float.MIN_VALUE;
        for (int i = 0; i < arr2.length; i++) {
            if (arr[i] > max) {
                max = arr2[i];
            }
        }
        System.out.println("Max sum is: " + max);
    }
}
