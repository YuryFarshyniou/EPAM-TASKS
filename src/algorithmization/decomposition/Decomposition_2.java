package algorithmization.decomposition;

// Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Decomposition_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the amount of numbers: ");
        int amountOfNumbers = Integer.parseInt(reader.readLine());
        int[] array = new int[amountOfNumbers];
        System.out.println("Enter your numbers: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        System.out.print("Our numbers: ");
        showArray(array);
        System.out.println("The NOD is: " + nod(array));

    }
    // Выводит наши числа

    static void showArray(int[] array) {
        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println("");
    }

    //Ищем НОД

    static int nod(int[] array) {
        int nod = 0;
        int count = 1;
        int max = array[0];
        for (int number : array) {
            if (number > max) max = number;
        }

        while (count <= max) {
            int counter = 0;
            for (int number : array) {
                if (number % count == 0) counter++;
            }
            if (counter == array.length) nod = count;
            count++;
        }
        return nod;
    }
}
