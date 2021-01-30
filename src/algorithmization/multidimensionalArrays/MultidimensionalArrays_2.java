package algorithmization.multidimensionalArrays;

// Дана квадратная матрица.Вывести на экран элементы,стоящие по диагонали.

import java.util.Random;

public class MultidimensionalArrays_2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(5) + 2;

        //Заполняем матрицу

        int[][] arr = new int[n][n];
        System.out.println("Our initial array: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rand.nextInt(30) + 1;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }

        // Выводим элементы

        System.out.println("Elements is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][i] + " ");
        }
    }
}
