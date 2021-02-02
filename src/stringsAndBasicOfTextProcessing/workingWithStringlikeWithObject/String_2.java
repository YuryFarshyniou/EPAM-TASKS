package stringsAndBasicOfTextProcessing.workingWithStringlikeWithObject;

// В строке вставить после каждого символа 'a' символ 'b'.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter any string with \"a\" letter: ");
        String s = reader.readLine();
        StringBuilder stringBuilder = new StringBuilder(s);

        // Пробегаем по строке.Если есть буква а,добавляем за ней букву б.

        char[] arr = s.toCharArray();
        int count = 0;
        int k = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'a') {
                count = i + k;
                stringBuilder.insert(count, 'b');
                k++;
            }
        }
        System.out.println("Our string with 'b' character: " + stringBuilder);
    }
}
