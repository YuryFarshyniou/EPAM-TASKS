package algorithmization.multidimensionalArrays;

// Сформировать квадратную матрицу порядка n по заданному образцу(n - четное).

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultidimensionalАrrays_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number: ");
        int n = Integer.parseInt(reader.readLine());
        int[][]arr = new int [n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length-i; j++) {
                arr[i][j]=i+1;
            }
        }
        System.out.println("Our array: ");
        showArray(arr);
    }



    static int[][] showArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
        return array;
    }
}

