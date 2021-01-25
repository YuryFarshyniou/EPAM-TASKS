package algorithmization.oneDimensionalArrays;

// В массив А[N] занесены натуральные числа.Найти сумму тех элементов,которые кратны данному K.

import java.util.*;

public class One_Dimensional_Arrays_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {5, 15, 23, 41, 30, 25, 17, 21, 90};
        int sum = 0;
        System.out.println("Enter 'k' number : ");
        int k = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % k == 0) {
                sum = sum + arr[i];

            }

        }
        System.out.println("The sum is: " + sum);
    }
}
