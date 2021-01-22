package Algorithmization.Multidimensional_arrays;

// Отсортировать столбцы матрицы по возрастанию и убыванию значений элементов

public class Multidimensional_arrays_13 {
    public static void main(String[] args) {
        int[][] arr = {{38, 45, 298, 67}, {41, 2, 78, 7, 89}, {25, 67, 31, 78, 6}, {1, 25, 19, 23, 9, 67}, {12, 44, 21, 5},{56,21}};
        System.out.println("Our array: ");
        printArray(arr);


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int value = arr[i][j];
                int f = i - 1;
                for (; f >= 0; f--) {
                    if (j <= arr[f].length - 1 && value < arr[f][j]) {
                        arr[f + 1][j] = arr[f][j];
                    } else {
                        break;
                    }
                }
                arr[f + 1][j] = value;
            }
        }

        System.out.println("Our array sorted in ascending order: ");
        printArray(arr);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                int value = arr[i][j];
                int f = i - 1;
                for (; f >= 0; f--) {

                    if (j <= arr[f].length - 1 && value > arr[f][j]) {
                        arr[f + 1][j] = arr[f][j];
                    } else {
                        break;
                    }
                }
                arr[f + 1][j] = value;
            }
        }
        System.out.println("Our array is sorted in descending order: ");
        printArray(arr);
    }


    static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
