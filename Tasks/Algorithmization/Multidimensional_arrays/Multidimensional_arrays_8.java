package Algorithmization.Multidimensional_arrays;

/* В числовой матрице поменять местами два столбца,т.е. все элементы одного столбца поставить на соответствующие
им позиции другого, а его элементы второго переместить в первый.Номера столбцов вводит пользователь с клавиатуры.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class Multidimensional_arrays_8 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[][] array = {{1, 2, 3, -4}, {6, 4, 12}, {7,5,67,28 }};
        System.out.println("Our array: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("Enter the number of first column: ");
        int firstColumn = Integer.parseInt(reader.readLine());
        System.out.println("Enter the number of second column: ");
        int secondColumn = Integer.parseInt(reader.readLine());
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j == firstColumn ) {
                    if (firstColumn >= array[i].length || secondColumn>=array[i].length) {

                    }else{
                    int temp = array[i][firstColumn];
                    array[i][firstColumn] = array[i][secondColumn];
                    array[i][secondColumn] = temp;
                }}
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }


    }
}
