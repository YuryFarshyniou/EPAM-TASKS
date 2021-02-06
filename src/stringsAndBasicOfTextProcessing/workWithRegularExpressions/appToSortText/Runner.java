package stringsAndBasicOfTextProcessing.workWithRegularExpressions.appToSortText;

/* Создать приложение,разбирающее текст(текст храниться в строке)
и позволяющее выполнять с текстом три различных операции: отсортировать
абзацы по количеству предложений; в каждом предложении отсортировать слова
по длине; отсортировать лексемы в предложении по убыванию количества вхождений
заданного символа,а в случае равенства по алфавиту.*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {
    static String answerParagraphs;
    static String answerSentences;
    static String answerLexemes;
    static String answerAlphabet;
    static String charact;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        SortParagraphsDesc st = new SortParagraphsDesc();
        SortWordsInEachSentenceByLength sb = new SortWordsInEachSentenceByLength();
        SortLexemesInaSentence sls = new SortLexemesInaSentence();
        System.out.print("Your initial text: ");

        String anyString = "\n  The class String includes methods for examining individual characters of the sequence, for comparing strings, for searching strings," +
                "for extracting substrings, and for creating a copy of a string with all characters" +
                "\ntranslated to uppercase or to lowercase. Case mapping is based on the Unicode Standard version specified by the Character class.\n" +
                "  The Java language provides special support for the string concatenation operator ( + )," + "and for conversion of other objects to strings. " +
                "String concatenation is implemented through the StringBuilder(or StringBuffer) class and" +
                "\nits append method. String conversions are implemented through the method toString,defined by Object and inherited by all classes in Java." +
                "For additional information on string concatenation and conversion," + "\nsee Gosling, Joy, and Steele, The Java Language Specification.\n" +
                "  Unless otherwise noted, passing a null argument to a constructor or method in this class will cause a NullPointerException to be thrown.\n"
                + "  A String represents a string in the UTF-16 format in which supplementary characters" +
                "are represented by surrogate pairs (see the section Unicode Character Representations in the Character class for more information)." +
                "\nIndex values refer to char code units," + "so a supplementary character uses two positions in a String.\n" +
                "  The String class provides methods for dealing with Unicode code points (i.e., characters),"
                + "in addition to those for dealing with Unicode code units (i.e., char values).";

        System.out.println(anyString);
        System.out.println("\n**********************************************************\n");

        System.out.println("What do you want to do with this text? " +
                "\n1.Sort paragraphs by number of sentence." +
                "\n2.Sort words in each sentence by length." +
                "\n3.Sort lexemes in a sentence in descending order by the number of occurrences " +
                "given character.");

        System.out.println("\n**********************************************************\n");
        System.out.println("Enter the position index: ");
        String answer = reader.readLine();

        switch (answer) {

            case "1":
                System.out.println("Do you want sort in ascending or descending order?(a/d)");
                answerParagraphs = reader.readLine();

                if (answerParagraphs.equals("a")) {
                    st.sortParByNumberOfSentence(anyString);

                } else if (answerParagraphs.equals("d")) {
                    st.sortParByNumberOfSentence(anyString);

                } else {
                    System.out.println("You wrote wrong index. Try again.");
                }

                break;


            case "2":

                System.out.println("Do you want sort sentences in ascending or descending order?(a/d)");
                answerSentences = reader.readLine();

                if (answerSentences.equals("a")) {

                    sb.sortWords(anyString);

                } else if (answerSentences.equals("d")) {
                    sb.sortWords(anyString);
                } else {
                    System.out.println("You wrote wrong index. Try again.");
                }
                break;


            case "3":

                System.out.println("Do you want sort lexemes in a sentence in Alphabet sort or " +
                        "sort lexemes in a sentence in descending order by the number of occurrences?(al/n)");
                answerLexemes = reader.readLine();

                if(answerLexemes.equals("al")){
                    System.out.println("Do you want sort in ascending or descending order?(a/d)");
                    answerAlphabet = reader.readLine();

                    if (answerAlphabet.equals("a")) {
                        sls.sortLexemes(anyString,charact);

                    } else if (answerAlphabet.equals("d")) {
                        sls.sortLexemes(anyString,charact);

                    } else {
                        System.out.println("You wrote wrong index. Try again.");
                    }
                    sls.sortLexemes(anyString,charact);

                }else if(answerLexemes.equals("n")){

                    System.out.println("Enter your character: ");
                    charact = reader.readLine();
                    sls.sortLexemes(anyString,charact);

                }else{
                    System.out.println("You wrote wrong index. Try again.");
                }
                break;

            default:
                System.out.println("Your entered wrong position. Try again.");
                break;
        }
    }
}
