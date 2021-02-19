package strings_and_basic_of_text_processing.workingWithStringlikeWithObject;

/* Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы.
Например,если было введено "abc cde def", то должно быть выведено "abcdef". */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String_7 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter any string: ");
        String anyString = reader.readLine();
        String regex = "(\\s+)";
        String s = anyString.replaceAll(regex, "");

        char[] arr = s.toCharArray();
        StringBuilder stringBuilder = new StringBuilder(s);

        // Удаляем повторяющиеся символы.

        for (char i : arr) {
            int count = 0;
            int k = 0;
            for (int j = 0; j < stringBuilder.length(); j++) {
                if (i == stringBuilder.charAt(j)) {
                    k = j;
                    count++;
                }
            }
            if (count > 1) {
                stringBuilder.deleteCharAt(k);
            }
        }
        System.out.println("Our final string: " + stringBuilder);
        System.out.println("Our initial string: " + s);
    }
}
