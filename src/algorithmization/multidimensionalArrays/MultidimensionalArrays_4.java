package algorithmization.multidimensionalArrays;

// Сформировать квадратную матрицу порядка n по заданному образцу(n - четное).

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultidimensionalArrays_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter n: ");
        int n = Integer.parseInt(reader.readLine());
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i += 2) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = j + 1;
            }
        }

        for (int i = 1; i < arr.length; i += 2) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = arr.length - j;
            }
        }
        System.out.println("Our array is: ");
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
