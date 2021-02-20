package programming_with_classes.simplest_classes_and_objects.classes_9.by.yurachel.classes_9.entity;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> bookList;

    {
        bookList = new ArrayList<>();
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }


}
