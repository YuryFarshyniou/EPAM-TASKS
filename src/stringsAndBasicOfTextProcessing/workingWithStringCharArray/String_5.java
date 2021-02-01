package stringsAndBasicOfTextProcessing.workingWithStringCharArray;

/* Удалить в строке все лишние пробелы,то есть серии подряд идущих пробелов заменить
на одиночные пробелы.Крайние пробелы в строке удалить. */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter any string: ");
        String anyString = reader.readLine();
        System.out.println(withoutSpaces(anyString));
    }


    static String withoutSpaces(String anyString) {
        char[] initialString = anyString.toCharArray();

        for (int i = 0; i < initialString.length; i++) {
            if (Character.isWhitespace(initialString[i])) ;

        }

    }
}
