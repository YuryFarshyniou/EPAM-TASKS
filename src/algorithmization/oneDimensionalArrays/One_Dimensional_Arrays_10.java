package algorithmization.oneDimensionalArrays;
/* Дан целочисленный массив с количеством элементов n.Сжать массив,выбросив из него каждый второй элемент
(освоьодившийся элемент заполнить нулями)Примечание: Дополнительный массив не использовать. */

import java.io.*;
import java.util.*;

public class One_Dimensional_Arrays_10 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        for (int i = 0; i < arr.length; i++) {
            int num = Integer.parseInt(reader.readLine());
            arr[i] = num;
        }
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
        boolean need = true;
        while (need) {
            need = false;
            for (int i = 7; i >= 0; i--) {
                if (arr[i] < arr[i + 1] && arr[i] == 0) {
                    int tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    need = true;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
