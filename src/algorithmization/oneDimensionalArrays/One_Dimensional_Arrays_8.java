package algorithmization.oneDimensionalArrays;

/* Дана последовательность целых чисел a1,a2,...,an.Образовать новую последовательность,
 выбросив из исходной те члены,которые равны min(a1,a2,...,an); */

import java.util.Arrays;
import java.util.Random;


public class One_Dimensional_Arrays_8 {
    public static void main(String[] args) {

        // Заполняем массив и находим min.

        Random rand = new Random();
        int[] arr = new int[rand.nextInt(10) + 2];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(30) + 1;
            if (arr[i] <= min) min = arr[i];
        }
        System.out.println("Our sequence: " + Arrays.toString(arr));
        System.out.println("Our min is: " + min);

        // Находим количество min значений.

        int minCount = 0;
        for (int number : arr) {
            if (number == min) minCount++;
        }
        System.out.println("count of min's: " + minCount);

        // Образовываем новую последовательность.

        int[] newSequence = new int[arr.length - minCount];
        int j = 0;
        for (int i : arr) {
            if (i == min) {
                continue;
            }
            newSequence[j] = i;
            j++;
        }
        System.out.println("Our new sequence: " + Arrays.toString(newSequence));
    }
}
