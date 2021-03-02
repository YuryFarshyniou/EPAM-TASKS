package tasks_6.part_1.by.yurachel.part_1.entity.roles;

import tasks_6.part_1.by.yurachel.part_1.entity.library.Book;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Admin {

    public static final String LIBRARY_PATH = "C:\\Users\\USER1\\IdeaProjects\\EPAM-TASKS\\src\\tasks_6" +
            "\\part_1\\by\\yurachel\\part_1\\entity\\library\\Library.txt";

    private final String userAuthenticationPath = "C:\\Users\\USER1\\IdeaProjects\\EPAM-TASKS\\src\\tasks_6\\part_1\\by\\yurachel\\part_1\\entity\\roles\\UserAuthentication.txt";

    public final static String ADMIN_EMAIL = "yurachel@mail.ru";


    private List<User> userList;

    {
        userList = new ArrayList<>();
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    // Добавляем новых пользователей.

    public void addNewUsers(User... users) {
        StringBuilder pas = new StringBuilder("");
        Pattern pattern = Pattern.compile("password: (.+),");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(userAuthenticationPath, true))) {
            for (User user : users) {
                Matcher matcher = pattern.matcher(user.toString());
                if (matcher.find()) {
                    for (int i = 0; i < matcher.group(1).length(); i++) {
                        pas.append("*");
                    }
                }
                bw.write("ID. " + user.getId() + ", Name. " + user.getName() + ", Password: " +
                        pas + ", Email. " + user.getEmail() + "\n");
            }
        } catch (IOException e) {
            System.out.println("File not found");
        }

        userList.addAll(Arrays.asList(users));
    }

    // Добавляем новые книги.

    public void writeToLibrary(Book... book) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(LIBRARY_PATH, true))) {
            for (Book book1 : book) {
                bw.write(book1.toString() + "\n");
                findEmails(book1);
            }
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }

    // Рассылаем оповещения на имейл всем пользователям.

    private void findEmails(Book book) {
        for (User user : userList) {
            System.out.println(book + " sent to " + user.getEmail());
        }
    }

}
