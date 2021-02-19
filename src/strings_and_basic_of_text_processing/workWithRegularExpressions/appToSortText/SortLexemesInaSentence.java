package strings_and_basic_of_text_processing.workWithRegularExpressions.appToSortText;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SortLexemesInaSentence {
    ArrayList<String> sortedSentences;

    void sortLexemes(String anyString, String charact) {

        // Ищем конец предложений в строке.

        String regex = "\\w{2,}.[.?!]";
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

        // Выбираем либо в алфавитном порядке, либо по количеству совпадений.

        if (Runner.answerLexemes.equals("n")) {

            sortedSentences = sortLex(charact, sentence);
        } else if (Runner.answerLexemes.equals("al")) {
            sortedSentences = alphabetSort(sentence);
        }


        for (int r = 0; r < sortedSentences.size(); r++) {
            if (sortedSentences.get(r).isEmpty()) {
                System.out.println("This character is undefined in " + (r + 1) + " sentence.");

            } else {
                System.out.println("Our " + (r + 1) + " sentence is: " + sortedSentences.get(r));
            }
        }

    }

    // Сортируем лексемы по количеству вхождений символа.

    static ArrayList sortLex(String charact, ArrayList<String> sentence) {

        // Ищем количество лексем с вхождениями

        ArrayList<String> sortedSentences = new ArrayList<>();

        String searchingLexemes = "\\w*" + "[" + charact.toLowerCase() + charact.toUpperCase() + "]" + "\\w*";
        Pattern pattern1 = Pattern.compile(searchingLexemes);


        for (int i = 0; i < sentence.size(); i++) {
            Matcher matcher1 = pattern1.matcher(sentence.get(i));
            ArrayList<String> wordsWithLex = new ArrayList<>();
            ArrayList<Integer> amountOfEntry = new ArrayList<>();
            while (matcher1.find()) {
                wordsWithLex.add(matcher1.group());

                // Ищем количество вхождений в лексемах

                int count = 0;
                String regex2 = "[" + charact.toLowerCase() + charact.toUpperCase() + "]";
                Pattern pattern2 = Pattern.compile(regex2);
                Matcher matcher2 = pattern2.matcher(matcher1.group());
                while (matcher2.find()) {
                    count++;
                }
                amountOfEntry.add(count);

                // Сортируем по убыванию.

                if (wordsWithLex.size() > 1) {
                    for (int k = wordsWithLex.size() - 1; k > 0; k--) {
                        if (amountOfEntry.get(k) > amountOfEntry.get(k - 1)) {
                            int temp = amountOfEntry.get(k - 1);
                            amountOfEntry.set(k - 1, amountOfEntry.get(k));
                            amountOfEntry.set(k, temp);

                            String tempStr = wordsWithLex.get(k - 1);
                            wordsWithLex.set(k - 1, wordsWithLex.get(k));
                            wordsWithLex.set(k, tempStr);
                        }
                    }
                }
            }

            // Добвляем отсортированные строки в общий список.

            StringBuilder stringBuilder = new StringBuilder();
            for (int q = 0; q < wordsWithLex.size(); q++) {
                if (q == wordsWithLex.size() - 1) {
                    stringBuilder.append(wordsWithLex.get(q)).append(" . ");
                } else {
                    stringBuilder.append(wordsWithLex.get(q)).append(" , ");
                }
            }
            sortedSentences.add(stringBuilder.toString());
        }
        return sortedSentences;
    }


    // Сортируем в алфавитном порядке.

    static ArrayList alphabetSort(ArrayList<String> sentence) {
        ArrayList<String> sortedSentences = new ArrayList<>();
        String regex = "\\w+\\b";
        Pattern pattern = Pattern.compile(regex);
        for (int i = 0; i < sentence.size(); i++) {

            Matcher matcher = pattern.matcher(sentence.get(i));
            ArrayList<Integer> charIndex = new ArrayList<>();
            ArrayList<String> sortSentence = new ArrayList<>();
            while (matcher.find()) {
                int ch = matcher.group().toLowerCase().charAt(0);
                if (ch < 97) {
                    continue;
                }
                charIndex.add(ch);
                sortSentence.add(matcher.group());

                //Сортировка по возрастанию.

                if (charIndex.size() > 1) {
                    if (Runner.answerAlphabet.equals("a")) {
                        ascendingSortAlphabet(sortSentence, charIndex);
                    } else if (Runner.answerAlphabet.equals("d")) {
                        descendingSortAlphabet(sortSentence, charIndex);
                    }
                }
            }
            StringBuilder stringBuilder = new StringBuilder();

            // Передаем строку в финальный список.

            for (String s : sortSentence) {
                stringBuilder.append(s).append(" ");
            }
            sortedSentences.add(stringBuilder.toString());
        }
        return sortedSentences;
    }

    // Сортировка в возврастающем порядке.

    static void ascendingSortAlphabet(ArrayList<String> sortSentence, ArrayList<Integer> charIndex) {
        for (int j = charIndex.size() - 1; j > 0; j--) {
            if (charIndex.get(j) < charIndex.get(j - 1)) {
                int temp = charIndex.get(j - 1);
                charIndex.set(j - 1, charIndex.get(j));
                charIndex.set(j, temp);

                String tempStr = sortSentence.get(j - 1);
                sortSentence.set(j - 1, sortSentence.get(j));
                sortSentence.set(j, tempStr);
            }
        }
    }

    // Сортировка в убывающем порядке.

    static void descendingSortAlphabet(ArrayList<String> sortSentence, ArrayList<Integer> charIndex) {
        for (int j = charIndex.size() - 1; j > 0; j--) {
            if (charIndex.get(j) > charIndex.get(j - 1)) {
                int temp = charIndex.get(j - 1);
                charIndex.set(j - 1, charIndex.get(j));
                charIndex.set(j, temp);

                String tempStr = sortSentence.get(j - 1);
                sortSentence.set(j - 1, sortSentence.get(j));
                sortSentence.set(j, tempStr);
            }
        }
    }
}
