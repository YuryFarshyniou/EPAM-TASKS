package stringsAndBasicOfTextProcessing.workWithRegularExpressions.appToSortText;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SortWordsInEachSentenceByLength {

    void sortWords(String anyString) {

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


        for (int i = 0; i < sentence.size(); i++) {
            System.out.println("The sentence number" + i + " is : " + sentence.get(i));
        }

        // Сортируем предложения.

        String regex2 = "\\w+\\b";
        pattern = Pattern.compile(regex2);

        ArrayList<String> sortedSentences = new ArrayList<>();
        for (int i = 0; i < sentence.size(); i++) {
            ArrayList<String> sorted = new ArrayList<>();
            matcher = pattern.matcher(sentence.get(i));
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
            StringBuilder str = new StringBuilder();
            for (String s : sorted) {
                str.append(s);
            }
            sortedSentences.add(str.toString());


        }
        System.out.println("Our sorted string: ");
//        StringBuilder stringBuilder = new StringBuilder("");
        for (String s : sortedSentences) {
            System.out.println(s);
        }

    }
}
