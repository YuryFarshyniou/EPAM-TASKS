package algorithmization.multidimensionalArrays;

//Найти положительные элементы главной диагонали квадратной матрицы.

public class MultidimensionalArrays_10 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {12, 13, -14, 15}, {23, 12, 21, -22}};

        // Выводим матрицу.
        System.out.println("Our matrix: ");
        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr[i].length; k++) {
                System.out.print(arr[i][k] + " ");
            }
            System.out.println(" ");
        }

        // Находим положительные элементы

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j && arr[i][j] >= 0) {
                    System.out.println("The positive element of main diagonal is: " + arr[i][j]);
                }
            }
        }
    }
}
