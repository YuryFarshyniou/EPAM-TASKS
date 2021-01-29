package algorithmization.oneDimensionalArrays;

/* Задана последовательность N вещественных чисел.
Вычислить сумму чисел,порядковые номера которых являются простыми числами.*/

import java.util.Arrays;
import java.util.Random;

public class One_Dimensional_Arrays_6 {
    public static void main(String[] args) {
        Random rand = new Random();
        double[] array = new double[rand.nextInt(10) + 2];

        // Заполняем массив и находим сумму.

        double sum = 0.0;
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            array[i] = rand.nextDouble() * 30;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) count++;
            }
            if (count == 1) sum += array[i];
        }
        System.out.println("Our array: " + Arrays.toString(array));
        System.out.println("Sum is: " + sum);
    }
}
