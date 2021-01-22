package Algorithmization.Multidimensional_arrays;

/* Сформировать случайную матрицу m x n , состоящую из нулей и единиц,
причем в каждом столбце число единиц равно номеру столбца.  */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Multidimensional_arrays_14 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of lines: ");
        int numberOfLines = Integer.parseInt(reader.readLine());
        System.out.println("Enter the number of columns: ");
        int numberOfColumns = Integer.parseInt(reader.readLine());
        int[][] arr = new int[numberOfLines][numberOfColumns];


        int n = 1;
        int a = 0;
        while (n <= numberOfColumns - 1) {
            if (a > numberOfLines - 1) {
                a--;
            }
            for (int i = 0; i <= a; i++) {
                arr[i][n] = 1;
            }
            n++;
            a++;
        }


        System.out.println("Our array: ");

        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println(" ");
        }
    }
}
