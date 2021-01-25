package algorithmization.oneDimensionalArrays;

// Даны целые числа a1, a2..aN.Вывести на печать только те числа,для которых ai>i.

public class One_Dimensional_Arrays_5 {

    public static void main(String[] args) {
        int[] arr = {10, 22, 56, 4, 1, 6, 4, 20, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > i) {
                System.out.println(arr[i]);

            }
        }
    }
}
