package Algorithmization.Multidimensional_arrays;

// Найти наибольший элемент матрицы и заменить все нечетные элементы на него

public class Multidimensional_arrays_15 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2,}, {5, 6, 7, 8}, {12, 13, 14, 15, 6, 456, 4, 312}, {22, 23, 24, 25}};
        System.out.println("Our array: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length; j++) {
                if (arr[i][j] > arr[i][j - 1] && count < arr[i][j]) {
                    count = arr[i][j];

                } else if (arr[i][j - 1] > arr[i][j] && count < arr[i][j - 1]) {
                    count = arr[i][j - 1];

                }

            }
        }
        System.out.println("Count is :" + count);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 != 0) {
                    arr[i][j] = count;
                }
            }
        }

        System.out.println("Our sorted array: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }

    }
}
