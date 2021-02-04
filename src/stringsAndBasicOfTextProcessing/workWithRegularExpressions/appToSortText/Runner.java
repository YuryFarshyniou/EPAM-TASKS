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
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        SortParagraphs st = new SortParagraphs();
        System.out.println("Your initial text: \n");

        String anyString = "  The class String includes methods for examining individual characters of the sequence, for comparing strings, for searching strings," +
                "for extracting substrings, and for creating a copy of a string with all characters" +
                "\ntranslated to uppercase or to lowercase. Case mapping is based on the Unicode Standard version specified by the Character class." +
                "\n  The Java language provides special support for the string concatenation operator ( + )," + "and for conversion of other objects to strings. " +
                "String concatenation is implemented through the StringBuilder(or StringBuffer) class and" +
                "\nits append method. String conversions are implemented through the method toString,defined by Object and inherited by all classes in Java." +
                "For additional information on string concatenation and conversion," + "\nsee Gosling, Joy, and Steele, The Java Language Specification." +
                "\n  Unless otherwise. noted, passing a null argument. to a constructor or method in this class will cause a NullPointerException to be thrown."
                + "\n  A String represents a string in the UTF-16 format in which supplementary characters" +
                "are represented by surrogate pairs (see the section Unicode Character Representations in the Character class for more information)." +
                "\nIndex values refer to char code units," + "so a supplementary character uses two positions in a String." +
                "\n  The String class provides methods for dealing with Unicode code points (i.e., characters),"
                + "in addition to those for dealing with Unicode code units (i.e., char values).";

        System.out.println(anyString);
        System.out.println("\n**********************************************************\n");

        System.out.println("What do you want to do with this text? " +
                "\n1.Sort paragraphs by number of sentence." +
                "\n2.Sort words in each sentence by length." +
                "\n3.Sort lexemes in a sentence in descending order by the number of occurrences " +
                "given character.");
        System.out.println("Enter the position index: ");
        String answer = reader.readLine();
        if (answer.equals("1")) {
            st.sortParByNumberOfSentence(anyString);

        } else if (answer.equals("2")) {

        } else if (answer.equals("3")) {

        } else {
            System.out.println("Your entered wrong position. Try again.");
        }
    }
}
