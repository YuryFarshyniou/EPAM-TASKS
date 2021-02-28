package tasks_6.part_1.by.yurachel.part_1.service;

import tasks_6.part_1.by.yurachel.part_1.entity.library.Book;

import java.io.*;

public class Util {

    public static final String path = "C:\\Users\\USER1\\IdeaProjects\\EPAM-TASKS\\src\\tasks_6" +
            "\\part_1\\by\\yurachel\\part_1\\entity\\library\\Library.txt";



    public void writeToLibrary(Book... book) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {

            for (Book book1 : book) {
                bw.write(book1.toString() + "\n");
            }

        } catch (IOException e) {
            System.out.println("File not found");
        }

    }

    public void ShowBooks() {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String book = "";
            while((book=br.readLine())!=null){
                System.out.println(book);
            }
        } catch (IOException e) {
            System.out.println("Wrong path.");
        }
    }


}
