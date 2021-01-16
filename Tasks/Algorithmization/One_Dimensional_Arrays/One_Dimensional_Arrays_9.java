package Algorithmization.One_Dimensional_Arrays;

/* В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
Если таких чисел несколько,то определить наименьшее из них. */
import java.util.Scanner;

public class One_Dimensional_Arrays_9 {

    public static void main(String[] args) {
        int[] arr = new int[9];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            int num = sc.nextInt();
            arr[i] = num;
        }
        int count = 0;
        int number = 0;
        for (int k : arr) {
            int count1 = 0;
            for (int i : arr) {

                if (k == i) {
                    count1++;
                }
                if (count1 > count) {

                    count = count1;
                    number = i;

                } else if (count1 == count) {
                    if (i < number) {
                        number = k;
                    }
                }
            }

        }
        System.out.println("Number  is : " + number);
    }
}
