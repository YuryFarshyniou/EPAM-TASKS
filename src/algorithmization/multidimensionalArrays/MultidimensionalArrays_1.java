package algorithmization.multidimensionalArrays;
//Дана матрица . Вывести на экран все нечетные столбцы,у которых первый элемент больше последнего.

import java.util.Random;


public class MultidimensionalArrays_1 {
    public static void main(String[] args) {
        Random rand = new Random();

        // Создаем и заполняем нашу матрицу.

        int[][] arr = new int[rand.nextInt(3) + 2][rand.nextInt(5) + 2];
        System.out.println("Our initial matrix: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rand.nextInt(30) + 1;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }

        //Выводим на экран нечетные столбцы.

        System.out.println("Our columns: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length; j += 2) {
                if (arr[0][j] > arr[arr.length - 1][j])
                    System.out.print(" " + arr[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
