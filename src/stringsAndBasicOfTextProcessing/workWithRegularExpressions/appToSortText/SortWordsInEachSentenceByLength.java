package stringsAndBasicOfTextProcessing.workWithRegularExpressions.appToSortText;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SortWordsInEachSentenceByLength {


    void sortWords(String anyString) {
        ArrayList sortedSentences = new ArrayList<>();

        // Ищем конец предложений в строке.

        String regex = "\\w{2,}.\\.";
        char[] arr = anyString.toCharArray();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(anyString);
        ArrayList<Integer> sentenceIndex = new ArrayList<>();
        while (matcher.find()) {
            sentenceIndex.add(matcher.end());
        }

        // Передаем предложения в список.

        ArrayList<String> sentence = new ArrayList<>();
        for (int i = 0; i < sentenceIndex.size(); i++) {
            if (i == 0) {
                sentence.add(String.copyValueOf(arr, 0, sentenceIndex.get(i)));
            } else {
                int length = sentenceIndex.get(i) - sentenceIndex.get(i - 1);
                sentence.add(String.copyValueOf(arr, sentenceIndex.get(i - 1), length));
            }
        }
        if (Runner.answerSentences.equals("a")) {
            sortedSentences = sortSentencesAscending(sentence);

        } else if (Runner.answerSentences.equals("d")) {
            sortedSentences = sortSentencesDescending(sentence);
        }

        // Выводим список.

        System.out.println("Our sorted string: ");

        for (int i = 0; i < sortedSentences.size(); i++) {

            System.out.println("Our " + (i + 1) + " sentence is: " + sortedSentences.get(i));
        }
    }

    // Сортируем предложения в возрастающем порядке.

    static ArrayList sortSentencesAscending(ArrayList<String> sentence) {
        String regex2 = "\\w+\\b";
        Pattern pattern = Pattern.compile(regex2);

        ArrayList<String> sortedSentences = new ArrayList<>();
        for (int i = 0; i < sentence.size(); i++) {
            ArrayList<String> sorted = new ArrayList<>();
            Matcher matcher = pattern.matcher(sentence.get(i));
            while (matcher.find()) {
                sorted.add(matcher.group());
                if (sorted.size() > 1) {
                    for (int j = sorted.size() - 1; j > 0; j--) {
                        if (sorted.get(j).length() < sorted.get(j - 1).length()) {
                            String temp = sorted.get(j - 1);
                            sorted.set(j - 1, sorted.get(j));
                            sorted.set(j, temp);
                        }
                    }
                }
            }

            // Передаем отсортированные предложения в список.

            StringBuilder str = new StringBuilder();
            for (int q = 0; q < sorted.size(); q++) {
                if (q == sorted.size() - 1) {
                    str.append(sorted.get(q)).append(" . ");
                } else {
                    str.append(sorted.get(q)).append(" , ");
                }
            }
            sortedSentences.add(str.toString());
        }

        return sortedSentences;
    }

    // Сортируем предложения в убывающем порядке.

    static ArrayList sortSentencesDescending(ArrayList<String> sentence) {
        String regex2 = "\\w+\\b";
        Pattern pattern = Pattern.compile(regex2);

        ArrayList<String> sortedSentences = new ArrayList<>();
        for (int i = 0; i < sentence.size(); i++) {
            ArrayList<String> sorted = new ArrayList<>();
            Matcher matcher = pattern.matcher(sentence.get(i));
            while (matcher.find()) {
                sorted.add(matcher.group());
                if (sorted.size() > 1) {
                    for (int j = sorted.size() - 1; j > 0; j--) {
                        if (sorted.get(j).length() > sorted.get(j - 1).length()) {
                            String temp = sorted.get(j - 1);
                            sorted.set(j - 1, sorted.get(j));
                            sorted.set(j, temp);
                        }
                    }
                }
            }

            // Передаем отсортированные предложения в список.

            StringBuilder str = new StringBuilder();
            for (int q = 0; q < sorted.size(); q++) {
                if (q == sorted.size() - 1) {
                    str.append(sorted.get(q)).append(" . ");
                } else {
                    str.append(sorted.get(q)).append(" , ");
                }
            }
            sortedSentences.add(str.toString());
        }

        return sortedSentences;
    }
}
