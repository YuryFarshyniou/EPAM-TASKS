package algorithmization.oneDimensionalArrays;

// Даны действительные числа а1,а2...аn.Поменять местами наибольший и наименьший элементы.

import java.util.Arrays;
import java.util.Random;


public class One_Dimensional_Arrays_4 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[rand.nextInt(9) + 2];

        // Заполняем массив

        int max = Integer.MIN_VALUE;
        int maxIndex = 0;
        int min = Integer.MAX_VALUE;
        int minIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(30) + 1;
            if (max < arr[i]) {
                max = arr[i];
                maxIndex = i;
            }
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }
        System.out.println("Our array: " + Arrays.toString(arr));

        // Меняем элементы

        int temp = arr[maxIndex];
        arr[maxIndex] = arr[minIndex];
        arr[minIndex] = temp;
        System.out.println("Our sorted array: " + Arrays.toString(arr));
    }
}
