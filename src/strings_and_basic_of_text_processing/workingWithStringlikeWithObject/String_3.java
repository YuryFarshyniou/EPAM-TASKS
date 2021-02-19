package strings_and_basic_of_text_processing.workingWithStringlikeWithObject;

// Проверить,является ли заданное слово палиндромом.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter any string: ");
        String palindrome = reader.readLine();

        // Избавляемся от всех пробелов и различных знаков.

        String regex = "[\\s+|\\W+]";
        String strAfterReplaces= palindrome.replaceAll(regex, "");

        StringBuilder stringBuilder = new StringBuilder(strAfterReplaces);

        // Переворачиваем строку для сравнения символов.

        stringBuilder.reverse();


        // Сравниваем символы.

        boolean isPalindrome = strAfterReplaces.equalsIgnoreCase(stringBuilder.toString());
        System.out.println((isPalindrome) ? "The string is palindrome" : "The string is not palindrome");
    }
}
