package Algorithmization.MultidimensionalArrays;

// Сформировать квадратную матрицу порядка n по заданному образцу(n - четное).

public class MultidimensionalАrrays_5 {
    public static void main(String[] args) {
int [] [] arr = {{1,1,1,1,1,1,},{2,2,2,2,2,0},{3,3,3,3,0,0},{4,4,4,0,0,0},{5,5,0,0,0,0},{6,0,0,0,0,0}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
    }




}

