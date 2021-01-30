package algorithmization.multidimensionalArrays;

/* Сформировать квадратную матрицу порядка N по правилу :
A[i, j]=sin((i 2 -j 2 )/N) и подсчитать количество положительных элементов в ней.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultidimensionalArrays_7 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter N: ");
        int n = Integer.parseInt(reader.readLine());
        int positiveNumbers = 0;
        double[][] arr = new double[n][n];
        System.out.println("Our matrix: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / n);
                System.out.printf("%.2f", arr[i][j]);
                System.out.print(" ");
                if (arr[i][j] > 0) positiveNumbers++;
            }
            System.out.println(" ");
        }
        System.out.println("The amount of positive numbers: " + positiveNumbers);
        System.out.println();
    }
}
