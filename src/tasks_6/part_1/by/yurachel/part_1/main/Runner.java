package tasks_6.part_1.by.yurachel.part_1.main;

import tasks_6.part_1.by.yurachel.part_1.entity.library.Author;
import tasks_6.part_1.by.yurachel.part_1.entity.library.Book;
import tasks_6.part_1.by.yurachel.part_1.entity.library.Genre;
import tasks_6.part_1.by.yurachel.part_1.entity.roles.Admin;
import tasks_6.part_1.by.yurachel.part_1.service.Util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Runner {
    public static void main(String[] args) throws IOException {
        Book book1 = new Book(1, "Horus", "paper", new ArrayList<>(Arrays.asList(new Author("Dan Abbnet"))), new Genre("Fantastic"), 100, 350);
        Book book2 = new Book(2, "Java", "electronic", new ArrayList<>(Arrays.asList(new Author("Blinov I.N."))), new Genre("Java tutorial"), 200, 800);
        Book book3 = new Book(3, "The Solar War", "electronic", new ArrayList<>(Arrays.asList(new Author("Ben Counter "))), new Genre("Fantastic"), 150, 430);
        Book book4 = new Book(4, "Old Earth", "paper", new ArrayList<>(Arrays.asList(new Author("Graham McNeill"))), new Genre("Fantastic"), 130, 460);
        Book book5 = new Book(5, "Tallarn", "electronic", new ArrayList<>(Arrays.asList(new Author("Gav Thorpe"))), new Genre("Fantastic"), 90, 500);
        Book book6 = new Book(6, "Vengeful Spirit", "paper", new ArrayList<>(Arrays.asList(new Author("Aaron Dembski-Bowden "))), new Genre("Fantastic"), 150, 410);
        Book book7 = new Book(7, "Know No Fear", "electronic", new ArrayList<>(Arrays.asList(new Author("John French"))), new Genre("Fantastic"), 120, 390);
        Book book8 = new Book(8, "Fallen Angels", "paper", new ArrayList<>(Arrays.asList(new Author(" Guy Haley"))), new Genre("Fantastic"), 210, 610);
        Book book9 = new Book(9, "Prince of Crows ", "electronic", new ArrayList<>(Arrays.asList(new Author("Rob Sanders "))), new Genre("Fantastic"), 150, 260);
        Book book10 = new Book(10, "Censure", "paper", new ArrayList<>(Arrays.asList(new Author("Nick Kyme"))), new Genre("Fantastic"), 200, 520);

        Util util = new Util();
        Admin admin = new Admin();
        admin.writeToLibrary(book10);


    }
}
