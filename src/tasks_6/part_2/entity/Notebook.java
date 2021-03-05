package tasks_6.part_2.entity;


import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Notebook {
    public static final String NOTEBOOK_PATH = "resources\\task_6\\notebook\\Notebook.txt";
    private final List<String> notes;

    {
        notes = copyNotesFromFile();
    }

    public List<String> getNotes() {
        return notes;
    }

    // Добавляем новую заметку в блокнот.

    public void addNewNoteToNotes(Note... newNotes) {
        Pattern datePattern = Pattern.compile("Date: (\\d{2}\\.\\d{2}\\.\\d{4} \\d{2}:\\d{2})  Email: ");
        Pattern emailPattern = Pattern.compile("Email: (.+@.+\\.\\w+)  Message:");
        for (Note note : newNotes) {
            boolean isCorrespondsDate = false;
            boolean isCorrespondsEmail = false;
            Matcher matcherDate = datePattern.matcher(note.toString());
            if (matcherDate.find()) {
                isCorrespondsDate = true;
            } else {
                System.err.println("You entered wrong date.");
            }
            Matcher matcherEmail = emailPattern.matcher(note.toString());
            if (matcherEmail.find()) {
                isCorrespondsEmail = true;
            } else {
                System.err.println("You entered not an email.");
            }
            if (isCorrespondsDate && isCorrespondsEmail) {
                this.notes.add(note.toString());
            }
        }
    }

    // Завершаем работу и сохраняем изменения в файл.

    public void exitAndSave(List<String> notes) {
        try (BufferedWriter br = new BufferedWriter(new FileWriter(NOTEBOOK_PATH))) {
            for (String note : notes) {
                br.write(note + "\n");
            }
        } catch (IOException e) {
            System.err.println("File not found");
        }
    }

    // Получаем заметки для работы с ними.

    private List<String> copyNotesFromFile() {
        List<String> notes = new ArrayList<>();
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

    public void showNotes(List<String> notes) {
        for (String note : notes) {
            System.out.println(note);
        }
    }

    // Поиск заметок по теме.

    public List<String> searchingByTopic(List<String> notes, String topic) {
        List<String> topicSearch = new ArrayList<>();
        Pattern pattern = Pattern.compile("Topic: (.+)  Date: ");
        for (String note : notes) {
            Matcher matcher = pattern.matcher(note);
            while (matcher.find()) {
                if (matcher.group(1).equalsIgnoreCase(topic)) {
                    topicSearch.add(note);
                }
            }
        }
        return topicSearch;
    }

    // Поиск по дате

    public List<String> searchingByDate(List<String> notes, String date, boolean isFullDate) {
        List<String> dateSearch = new ArrayList<>();
        Pattern pattern;
        if (isFullDate) {
            pattern = Pattern.compile("Date: (.+)  Email: ");
        } else {
            pattern = Pattern.compile("Date: (\\d{2}\\.\\d{2}\\.\\d{4} \\d{2}:\\d{2})  Email: ");
        }
        for (String note : notes) {
            Matcher matcher = pattern.matcher(note);
            while (matcher.find()) {
                if (matcher.group(1).equalsIgnoreCase(date)) {
                    dateSearch.add(note);
                }
            }
        }
        return dateSearch;
    }

    // Поиск по Email.

    public List<String> searchingByEmail(List<String> notes, String email) {
        List<String> emailSearch = new ArrayList<>();
        Pattern pattern = Pattern.compile("  Email: (.+)  Message:");
        for (String note : notes) {
            Matcher matcher = pattern.matcher(note);
            while (matcher.find()) {
                if (matcher.group(1).equalsIgnoreCase(email)) {
                    emailSearch.add(note);
                }
            }
        }
        return emailSearch;
    }

    // Найти заметки, поле которых содержит определенное слово.

    public List<String> searchingWord(List<String> notes, String word) {
        List<String> searchWord = new ArrayList<>();
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

    // Сортировка по дате.

    public List<String> sortByDate(List<String> notes, boolean ascendingOrder) {
        Pattern pattern = Pattern.compile("Date: (\\d{2}\\.\\d{2}\\.\\d{4} \\d{2}:\\d{2})  Email: ");
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < notes.size(); i++) {
                Matcher matcher = pattern.matcher(notes.get(i));
                Matcher matcher2 = pattern.matcher(notes.get(i - 1));
                if (matcher.find() && matcher2.find()) {
                    if (ascendingOrder) {
                        if (matcher.group(1).compareTo(matcher2.group(1)) < 0) {
                            String temp = notes.get(i);
                            notes.set(i, notes.get(i - 1));
                            notes.set(i - 1, temp);
                            needIteration = true;
                        }
                    } else {
                        if (matcher.group(1).compareTo(matcher2.group(1)) > 0) {
                            String temp = notes.get(i);
                            notes.set(i, notes.get(i - 1));
                            notes.set(i - 1, temp);
                            needIteration = true;
                        }
                    }
                }
            }
        }
        return notes;
    }

    // Сортировка по теме.

    public List<String> sortByTopic(List<String> notes, boolean ascendingOrder) {
        if (ascendingOrder) {
            Collections.sort(notes);
        } else {
            notes.sort((String1, String2) -> String2.compareTo(String1));
        }
        return notes;
    }

}
