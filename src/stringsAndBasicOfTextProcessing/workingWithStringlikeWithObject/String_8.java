package stringsAndBasicOfTextProcessing.workingWithStringlikeWithObject;

/* Вводится строка слов,разделенных пробелами.Найти самое длинное слово и
вывести его на экран. Случай, когда самых длинных слов может быть несколько,
не обрабатывать. */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class String_8 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the string: ");
        String anyString = reader.readLine();
        String regex = "\\w+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(anyString);
        int length = 0;
        int countWords = 0;
        String random = "";

        while (matcher.find()) {
            if (matcher.group().length() > length) {
                random = matcher.group();
                length = matcher.group().length();
                countWords = 0;
            } else if (matcher.group().length() == length) countWords++;
        }

        System.out.println((countWords > 0) ? "There are several longest words in this string"
                : "The longest word is: " + random);
    }
}
