package stringsAndBasicOfTextProcessing.workWithRegularExpressions.appToSortText;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SortParagraphsDesc {


    void sortParByNumberOfSentence(String anyString) {

        // Ищем количество абзацев и заносим их начальные индексы в массив.

        char[] anyStringCharArray = anyString.toCharArray();
        Pattern pattern = Pattern.compile("\\s{2,}\\w");
        Matcher matcher = pattern.matcher(anyString);
        ArrayList<Integer> paragraphsIndex = new ArrayList<>();
        while (matcher.find()) {
            paragraphsIndex.add(matcher.start());
        }

        //Заносим абзацы в список.

        ArrayList<String> paragraphs = new ArrayList<>();    // Для абзацев
        ArrayList<Integer> amountOfSentence = new ArrayList<>();    // Для количества предложений в абзацах.

        // Добавляем новый абзац в список.
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
            if (Runner.answerParagraphs.equals("d")) {
                ascendingSort(amountOfSentence, paragraphs);

            } else if (Runner.answerParagraphs.equals("a")) {
                descendingSort(amountOfSentence, paragraphs);
            }
            n++;
        }

        System.out.println("Our amount of sentence in each sorted paragraph: " + amountOfSentence);

        // Конкатенируем в отсортированную строку.

        StringBuilder stringBuilder = new StringBuilder();
        for (String paragraph : paragraphs) {
            stringBuilder.append(paragraph);
        }
        System.out.print("Our Sorted string: ");
        System.out.println(stringBuilder);

    }

    // Передвигаем элементы в списке по количество предложений в них.

    static void ascendingSort(ArrayList<Integer> amountOfSentence, ArrayList<String> paragraphs) {
        for (int i = amountOfSentence.size() - 1; i > 0; i--) {
            if (amountOfSentence.get(i) > amountOfSentence.get(i - 1)) {

                // Передвигаем количество предложений.

                amountOfSentence.add(i - 1, amountOfSentence.get(i));
                amountOfSentence.remove(i + 1);

                // Передвигаем строки

                String temp = paragraphs.get(i - 1);
                paragraphs.set(i - 1, paragraphs.get(i));
                paragraphs.set(i, temp);
            }
        }
    }

    static void descendingSort(ArrayList<Integer> amountOfSentence, ArrayList<String> paragraphs) {
        for (int i = amountOfSentence.size() - 1; i > 0; i--) {
            if (amountOfSentence.get(i) < amountOfSentence.get(i - 1)) {

                // Передвигаем количество предложений.

                amountOfSentence.add(i - 1, amountOfSentence.get(i));
                amountOfSentence.remove(i + 1);

                // Передвигаем строки

                String temp = paragraphs.get(i - 1);
                paragraphs.set(i - 1, paragraphs.get(i));
                paragraphs.set(i, temp);
            }
        }
    }
}
