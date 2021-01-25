package algorithmization.multidimensionalArrays;

/* Магическим квадратом порядка n называется квадратная матрица размера n*n,составленная из чисел 1,2,3,...,n^2.
так,что суммы по каждому столбцу,каждой строке и каждой из двух больших диагоналей равны между собой.Построить такой
магический квадрат. */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultidimensionalАrrays_16 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите магическое число M.Оно должно быть кратно 3 и больше 15: ");
        int m = Integer.parseInt(reader.readLine());
        if (m % 3 != 0 || m < 15) {
            System.out.println("Введите число,соответствующее критериям условия.");
        } else {

            int[][] arrFifteen = {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}};


            int centralNumber = m / 3;
            int countNumber = centralNumber - 5;
            int[][] arrM = new int[3][3];
            for (int i = 0; i < arrM.length; i++) {
                for (int j = 0; j < arrM[i].length; j++) {
                    arrM[i][j] = arrFifteen[i][j] + countNumber;
                }
            }

            System.out.println("Наш магический квадрат для магического числа M: ");
            for (int i = 0; i < arrM.length; i++) {
                for (int j = 0; j < arrM[i].length; j++) {
                    System.out.print(arrM[i][j] + " ");
                }
                System.out.println(" ");
            }
        }
    }
}
