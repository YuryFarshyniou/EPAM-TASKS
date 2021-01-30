package algorithmization.oneDimensionalArrays;

/* Дан целочисленный массив с количеством элементов n.Сжать массив,выбросив из него каждый второй элемент
(освободившийся элемент заполнить нулями)Примечание: Дополнительный массив не использовать. */


import java.util.Arrays;
import java.util.Random;

public class One_Dimensional_Arrays_10 {
    public static void main(String[] args) {

        // Заполняем массив.

        Random rand = new Random();
        int[] arr = new int[rand.nextInt(9) + 2];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(30) + 1;
        }
        System.out.println("Our initial array: " + Arrays.toString(arr));

        // Заполняем нулями.

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                arr[i] = 0;
            }
        }
        System.out.println("Our array with 0: " + Arrays.toString(arr));

        // Сжимаем массив.

        boolean need = true;
        while (need) {
            need = false;
            for (int i = arr.length-2; i >= 0; i--) {
                if (arr[i] < arr[i + 1] && arr[i] == 0) {
                    int tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    need = true;
                }
            }
        }
        System.out.println("Our final array: " + Arrays.toString(arr));
    }
}
