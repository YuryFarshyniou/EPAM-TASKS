package Algorithmization.OneDimArraysSorts;

/* Даны две последовательности a1<= a2 <= ...<= an and b1 <= b2 <= ... <= bm. Образовать
из них новую последовательность чисел так,что бы она тоже была неубывающей.Примечание.Долни-
тельный массив не использовать. */

import java.util.Arrays;

public class OneDimArraysSorts_2 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 7, 8, 15, 26};
        System.out.println("Our first array: " + Arrays.toString(arr));
        int[] arr2 = {2, 6, 9, 13, 19, 31, 47};
        System.out.println("Our second array: " + Arrays.toString(arr2));

        int[] arr3 = new int[arr.length + arr2.length];

        for (int i = 0; i < arr3.length; i++) {                             // Добавляем первый массив в общий массив
            if (i >= arr.length) break;
            arr3[i] = arr[i];
        }

        int k = 0;                                                         // Добавляем второй массив в общий массив
        while (k < arr2.length) {
            for (int i = arr.length; i < arr3.length; i++) {
                arr3[i] = arr2[k];
                k++;
            }
        }

        boolean needIteration = true;                                     // Сортируем массив
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < arr3.length; i++) {
                if (arr3[i] < arr3[i - 1]) {
                    int temp = arr3[i];
                    arr3[i] = arr3[i - 1];
                    arr3[i - 1] = temp;
                    needIteration = true;
                }
            }
        }
        System.out.println("Our new sorted array: " + Arrays.toString(arr3));
    }
}
