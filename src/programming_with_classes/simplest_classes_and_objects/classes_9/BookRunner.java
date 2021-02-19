package programming_with_classes.simplest_classes_and_objects.classes_9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BookRunner {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BookList list = new BookList();

        // Добавляем новые книги.

        list.bookList.add(new Book(1, "The Horus rising", new String[]{"Graham Mcneill"}, "PublishedHouse", 2001,
                345, 14, "Hard cover"));
        list.bookList.add(new Book(2, "JAVA from EPAM", new String[]{"I.N. Blinov,V.S. Romanchik"}, "Training Center", 2005,
                890, 100, "Hard cover"));
        list.bookList.add(new Book(3, "The Horus heresy", new String[]{"Dan Abnett"}, "PublishedHouse", 2010,
                560, 54, "Soft cover"));
        list.bookList.add(new Book(4, "Ancient Lances ", new String[]{"Dan Abnett"}, "PublishedHouse", 1999,
                124, 13, "Hard cover"));
        list.bookList.add(new Book(5, "Sanctum", new String[]{"Darius Hinks"}, "PublishedHouse", 2012,
                289, 33, "Soft cover"));

        System.out.println("Books list: ");
        list.showBooks(list.bookList);

        System.out.println("Do you want to do? \na) Show the list of author's books\n" +
                "b) Show the list of books, published by a given publisher.\n" +
                "c) Show the list of books, released after a given year.");
        System.out.println("Write your answer(a//b//c): ");
        String answer = reader.readLine();

        // Выводим список книг заданного автора.

        if (answer.equals("a")) {

            list.authorBooks(list.bookList);

            // Выводим список книг, выпущенных заданным издательством.

        } else if (answer.equals("b")) {
            list.publishingHouseBooks(list.bookList);

            // Выводим список книг, выпущенных после заданного года.

        } else if (answer.equals("c")) {
            list.booksAfterSpecificYear(list.bookList);
        }
    }
}
