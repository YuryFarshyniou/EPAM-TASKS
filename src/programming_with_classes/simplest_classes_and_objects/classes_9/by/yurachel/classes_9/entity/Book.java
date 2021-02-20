package programming_with_classes.simplest_classes_and_objects.classes_9.by.yurachel.classes_9.entity;

import java.util.Arrays;
import java.util.Objects;

public class Book {
    private int id;
    private final String bookTitle;
    private final String[] author;
    private final String publishingHouse;
    private final int publishingYear;
    private final int numberOfPages;
    private int price;
    private final String bindingType;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String[] getAuthor() {
        return author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBindingType() {
        return bindingType;
    }


    public Book(int id, String bookTitle, String[] author, String publishingHouse, int publishingYear, int numberOfPages, int price, String bindingType) {
        this.id = id;
        this.bookTitle = bookTitle;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.publishingYear = publishingYear;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.bindingType = bindingType;
    }


    public String toString() {
        return "Book's information." + " id: " + id + ", bookTitle: " + bookTitle +
                ", author = " + Arrays.toString(author) + ", publishingHouse: " + publishingHouse +
                ", publishingYear: " + publishingYear + ", numberOfPages: " + numberOfPages +
                ", price: " + price + ", bindingType: " + bindingType;
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id && publishingYear == book.publishingYear && numberOfPages == book.numberOfPages &&
                price == book.price && Objects.equals(bookTitle, book.bookTitle) && Arrays.equals(author, book.author) &&
                Objects.equals(publishingHouse, book.publishingHouse) && Objects.equals(bindingType, book.bindingType);
    }


    public int hashCode() {
        int result = Objects.hash(id, bookTitle, publishingHouse, publishingYear, numberOfPages, price, bindingType);
        result = 31 * result + Arrays.hashCode(author);
        return result;
    }
}
