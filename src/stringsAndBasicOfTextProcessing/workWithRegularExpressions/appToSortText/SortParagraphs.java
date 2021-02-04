package stringsAndBasicOfTextProcessing.workWithRegularExpressions.appToSortText;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SortParagraphs {


    void sortParByNumberOfSentence(String anyString) {

        // Ищем количество абзацев и заносим их начальные индексы в массив.

        char[] anyStringCharArray = anyString.toCharArray();
        Pattern pattern = Pattern.compile("\\s{2,}\\w");
        Matcher matcher = pattern.matcher(anyString);
        ArrayList<Integer> paragraphsIndex = new ArrayList<>();
        while (matcher.find()) {
            paragraphsIndex.add(matcher.start()+1);
        }
        System.out.println(paragraphsIndex);
        System.out.println("The char is: " + anyStringCharArray[348]);


        //Заносим абзацы в список.

        ArrayList<String> paragraphs = new ArrayList<>();    // Для абзацев
        ArrayList<Integer> amountOfSentence = new ArrayList<>();    // Для количества строк в абзацах.

        int n = 0;
        while (n < paragraphsIndex.size()) {

            // Добавляем новый абзац в список.
            if (n == paragraphsIndex.size() - 1) {
                int lengthOfNewArray2 = anyStringCharArray.length - paragraphsIndex.get(n);
                paragraphs.add(String.copyValueOf(anyStringCharArray, paragraphsIndex.get(n), lengthOfNewArray2));
            } else {
                int lengthOfNewArray = paragraphsIndex.get(n + 1) - paragraphsIndex.get(n);
                paragraphs.add(String.copyValueOf(anyStringCharArray, paragraphsIndex.get(n), lengthOfNewArray));
            }
            //Ищем количество предложений в тексте.

            Pattern pattern1 = Pattern.compile("\\w{2,}.\\.");
            Matcher matcher1 = pattern1.matcher(paragraphs.get(n));
            int count = 0;
            while (matcher1.find()) {
                count++;
            }
            amountOfSentence.add(count); // добавляем в список количество абзацев.

            // Передвигаем элементы в списке по количество предложений в них.

            for (int i = amountOfSentence.size() - 1; i > 0; i--) {
                if (amountOfSentence.get(i) > amountOfSentence.get(i - 1)) {

                    // Передвигаем количество предложений.

                    int temp = amountOfSentence.get(i);
                    amountOfSentence.add(i, amountOfSentence.get(i - 1));
                    amountOfSentence.add(i - 1, temp);
                    amountOfSentence.remove(i);
                    amountOfSentence.remove(i + 1);

                    // Передвигаем строки

                    String tempString = paragraphs.get(i);
                    paragraphs.add(i, paragraphs.get(i - 1));
                    paragraphs.add(i - 1, tempString);
                    paragraphs.remove(i);
                    paragraphs.remove(i + 1);
                }
            }
            n++;
        }

        System.out.println("Our amount of sentence in each sorted paragraph: " + amountOfSentence);
        String sortedString = "";

        // Конкатенируем в отсортированную строку.

        for (String paragraph : paragraphs) {
            sortedString += paragraph;
        }
        System.out.println("Our Sorted string: ");
        System.out.println(sortedString);
    }
}
