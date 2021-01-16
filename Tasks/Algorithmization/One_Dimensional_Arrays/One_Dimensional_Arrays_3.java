package Algorithmization.One_Dimensional_Arrays;
/* Дан массив действительных чисел,размерность которого N.
 Подсчитать,сколько в нем отрицательных,положительных и нулевых элементов. */

import java.util.*;

public class One_Dimensional_Arrays_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int neg = 0;
        int zer = 0;
        int pos = 0;
        int[] arr = {-3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                neg += 1;
            } else if (arr[i] > 0) {
                pos += 1;
            } else {
                zer += 1;
            }

        }
        System.out.println("Number of negative numbers: " + neg);
        System.out.println("Number of positive numbers: " + pos);
        System.out.println("Number of zeros " + zer);


    }

}
