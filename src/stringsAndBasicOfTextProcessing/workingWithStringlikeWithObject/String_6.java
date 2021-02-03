package stringsAndBasicOfTextProcessing.workingWithStringlikeWithObject;

// Из заданной строки получить новую, повторив каждый символ дважды.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String_6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter any string: ");
        String someString = reader.readLine();
        char[] arr = someString.toCharArray();
        StringBuilder stringBuilder = new StringBuilder(someString);
        int count = 1;
        for (char i : arr) {
            stringBuilder.insert(count, i);
            count += 2;
        }
        System.out.println("Our changed string: " + stringBuilder);
    }
}
