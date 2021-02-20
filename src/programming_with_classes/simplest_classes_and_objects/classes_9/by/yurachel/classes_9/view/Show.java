package programming_with_classes.simplest_classes_and_objects.classes_9.by.yurachel.classes_9.view;

import programming_with_classes.simplest_classes_and_objects.classes_9.by.yurachel.classes_9.entity.Book;

import java.util.List;

public class Show {

    // Список книг.

    public void showBooks(List<Book> bookList) {
        System.out.println("Our library: ");
        for (Book book : bookList) {
            System.out.println(book);
        }
    }

    // Выводим список книг заданного автора.

    public void authorBooks(List<Book> bookList, String name) {
        System.out.println(name + " books: ");
        for (Book book : bookList) {
            for (int i = 0; i < book.getAuthor().length; i++) {
                if (name.equalsIgnoreCase(book.getAuthor()[i])) {
                    System.out.println(book.getBookTitle());
                }
            }
        }
    }

    // Выводим список книг, выпущенных заданным издательством.

    public void publishingHouseBooks(List<Book> bookList, String publishingHouseName) {
        System.out.println(publishingHouseName + " was the publishing house for these books: ");
        for (Book book : bookList) {
            if (publishingHouseName.equalsIgnoreCase(book.getPublishingHouse())) {
                System.out.println(book.getBookTitle());
            }
        }
    }
    // Выводим список книг, выпущенных после заданного года.

    public void booksAfterSpecificYear(List<Book> bookList, int year) {
        System.out.println("These books was published after " + year + " year: ");
        for (Book book : bookList) {
            if (book.getPublishingYear() > year) {
                System.out.println(book.getBookTitle());
            }
        }
    }
}
