package strings_and_basic_of_text_processing.workingWithStringCharArray;

// Замените в строке все вхождения 'word' на 'letter'.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter any string with a word \"word\": ");
        String anyString = reader.readLine();

//        String regex = "word";
//        String st = anyString.replaceAll(regex, "letter");
//        System.out.println(st);

        char[] arr = anyString.toCharArray();
        String initialString = "word";
        String finalString = "letter";
        int differenceLength = finalString.length() - initialString.length();

        // Определяем колличество вхождений 'word'.

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'w' && arr[i + 3] == 'd') count++;
        }
        char[] letter = finalString.toCharArray();

        // Заполняем дополнительный массив.

        char[] arr2 = new char[arr.length + count * differenceLength];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        char[] arr3 = new char[arr.length + count * differenceLength];
        replaceWord(arr, arr2, arr3, letter);
        anyString = String.valueOf(arr2);
        System.out.println("Our string with replacements: " + anyString);
    }

    // Заменяем строки.

    static char[] replaceWord(char[] arr, char[] arr2, char[] arr3, char[] letter) {
        for (int i = 0; i < arr.length; i++) {
            if (arr2[i] == 'w' && arr2[i + 3] == 'd') {
                int k = i;
                while (k < arr2.length) {
                    arr3[k] = arr2[k];
                    k++;
                }
                k = i;
                int c = 0;
                while (k <= k + 6 && c < letter.length) {
                    arr2[k] = letter[c];
                    c++;
                    k++;
                }
                while (k < arr2.length) {
                    arr2[k] = arr3[k - 2];
                    k++;
                }
            }
        }
        return arr2;
    }
}
