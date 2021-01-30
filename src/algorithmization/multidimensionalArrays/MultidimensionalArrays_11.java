package algorithmization.multidimensionalArrays;

/* Матрицу 10*20 заполнить случайными числами от 0 до 15.Вывести на экран саму матрицу
и номера строк,в которых число 5 встречается три и более раз. */

public class MultidimensionalArrays_11 {
    public static void main(String[] args) {
        int[][] matrix = new int[10][20];
        int[] array = new int[10];
        System.out.println("Our matrix: ");
        for (int i = 0; i < matrix.length; i++) {
            int count = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 15);
                System.out.print(matrix[i][j] + " ");
                if (matrix[i][j] == 5) {
                    count++;
                }
            }
            System.out.println(" ");
            if (count >= 3) {
                array[i] = i;
            }
        }
        for (int n : array) {
            if (n != 0) System.out.println("The line number with 5 more then three times  is : " + n);
        }
    }
}
