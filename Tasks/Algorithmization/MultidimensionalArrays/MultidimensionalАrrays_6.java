package Algorithmization.MultidimensionalArrays;

// Сформировать квадратную матрицу порядка n по заданному образцу(n - четное).

public class MultidimensionalАrrays_6 {
    public static void main(String[] args) {
int [] [] arr = {{1,1,1,1,1,1,1,1},{0,1,1,1,1,1,1,0},{0,0,1,1,1,1,0,0},{0,0,0,1,1,0,0,0},{0,0,0,1,1,0,0,0},{0,0,1,1,1,1,0,0,},{0,1,1,1,1,1,1,0},{1,1,1,1,1,1,1,1}};
        System.out.println("Our array: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
