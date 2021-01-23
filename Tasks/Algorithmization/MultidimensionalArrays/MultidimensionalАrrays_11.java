package Algorithmization.MultidimensionalArrays;

/* Матрицу 10*20 заполнить случайными числами от 0 до 15.Вывести на экран саму матрицу
и номера строк,в которых число 5 встречается три и более раз. */

public class MultidimensionalАrrays_11 {
    public static void main(String[] args) {
        int[][] arr = new int[10][20];
        int[] array = new int[10];
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 15);
                System.out.print(arr[i][j] + " ");
                if (arr[i][j] == 5) {
                    count++;
                }
            }
            System.out.println(" ");
            if (count > 3) {
                array[i] = i;
            }
        }
        for (int n : array) {
            if (n != 0) System.out.println("The line number with 5 more then three times  is : " + n);
        }
    }
}
