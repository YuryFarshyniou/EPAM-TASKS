package stringsAndBasicOfTextProcessing.workingWithStringCharArray;

// В строке найти количество цифр.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class String_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter any string with numbers: ");
        String anyString = reader.readLine();

        System.out.println("Amount of numbers is: " + numbersCount(anyString));
    }


    // Подсчет чисел в строке.

    static int numbersCount(String anyString) {
        char[] stringArray = anyString.toCharArray();
        int count = 0;

        for (int i = 0; i < stringArray.length; i++) {
            if (Character.isDigit(stringArray[i])) {
                while (Character.isDigit(stringArray[i])) {
                    i++;
                    if (i >= stringArray.length) break;
                }
                if (i >= stringArray.length - 1) {
                    count++;
                    break;
                }

                // Обработка значений с плавающей точкой.

                if (stringArray[i] == '.' && stringArray[i + 1] != ' ' && stringArray[i + 1] != stringArray.length) {
                    i++;
                    if (Character.isDigit(stringArray[i])) {
                        while (Character.isDigit(stringArray[i])) {
                            i++;
                            if (i >= stringArray.length) break;
                        }
                    }
                }
                count++;
            }
        }
        return count;
    }
}
