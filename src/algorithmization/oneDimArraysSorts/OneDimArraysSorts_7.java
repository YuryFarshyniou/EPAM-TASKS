package algorithmization.oneDimArraysSorts;

/* Пусть даны две неубывающие последовательности чисел a1 <=a2 <=...<=an and b1 <= b2 <=...<=bm
Требуется указать те места,на которые нужно вставлять элементы последовательности b1<= b2<=...<=bm
в первую последовательность так,что бы новая последовательность оставалась возрастающей. */


import java.util.Arrays;

public class OneDimArraysSorts_7 {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9, 9, 11, 13, 15, 17};
        System.out.println("Our first array: " + Arrays.toString(arr1));
        int[] arr2 = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        System.out.println("Our second array: " + Arrays.toString(arr2));
        int[] arr3 = new int[arr1.length + arr2.length];
        int[] arr4 = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        int j = 0;
        while (j < arr2.length) {
            for (int i = 0; i < arr3.length; i++) {
                if (arr2[j] < arr3[i]) {
                    swap(arr3, arr4, i);
                    arr3[i] = arr2[j];
                    ReverseSwap(arr4, arr3, i + 1);
                    j++;
                    System.out.println("The index of arr3 is:  " + i);
                    break;
                }
                if (arr2[j] > arr3[i] && arr3[i] == 0) {
                    arr3[i] = arr2[j];
                    System.out.println("The index of arr3 is:  " + i);
                    j++;
                    break;
                }
            }
        }
        System.out.println("The new array is: " + Arrays.toString(arr3));
    }

    public static void swap(int[] array1, int[] array2, int index) {
        for (int i = index; i < array1.length; i++) {
            if (array1[i] == 0) {
                break;
            } else {
                array2[i + 1] = array1[i];
            }
        }
    }

    public static void ReverseSwap(int[] array1, int[] array2, int index) {
        for (int i = index; i < array1.length; i++) {
            if (array1[i] == 0) {
                break;
            } else {
                array2[i] = array1[i];
            }
        }
    }
}
