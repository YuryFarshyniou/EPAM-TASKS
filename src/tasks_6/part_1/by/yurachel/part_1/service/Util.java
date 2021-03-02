package tasks_6.part_1.by.yurachel.part_1.service;

import tasks_6.part_1.by.yurachel.part_1.entity.roles.Admin;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Util {

    // Запись книг в map.

    private Map<Integer, String> writeBooksToMap() throws IOException {
        Map<Integer, String> books = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(Admin.LIBRARY_PATH))) {
            Pattern pattern = Pattern.compile("(id: )(\\d+)(.+)");
            String book = "";
            while ((book = br.readLine()) != null) {
                Matcher matcher = pattern.matcher(book);
                if (matcher.find()) {
                    books.put(Integer.parseInt(matcher.group(2)), matcher.group(3));
                }
            }
        }
        return books;
    }

    // Просмотр книг.

    public void showBooks() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (Map.Entry entry : writeBooksToMap().entrySet()) {
            System.out.println("Id. " + entry.getKey() + " " + entry.getValue());
            if ((int) entry.getKey() % 5 == 0 && (int) entry.getKey() != writeBooksToMap().size()) {
                System.out.println("Enter \"next\" to see next page.");
                String page = reader.readLine();
            }
        }
    }

    // Поиск книг.

    public String searchBook(String bookName) {
        Pattern pattern = Pattern.compile("(bookname: )" + "(" + bookName.toLowerCase() + ")(, type:)");
        String book = "";
        try (BufferedReader br = new BufferedReader(new FileReader(Admin.LIBRARY_PATH))) {
            String bookInformation = "";
            while ((bookInformation = br.readLine()) != null) {
                Matcher matcher = pattern.matcher(bookInformation.toLowerCase());
                if (matcher.find()) {
                    book = bookInformation;
                }
            }
        } catch (IOException e) {
            System.out.println("Wrong path.");
        }
        return book;
    }


}
