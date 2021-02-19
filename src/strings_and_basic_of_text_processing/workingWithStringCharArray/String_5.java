package strings_and_basic_of_text_processing.workingWithStringCharArray;

/* Удалить в строке все лишние пробелы,то есть серии подряд идущих пробелов заменить
на одиночные пробелы.Крайние пробелы в строке удалить. */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class String_5 {


    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter any string: ");
        String anyString = reader.readLine();
        System.out.println("New String without spaces:" + String.valueOf(withoutSpaces(anyString)));
    }

    // Создаем новый массив char без пробелов для преобразования в строку.

    static char[] withoutSpaces(String anyString) {
        char[] initialString = anyString.toCharArray();
        char[] newArray = new char[initialString.length - amountOfSpaces(initialString).size()];
        int k = 0;
        int a = 0;
        for (int i = 0; i < initialString.length; i++) {
            if (a < amountOfSpaces(initialString).size()) {
                if (i == (int) amountOfSpaces(initialString).get(a)) {
                    a++;
                    continue;
                }
            }
            newArray[k] = initialString[i];
            k++;
        }
        return newArray;
    }

    // Считаем количество лишних пробелов.

    static ArrayList amountOfSpaces(char[] initialString) {
        ArrayList<Integer> indexNumber = new ArrayList<>();
        for (int i = 0; i < initialString.length; i++) {
            if (Character.isWhitespace(initialString[i])) {

                // В начале строки.

                if (i == 0 && !Character.isWhitespace(initialString[i + 1])) {
                    indexNumber.add(i);
                } else if (i == 0 && Character.isWhitespace(initialString[i + 1])) {
                    while (Character.isWhitespace(initialString[i])) {
                        indexNumber.add(i);
                        i++;
                    }
                }

                // В конце строки.

                if (i == initialString.length - 1 && Character.isWhitespace(initialString[i])) {
                    indexNumber.add(i);
                    break;
                }

                // В остальных случаях

                if (i != 0 && Character.isWhitespace(initialString[i]) && Character.isWhitespace(initialString[i + 1])
                        && i != initialString.length - 1) {
                    while (Character.isWhitespace(initialString[i])) {
                        indexNumber.add(i);
                        i++;
                        if (i == initialString.length - 1 && Character.isWhitespace(initialString[i])) {
                            indexNumber.add(i);
                            break;
                        }
                    }
                    if (!Character.isWhitespace(initialString[i])) {
                        indexNumber.remove(indexNumber.size() - 1);
                    }
                }
            }
        }
        return indexNumber;
    }
}
