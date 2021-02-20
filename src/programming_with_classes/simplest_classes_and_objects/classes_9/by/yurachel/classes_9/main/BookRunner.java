package programming_with_classes.simplest_classes_and_objects.classes_9.by.yurachel.classes_9.main;

import programming_with_classes.simplest_classes_and_objects.classes_9.by.yurachel.classes_9.entity.Library;
import programming_with_classes.simplest_classes_and_objects.classes_9.by.yurachel.classes_9.logic.Add;
import programming_with_classes.simplest_classes_and_objects.classes_9.by.yurachel.classes_9.view.Show;

import java.io.IOException;

public class BookRunner {
    public static void main(String[] args) throws IOException {

        Library list = new Library();
        Add add = new Add();
        Show show = new Show();

        // Добавляем новые книги.

        add.addBook(list.getBookList(),
                1, "The Horus rising", new String[]{"Graham Mcneill"}, "SomePublishedHouse", 2001,
                345, 14, "Hard cover");
        add.addBook(list.getBookList(),
                2, "JAVA from EPAM", new String[]{"I.N. Blinov,V.S. Romanchik"}, "Training Center", 2005,
                890, 100, "Hard cover");
        add.addBook(list.getBookList(),
                3, "The Horus heresy", new String[]{"Dan Abnett"}, "SomePublishedHouse", 2010,
                560, 54, "Soft cover");
        add.addBook(list.getBookList(),
                4, "Ancient Lances ", new String[]{"Dan Abnett"}, "SomePublishedHouse", 1999,
                124, 13, "Hard cover");
        add.addBook(list.getBookList(),
                5, "Sanctum", new String[]{"Darius Hinks"}, "SomePublishedHouse", 2012,
                289, 33, "Soft cover");


//        show.showBooks(list.getBookList());

//        show.authorBooks(list.getBookList(), "Dan Abnett");
//        show.publishingHouseBooks(list.getBookList(), "SomePublishedHouse");

        show.booksAfterSpecificYear(list.getBookList(), 2004);


    }
}
