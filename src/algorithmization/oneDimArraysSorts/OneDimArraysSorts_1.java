package algorithmization.oneDimArraysSorts;

/*Заданы два одномерных массива с различным количеством элементов и натуральное число k.Объединить их в
один массив, включив второй массив между k-m и (k+1) - m элементами первого,при этом не используя допол-
нительный массив. */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class OneDimArraysSorts_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Random rand = new Random();

        //Создаем первый массив

        int[] arr = new int[rand.nextInt(5) + 2];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(30) + 1;
        }
        System.out.println("Our first array: " + Arrays.toString(arr));

        // Создаем второй массив

        int[] arr2 = new int[rand.nextInt(6) + 2];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = rand.nextInt(30) + 1;
        }
        System.out.println("Our second array: " + Arrays.toString(arr2));
        System.out.println("Enter an index number from 0 to " + arr.length + ":");
        int k = Integer.parseInt(reader.readLine());

        // Добавляем в общий массив элементы первого массива.

        if (k > arr.length) {
            System.out.println("Wrong array's index");
        } else {
            int[] arr3 = new int[arr.length + arr2.length];
            for (int i = 0; i < arr3.length; i++) {
                if (i >= arr.length) break;
                arr3[i] = arr[i];
            }

            // Передвигаем элементы,тем самым освобождая место для вставки элементов второго массива.

            boolean needIteration = true;
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

            // Добавляем в освободившееся место элементы второго массива.

            for (int i : arr2) {
                arr3[k] = i;
                k++;
            }
            System.out.println("Our new array: " + Arrays.toString(arr3));
        }
    }
}
