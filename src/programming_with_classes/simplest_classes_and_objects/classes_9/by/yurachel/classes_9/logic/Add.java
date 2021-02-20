package programming_with_classes.simplest_classes_and_objects.classes_9.by.yurachel.classes_9.logic;

import programming_with_classes.simplest_classes_and_objects.classes_9.by.yurachel.classes_9.entity.Book;

import java.util.List;

public class Add {

    public void addBook(List<Book> library, int id, String bookTitle, String[] author,
                        String publishingHouse, int publishingYear, int numberOfPages, int price, String bindingType) {
        library.add(new Book(id, bookTitle, author, publishingHouse, publishingYear, numberOfPages, price, bindingType));

    }
}
