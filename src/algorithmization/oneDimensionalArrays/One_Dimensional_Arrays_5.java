package algorithmization.oneDimensionalArrays;

// Даны целые числа a1, a2..aN.Вывести на печать только те числа,для которых ai>i.

import java.util.Arrays;
import java.util.Random;

public class One_Dimensional_Arrays_5 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[rand.nextInt(11) + 2];

        //Заполняем массив

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(30);
            if (arr[i] > i) {
                System.out.println("The number is " + arr[i]);
            }
        }
        System.out.println("Our array: " + Arrays.toString(arr));
    }
}
