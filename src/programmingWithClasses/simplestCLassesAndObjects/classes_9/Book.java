package programmingWithClasses.simplestCLassesAndObjects.classes_9;

/* Создать класс Book, специфицация которого приведена ниже. ОПределить конструкторы,
set-,get- методы и метод toString(). Создать второй класс, агрегирующий массив типа Book с
подходящими конструкторами и методами. Задать критерии выбора данных и вывести эти данные на консоль.
Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
Найти и вывести:
а) список книг заданного автора.
б) список книг, выпущенных заданным издательством.
с) список книг,выпущенных после заданного года. */

import java.util.Arrays;

public class Book {
    private int id;
    private String bookTitle;
    private String[] author;
    private String publishingHouse;
    private int publishingYear;
    private int numberOfPages;
    private int price;
    private String bindingType;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String[] getAuthor() {
        return author;
    }

    public void setAuthor(String[] author) {
        this.author = author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
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

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
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

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookTitle='" + bookTitle + '\'' +
                ", author=" + Arrays.toString(author) +
                ", publishingHouse='" + publishingHouse + '\'' +
                ", publishingYear=" + publishingYear +
                ", numberOfPages=" + numberOfPages +
                ", price=" + price +
                ", bindingType='" + bindingType + '\'' +
                '}';
    }
}
