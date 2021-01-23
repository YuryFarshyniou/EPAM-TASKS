package Algorithmization.OneDimArraysSorts;

/*Заданы два одномерных массива с различным количеством элементов и натуральное число k.Объединить их в
один массив, включив второй массив между k-m и (k+1) - m элементами первого,при этом не используя допол-
нительный массив. */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class OneDimArraysSorts_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = {1, 2, 3};
        System.out.println("Our first array: " + Arrays.toString(arr));
        int[] arr2 = {23, 14, 15, 16,15,2,45,2,1};
        System.out.println("Our second array: " + Arrays.toString(arr2));
        System.out.println("Enter an index number: ");
        int k = Integer.parseInt(reader.readLine());

        if (k > arr.length) {
            System.out.println("Wrong array's index");
        } else {
            int[] arr3 = new int[arr.length + arr2.length];

            for (int i = 0; i < arr3.length; i++) {                  // Добавляем в общий массив элементы первого массива.
                if (i >= arr.length) break;
                arr3[i] = arr[i];
            }

            boolean needIteration = true;                           // Передвигаем элементы,тем самым освобождая место для вставки элементов второго массива.
            while (needIteration) {
                needIteration = false;
                for (int i = k + 1; i < arr3.length; i++) {
                    if (arr3[i] < arr3[i - 1] && arr3[i] == 0) {
                        int temp = arr3[i];
                        arr3[i] = arr3[i - 1];
                        arr3[i - 1] = temp;
                        needIteration = true;
                    }
                }
            }
            for (int i : arr2) {                                    // Добавляем в освободившееся место элементы второго массива.
                arr3[k] = i;
                k++;
            }
            System.out.println("Our new array: " + Arrays.toString(arr3));
        }
    }
}
