package programmingWithClasses.simplestCLassesAndObjects.Classes_9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BookList {
    ArrayList<Book> bookList = new ArrayList<>();
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    // Список книг.

    void showBooks(ArrayList<Book> bookList) {
        for (Book book : bookList) {
            System.out.println(book);
        }
    }

    // Выводим список книг заданного автора.

    void authorBooks(ArrayList<Book> bookList) throws IOException {
        System.out.println("Enter the author's name: ");
        String name = reader.readLine();
        for (Book book : bookList) {
            for (int i = 0; i < book.getAuthor().length; i++) {
                if (name.equalsIgnoreCase(book.getAuthor()[i])) {
                    System.out.println(book.getBookTitle());
                }
            }
        }
    }

    // Выводим список книг, выпущенных заданным издательством.

    void publishingHouseBooks(ArrayList<Book> bookList) throws IOException {
        System.out.println("Enter the publishing house's name: ");
        String publishingHouseName = reader.readLine();
        for (Book book : bookList) {
            if (publishingHouseName.equalsIgnoreCase(book.getPublishingHouse())) {
                System.out.println(book.getBookTitle());
            }
        }
    }

    // Выводим список книг, выпущенных после заданного года.

    void booksAfterSpecificYear(ArrayList<Book> bookList) throws IOException {
        System.out.println("Enter a specific year: ");
        int year = Integer.parseInt(reader.readLine());
        for (Book book : bookList) {
            if (book.getPublishingYear() > year) {
                System.out.println(book.getBookTitle());
            }
        }
    }


}
