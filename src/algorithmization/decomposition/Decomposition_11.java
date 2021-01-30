package algorithmization.decomposition;

/* Написать метод(методы),определяющий,в каком из данных двух чисел
больше цифр. */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Decomposition_11 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the first number: ");
        double firstNumber = Double.parseDouble(reader.readLine());
        System.out.println("Enter the second number: ");
        double secondNumber = Double.parseDouble(reader.readLine());

        if (amountOfDigits(firstNumber) > amountOfDigits(secondNumber)) {
            System.out.println("The amount of digits of " + firstNumber + " is the largest");
        } else if (amountOfDigits(firstNumber) < amountOfDigits(secondNumber)) {
            System.out.println("The amount of digits of " + secondNumber + " is the largest");
        } else {
            System.out.println("The amount of digits are equals");
        }
    }

    // Определяем количество цифр

    static int amountOfDigits(double number) {
        String num = Double.toString(number);
        char[] array = num.toCharArray();
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == '.' || array[i] == '-') {
                continue;
            } else if (i == array.length - 1 && (array[array.length - 1] == '0')) {
                count--;
            }
            count++;
        }
        return count;
    }
}
