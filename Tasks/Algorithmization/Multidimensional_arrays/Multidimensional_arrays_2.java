package Algorithmization.Multidimensional_arrays;

// Дана квадратная матрица.Вывести на экран элементы,стоящие по диагонали.

public class Multidimensional_arrays_2 {
    public static void main(String[] args) {
int [] [] arr = {{1,2,3,4},
                 {5,6,7,8,},
                 {9,10,11,12},
                 {13,14,15,16}};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][i] );

        }

    }
}