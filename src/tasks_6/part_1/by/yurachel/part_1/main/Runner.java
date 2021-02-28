package tasks_6.part_1.by.yurachel.part_1.main;

import tasks_6.part_1.by.yurachel.part_1.entity.Roles.User;
import tasks_6.part_1.by.yurachel.part_1.entity.library.Author;
import tasks_6.part_1.by.yurachel.part_1.entity.library.Book;
import tasks_6.part_1.by.yurachel.part_1.entity.library.Genre;
import tasks_6.part_1.by.yurachel.part_1.service.Util;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Runner {
    public static void main(String[] args) throws IOException {
        Book book1 = new Book("Horus", "paper",new ArrayList<>(Arrays.asList(new Author("Dan Abbnet"))), new Genre("Fantastic"), 100, 350);
        Book book2 = new Book("Java", "electronic",new ArrayList<>(Arrays.asList(new Author("Blinov I.N."))), new Genre("Java tutorial"), 200, 800);


        Util util = new Util();

        util.ShowBooks();



    }
}
