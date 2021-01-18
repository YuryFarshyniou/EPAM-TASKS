package Algorithmization.Multidimensional_arrays;

// Отсортировать столбцы матрицы по возрастанию и убыванию значений элементов

public class Multidimensional_arrays_13 {
    public static void main(String[] args) {
        int[][] arr = {{38, 45, 298, 7}, {41, 2, 78}, {25, 67, 31, 5}};
        System.out.println("Our array: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }


        int lengthOfColumns = 0;
        int n = 0;
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < arr.length; i++) {

                for (int j = 0; j < arr[i].length; j++) {

                    lengthOfColumns = arr[i].length;
                    if (n == j) {
                        if (arr[i].length < arr[i - 1].length) {

                        } else {
                            if (arr[i][j] < arr[i - 1][j]) {
                                int temp = arr[i][j];
                                arr[i][j] = arr[i - 1][j];
                                arr[i - 1][j] = temp;
                                needIteration = true;
                            }
                        }
                    }
                }

                if (!needIteration && n >= lengthOfColumns) {
                    break;
                } else if (!needIteration) {
                    n++;
                    needIteration = true;
                }
            }
        }


        System.out.println("Our array sorted in ascending order: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }

    }
}
