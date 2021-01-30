package algorithmization.multidimensionalArrays;

/* Задана матрица неотрицательных чисел.Посчитать сумму элементов в каждом столбце.
Определить,какой столбец содержит максимальную сумму.
 */

public class MultidimensionalArrays_9 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 17}, {5, 3}, {23, 14, 55, 48, 89}};

        // Выводим матрицу.

        System.out.println("Our matrix: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }

        // Считаем сумму.

        int maxCount = 0;
        int column = 0;
        int n = 0;
        boolean is = true;
        while (is) {
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (n >= arr[i].length && i == arr.length - 1) {
                        is = false;
                    } else if (j == n) {
                        count += arr[i][j];
                    }
                }
            }
            if (count > maxCount) {
                maxCount = count;
                column = n;
            }
            if (is) {
                System.out.println("The sum of " + n + " column  is " + count);
                n++;

            } else {
                break;
            }
        }
        System.out.println("MaxSum of " + column + " column is " + maxCount);
    }
}
