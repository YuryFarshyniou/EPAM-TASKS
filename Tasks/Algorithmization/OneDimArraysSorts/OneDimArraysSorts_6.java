package Algorithmization.OneDimArraysSorts;

/* Сортировка Шелла.Дан массив n действительных чисел. Требуется упорядочить его по возростанию.
Делается это следующим образом: сравниваются два соседних элемента ai and ai+1.Если ai<ai+1,
то передвигаются на один элемент вперед.Если ai>ai+1, то производится перстановка и сдвигаются
на один элемент назад.Составить алгоритм этой сортировки. */


import java.util.Arrays;

public class OneDimArraysSorts_6 {
    public static void main(String[] args) {
        int[] arr = {14, 3, -76, 25, 9, 11, 1, 0, 13, 17, 34};
        System.out.println("Our initial array: " + Arrays.toString(arr));

        int count = 0;
        while (count < arr.length) {
            for (int i = count; i < arr.length; i++) {
                if (arr[count] > arr[i]) {
                    int temp = arr[count];
                    arr[count] = arr[i];
                    arr[i] = temp;
                }
            }
            count++;
        }
        System.out.println("Our sorted array: " + Arrays.toString(arr));


        shellSort(arr);
        System.out.println("Our sorted array with shellSort: " + Arrays.toString(arr));
    }


    static int[] shellSort(int[] array) {
        int gap = array.length / 2;
        while (gap >= 1) {
            for (int right = 0; right < array.length; right++) {
                for (int i = right - gap; i >= 0; i -= gap) {
                    if (array[i] > array[i + gap]) {
                        int temp = array[i];
                        array[i] = array[i + gap];
                        array[i + gap] = temp;
                    }
                }
            }
            gap /= 2;
        }
        return array;
    }
}
