package algorithmization.multidimensionalArrays;

// Найти наибольший элемент матрицы и заменить все нечетные элементы на него

public class MultidimensionalArrays_15 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2,}, {5, 6, 7, 8}, {12, 13, 14, 15, 6, 456, 4, 312}, {22, 23, 24, 25}};

        // Выводим массив

        System.out.println("Our array: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }

        // Находим наибольший элемент

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
        System.out.println("Largest number is :" + count);

        // Заменяем элементы

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 != 0) {
                    arr[i][j] = count;
                }
            }
        }

        // Выводим массив

        System.out.println("Our final array: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }

    }
}
