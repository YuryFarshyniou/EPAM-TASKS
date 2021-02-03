package stringsAndBasicOfTextProcessing.workingWithStringlikeWithObject;

/* Строка Х состоит из нескольких предложений,каждое из которых
кончается точкой,восклицательным или вопросительным знаком.Определить
количество предложений в строке. */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class String_10 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter any string: ");
        String anyString = reader.readLine();
        String regex = "\\w+\\s?(\\.|\\!|\\?)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(anyString);
        int countSentence = 0;
        while(matcher.find()){
            countSentence++;
        }
        System.out.println(countSentence);
    }
}
