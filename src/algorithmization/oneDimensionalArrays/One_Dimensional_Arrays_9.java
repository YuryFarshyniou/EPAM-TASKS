package algorithmization.oneDimensionalArrays;

/* В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
Если таких чисел несколько,то определить наименьшее из них. */

import java.util.Arrays;
import java.util.Random;

public class One_Dimensional_Arrays_9 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[rand.nextInt(9) + 2];

        // Заполняем массив

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(30) + 1;
        }
        System.out.println("Our initial array: " + Arrays.toString(arr));

        // Находим число.

        int count = 0;
        int number = 0;
        for (int k : arr) {
            int count1 = 0;
            for (int i : arr) {
                if (k == i) {
                    count1++;
                }
                if (count1 > count) {
                    count = count1;
                    number = i;
                }
            }
            if (count1 == count) {
                if (k < number) {
                    number = k;
                }
            }
        }
        System.out.println("The lowest most common number is: " + number);
    }
}
