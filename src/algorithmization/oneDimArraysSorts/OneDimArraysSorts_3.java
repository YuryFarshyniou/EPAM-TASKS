package algorithmization.oneDimArraysSorts;

/* Сортировка выбором.Дана последовательность чисел a1 <= a2 <=...<=an.Требуется переставить элементы так,что бы они
были расположенны по убыванию.Для этого в массиве,начиная с первого,выбирается наибольший элемент и ставится на первое
место, а первый - на место наибольшего.Затем ,начиная со второго, эта процедура повторяется. НАписать алгоритм сортировки выбором. */

import java.util.Arrays;

public class OneDimArraysSorts_3 {
    public static void main(String[] args) {
        int[] arr = {25, 13, 10, 2, 8, 17, 19, 1, 4};
        System.out.println("Our initial array: " + Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            int max = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] > arr[max]) {
                    max = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;
        }
        System.out.println("Our sorted array: " + Arrays.toString(arr));
    }
}
