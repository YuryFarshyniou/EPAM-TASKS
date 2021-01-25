package algorithmization.oneDimArraysSorts;

/* Сортировка обменами. Дана последовательность чисел a1 <= a2 <=...<=an. Требуется переставить числа в
порядке возрастания. Для этого сравниваются два соседних числа ai and ai+1. Если ai > ai+1, то делается
перестановка. Так продолжается до тех пор, пока все элементы не станут расположенны в порядке возрастания.
Составить алгоритм сортировки, подсчитывая при этом количества перестановок. */

import java.util.Arrays;

public class OneDimArraysSorts_4 {
    public static void main(String[] args) {
        int[] arr = {17, 54, 2, 14, 1, 9, 24, 19, 3, 8};
        System.out.println("Out initial array: " + Arrays.toString(arr));
        boolean needIteration = true;
        int count = 0;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < arr[i - 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                    count++;
                    needIteration = true;
                }
            }
        }
        System.out.println("Our sorted arrays: " + Arrays.toString(arr) );
        System.out.println("The number of permutations: " + count);
    }
}
