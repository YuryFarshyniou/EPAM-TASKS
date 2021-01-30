package algorithmization.multidimensionalArrays;

// Дана матрица.Вывести k-ю строку и р-й столбец матрицы.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;


public class MultidimensionalArrays_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Random rand = new Random();

        // Заполняем матрицу
        int[][] arr = new int[rand.nextInt(3) + 2][rand.nextInt(5) + 2];
        int lengthOfLines = arr.length;
        int lengthOfColumns = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rand.nextInt(30) + 1;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
           lengthOfColumns=arr[i].length;
        }
        System.out.println("Enter the line from 0 to " + (lengthOfLines-1));
        int lineNumber = Integer.parseInt(reader.readLine());
        System.out.println("Enter the column from 0 to " + (lengthOfColumns-1));

        int columnNumber = Integer.parseInt(reader.readLine());

        // Выводим строку
        System.out.println("The line: ");
        for (int i = 0; i < arr.length; i++) {
            if (lineNumber == i) {
                for (int j = 0; j < arr[lineNumber].length; j++) {
                    System.out.print(arr[lineNumber][j] + " ");
                }
                System.out.println(" ");
            }
        }

        // Выводим столбец

        System.out.println("Our column: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (columnNumber == j) {
                    System.out.print(arr[i][columnNumber] + " ");
                }
            }
        }
    }
}
