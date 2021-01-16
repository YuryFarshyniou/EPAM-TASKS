package Algorithmization.Multidimensional_arrays;
//Дана матрица . Вывести на экран все нечетные столбцы,у которых первый элемент больше последнего.

import java.util.Arrays;


public class Multidimensional_arrays_1 {
    public static void main(String[] args) {
        int[][] arr = {{156, 242, 3, 4,},
                       {67, 6, 7, 3},
                       {24, 56, 23, 2},
                       {54, 12, 37, 1}};
        System.out.println(Arrays.deepToString(arr));

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (j % 2 != 0 && arr[0][j] > arr[arr[i].length-1][j])
                    System.out.print(" " + arr[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
