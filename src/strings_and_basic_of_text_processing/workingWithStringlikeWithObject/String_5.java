package strings_and_basic_of_text_processing.workingWithStringlikeWithObject;

/* Подсчитать, сколько раз среди символов заданной строки встречается буква "а". */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter any string with 'a' letter: ");
        String initialString = reader.readLine();
        char[] arr = initialString.toCharArray();
        int count = 0;
        for (char s : arr) {
            if (s == 'a') count++;
        }
        System.out.println("The amount of a in this string is: " + count);
    }
}
