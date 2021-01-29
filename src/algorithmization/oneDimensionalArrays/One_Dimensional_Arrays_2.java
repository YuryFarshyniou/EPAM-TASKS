package algorithmization.oneDimensionalArrays;

import java.util.*;

/*Дана последовательность действительных чисел a1,a2,...an;Заменить все ее члены,
 большие данного Z,этим числом.Подсчитать количество замен.*/

public class One_Dimensional_Arrays_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number from 1 to 9 : ");
        int z = sc.nextInt();
        int sum = 0;
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < arr.length; i++) {
            if (i >= z) {
                arr[i] = z;
                sum += 1;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Numbers changed: " + sum);
    }
}
