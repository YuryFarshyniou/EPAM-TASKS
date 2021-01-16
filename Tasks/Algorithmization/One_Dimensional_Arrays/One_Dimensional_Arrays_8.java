package Algorithmization.One_Dimensional_Arrays;

/* Дана последовательность целых чисел a1,a2,...,an.Образовать новую последовательность,
 выбросив их исходной те члены,которые равны min(a1,a2,...,an); */

import java.util.*;


public class One_Dimensional_Arrays_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            int a = sc.nextInt();
            arr[i] = a;
        }
        Arrays.sort(arr);
        int min = arr[0];
        List<Integer> arr2 = new ArrayList<>();
        for (int num :
                arr) {
            if (min != num) {
                arr2.add(num);
            }
        }
        System.out.println(arr2);
    }
}
