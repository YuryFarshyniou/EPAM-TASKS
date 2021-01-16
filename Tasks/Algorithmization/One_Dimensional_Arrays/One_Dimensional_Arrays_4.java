package Algorithmization.One_Dimensional_Arrays;

// ДАны действительные числа а1,а2...аn.Поменять местами наибольший и наименьший элементы.

import java.util.*;

public class One_Dimensional_Arrays_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6};
        int min = arr[0];
        int max = arr[5];
        arr[0] = max;
        arr[5] = min;
        System.out.println(Arrays.toString(arr));

    }

}
