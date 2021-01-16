package Algorithmization.Multidimensional_arrays;

/* Сформировать квадратную матрицу порядка N по правилу :
A[i, j]=sin((i 2 -j 2 )/N) и подсчитать количество положительных элементов в ней.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Multidimensional_arrays_7 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of lines : ");

        int lineNumber = Integer.parseInt(reader.readLine());
        int count = 0;
        float[][] arr = new float[lineNumber][lineNumber];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (float) Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / lineNumber);
                System.out.print(arr[i][j] + " ");
                if (arr[i][j] > 0) count++;
            }
            System.out.println(" ");
        }
        System.out.println("The number of positive numbers is : " + count);
    }
}
