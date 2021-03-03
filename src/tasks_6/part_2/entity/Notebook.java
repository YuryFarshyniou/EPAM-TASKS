package tasks_6.part_2.entity;


import java.io.*;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Notebook {
    public static final String NOTEBOOK_PATH = "resources\\task_6\\notebook\\Notebook.txt";
    private final Set<String> notes;

    {
        notes = copyNotesFromFile();
    }

    public Set<String> getNotes() {
        return notes;
    }

    // Добавляем новую заметку.

    public void addNewNoteToFile(Note... notes) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(NOTEBOOK_PATH, true))) {
            for (Note note : notes) {
                bw.write(note.toString() + "\n");
            }
        } catch (IOException e) {
            System.err.println("File not found");
        }
    }

    // Получаем заметки для работы с ними.

    private Set<String> copyNotesFromFile() {
        Set<String> notes = new TreeSet<>();
        try (BufferedReader br = new BufferedReader(new FileReader(NOTEBOOK_PATH))) {
            String read = "";
            while ((read = br.readLine()) != null) {
                notes.add(read);
            }
        } catch (IOException e) {
            System.err.println("File not found");
        }
        return notes;
    }

    // Выводим заметки на консоль.

    public void showNotes(Set<String> notes) {
        for (String note : notes) {
            System.out.println(note);
        }
    }

    // Поиск заметок по теме.

    public Set<String> sortByTopic(Set<String> notes, String topic) {
        Set<String> topicSort = new TreeSet<>();
        Pattern pattern = Pattern.compile("Topic: (.+)  Date: ");
        for (String note : notes) {
            Matcher matcher = pattern.matcher(note);
            while (matcher.find()) {
                if (matcher.group(1).equalsIgnoreCase(topic)) {
                    topicSort.add(note);
                }
            }
        }
        return topicSort;
    }

    // Поиск по дате

    public Set<String> sortByDate(Set<String> notes, String date, boolean isFullDate) {
        Set<String> dateSort = new TreeSet<>();
        Pattern pattern;
        if (isFullDate) {
            pattern = Pattern.compile("Date: (.+)  Email: ");
        } else {
            pattern = Pattern.compile("Date: (\\d+\\.\\d+\\.\\d+) (\\d+:\\d+)  Email: ");
        }
        for (String note : notes) {
            Matcher matcher = pattern.matcher(note);
            while (matcher.find()) {
                if (matcher.group(1).equalsIgnoreCase(date)) {
                    dateSort.add(note);
                }
            }
        }
        return dateSort;
    }

    // Поиск по Email.

    public Set<String> sortByEmail(Set<String> notes, String email) {
        Set<String> emailSort = new TreeSet<>();
        Pattern pattern = Pattern.compile("  Email: (.+)  Message:");
        for (String note : notes) {
            Matcher matcher = pattern.matcher(note);
            while (matcher.find()) {
                if (matcher.group(1).equalsIgnoreCase(email)) {
                    emailSort.add(note);
                }
            }
        }
        return emailSort;
    }

    // Найти заметки, содержащие определенное поле.

    public Set<String> searchWord(Set<String> notes, String word) {
        Set<String> searchWord = new TreeSet<>();
        Pattern pattern = Pattern.compile("  Message: (.+)?(\\b" + word + "\\b)(.+)?");
        for (String note : notes) {
            Matcher matcher = pattern.matcher(note);
            while (matcher.find()) {
                if (matcher.group(2).equalsIgnoreCase(word)) {
                    searchWord.add(note);
                }
            }
        }
        return searchWord;
    }



}
