package algorithmization.multidimensionalArrays;

// Сформировать квадратную матрицу порядка n по заданному образцу(n - четное).

public class MultidimensionalАrrays_4 {
    public static void main(String[] args) {
        int [] [] arr = {{1,2,3,4,5,6},{6,5,4,3,2,1,},{1,2,3,4,5,6},{6,5,4,3,2,1,},{1,2,3,4,5,6},{6,5,4,3,2,1}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");

        }
    }
}
