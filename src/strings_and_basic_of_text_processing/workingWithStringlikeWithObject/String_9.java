package strings_and_basic_of_text_processing.workingWithStringlikeWithObject;

/* Посчитать количество строчных(маленьких) и прописных(больших)
в веденной строке.Учитывать только английские буквы.*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class String_9 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter any string: ");
        String anyString = reader.readLine();
        String regex = "[A-Z]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(anyString);
        int countUpperCase = 0;
        while (matcher.find()) {
            countUpperCase++;
        }
        System.out.println("The amount of UpperCases: " + countUpperCase);

        String regex2 = "[a-z]";
         pattern = Pattern.compile(regex2);
         matcher = pattern.matcher(anyString);
        int countLowerCases = 0;
        while (matcher.find()) {
            countLowerCases++;
        }
        System.out.println("The amount of LowerCases: " + countLowerCases);
    }
}
