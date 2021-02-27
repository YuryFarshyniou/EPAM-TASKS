package tasks_6.part_1.by.yurachel.part_1.service;

import tasks_6.part_1.by.yurachel.part_1.entity.library.Book;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Util {

    public void writeToLibrary(Book... book) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\USER1\\IdeaProjects\\EPAM-TASKS\\src\\tasks_6" +
                "\\part_1\\by\\yurachel\\part_1\\entity\\library\\Library.txt"))) {

            for (Book book1 : book) {
                bw.write(book1.toString() + "\n");
            }
        } catch (IOException e) {
            System.out.println("File not found");

        }
    }
}
