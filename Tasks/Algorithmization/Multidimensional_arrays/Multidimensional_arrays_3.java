package Algorithmization.Multidimensional_arrays;

// Дана матрица.Вывести k-ю строку и р-й столбец матрицы.

import java.io.*;


public class Multidimensional_arrays_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int lineNumber = Integer.parseInt(reader.readLine());
        int columnNumber  = Integer.parseInt(reader.readLine());
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {14, 123, 10, 5}, {65, 2, 17, 87}};

        for (int i = 0; i < arr.length; i++) {
            if (lineNumber == i) {
                for (int j = 0; j < arr[lineNumber].length; j++) {
                    System.out.print(arr[lineNumber][j] + " ");
                }
                System.out.println(" ");
            }

        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (columnNumber == j) {
                    System.out.print(arr[i][columnNumber] + " ");
                }
            }

        }

    }
}
