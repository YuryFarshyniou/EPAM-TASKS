package stringsAndBasicOfTextProcessing.workingWithStringlikeWithObject;

/* Дан текст(строка). Найдите наибольшее количетсво
подряд идущих пробелов в нем. */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader((new InputStreamReader(System.in)));
        System.out.println("Enter any string: ");
        String s = reader.readLine();
        countSpaces(s);
    }

    // Находим наибольшее количество пробелов идущих подряд.

    static void countSpaces(String s) {
        char[] str = s.toCharArray();
        int max = 0;
        int firstIndex = 0;
        int lastIndex = 0;
        for (int i = 0; i < str.length; i++) {
            int count = 0;
            if (Character.isWhitespace(str[i])) {
                int currentFirstIndex = i;
                while (Character.isWhitespace(str[i])) {
                    count++;
                    i++;
                    if(i==str.length)break;
                }
                int currentLastIndex = i;
                if (max < count) {
                    max = count;
                    firstIndex = currentFirstIndex;
                    lastIndex = currentLastIndex;
                }
            }
        }
        System.out.println("The largest amount of spaces is between " +
                firstIndex + " index and " + lastIndex + ":\n Its equals "
                + max + " spaces.");
    }
}
