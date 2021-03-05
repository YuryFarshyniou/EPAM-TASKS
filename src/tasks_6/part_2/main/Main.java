package tasks_6.part_2.main;


import tasks_6.part_2.entity.Note;
import tasks_6.part_2.entity.Notebook;

import java.util.List;


public class Main {
    public static void main(String[] args) {

        Notebook note = new Notebook();
        List<String> notes = note.getNotes();
        Note note1 = new Note("Learning", "03.03.2021 17:00", "gleb@mail.ru", "Today i'm going to learn java.");
        Note note2 = new Note("Date", "04.03.2021 15:00", "gleb@mail.ru", "Tomorrow i'll go to date with a pretty girl.");
        Note note3 = new Note("Learning", "03.03.2021 15:00", "gleb@mail.ru", "Need to learn multithreading.");
        Note note4 = new Note("Shopping", "02.03.2021 15:00", "gleb@mail.ru", "Go to our mall.");
        Note note5 = new Note("Cooking", "05.03.2021 15:00", "gleb@mail.ru", "Need to cooking rice.");

        note.sortByTopic(notes, true);

        note.showNotes(notes);
        note.exitAndSave(notes);


    }
}
