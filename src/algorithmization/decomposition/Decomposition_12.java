package algorithmization.decomposition;

/* Даны натуральные числа K и N. Написать метод(методы) формирования массива А,
элементами которого являются числа,сумма цифр которых равна К и которые не большее N. */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Decomposition_12 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter K: ");
        int k = Integer.parseInt(reader.readLine());
        System.out.println("Enter N: ");
        int n = Integer.parseInt(reader.readLine());
        System.out.println(Arrays.toString(newArray(k, n)));
    }

    // Определяем длину массива.

    static int arrayLength(int k, int n) {
        int sum = 0;
        int temp = n;
        int count = 0;

        while (sum != k) {
            if (sum > k) {
                sum -= temp;
                temp--;
                count--;
            }
            sum += temp;
            count++;
        }
        return count;
    }

    // Передаем элементы в массив.

    static int[] newArray(int k, int n) {
        int[] array = new int[arrayLength(k, n)];
        int sum = 0;
        int temp = n;
        int count = 0;

        while (sum != k) {
            if (sum > k) {
                sum -= temp;
                temp--;
                count--;
            }
            array[count] = temp;
            sum += temp;
            count++;
        }
        return array;
    }
}
