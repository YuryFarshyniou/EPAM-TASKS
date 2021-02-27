package tasks_6.part_1.by.yurachel.part_1.entity.library;

import java.util.List;
import java.util.Objects;

public class Book {
    private final String bookName;
    private String type;
    private List<Author> authors;
    private final Genre genre;
    private int price;
    private final int numberOfPages;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public String getBookName() {
        return bookName;
    }

    public Genre getGenre() {
        return genre;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public Book(String bookName, String type, List<Author> authors, Genre genre, int price, int numberOfPages) {
        this.bookName = bookName;
        this.type = type;
        this.authors = authors;
        this.genre = genre;
        this.price = price;
        this.numberOfPages = numberOfPages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return price == book.price && numberOfPages == book.numberOfPages &&
                Objects.equals(bookName, book.bookName) && Objects.equals(authors, book.authors) && Objects.equals(genre, book.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, authors, genre, price, numberOfPages);
    }

    @Override
    public String toString() {


        return "Book's information. " + "BookName: " + bookName + ". Authors: " + authors + ". "
                + genre + ". Price: " + price + "$. NumberOfPages: " + numberOfPages;


    }
}
