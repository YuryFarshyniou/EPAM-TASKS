package strings_and_basic_of_text_processing.workingWithStringCharArray;

// В строке найти количество цифр.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter any string with digits: ");
        String anyString = reader.readLine();
        char[] ourString = anyString.toCharArray();
        int count = 0;
        for (int i = 0; i < ourString.length; i++) {
            if (Character.isDigit(ourString[i])) count++;
        }
        System.out.println("Number of digits is: " + count);
    }
}
