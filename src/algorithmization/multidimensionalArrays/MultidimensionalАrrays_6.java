package algorithmization.multidimensionalArrays;

// Сформировать квадратную матрицу порядка n по заданному образцу(n - четное).

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultidimensionalАrrays_6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number: ");
        int n = Integer.parseInt(reader.readLine());
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length-i; j++) {
                arr[i][j]=1;
            }
        }
        int count=0;
        for (int i = arr.length-1; i >=0; i--) {
            for (int j = count; j <arr[i].length-count ; j++) {
                arr[i][j]=1;
            }
            count++;
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
