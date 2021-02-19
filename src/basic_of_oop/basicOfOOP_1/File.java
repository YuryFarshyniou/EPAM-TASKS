package basic_of_oop.basicOfOOP_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class File {
    private String fileName;
    private int size;
    private Directory directory;
    private boolean isAvailable;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public String getFileName() {
        if (!isAvailable) {
            return "File has been deleted.";
        } else {
            return fileName;
        }
    }


    public void setFileName(String fileName) {
        this.fileName = fileName;
    }


    public int getSize() {
        if (!isAvailable) {
            System.out.println("File has been deleted.");
        } else {
            return size;
        }
        return -1;
    }

    public void setSize(int size) {
        this.size = size;
    }


    public Directory getDirectory() {
        if (!isAvailable) {
            System.out.println("File has been deleted.");
        } else {
            return directory;
        }
        return null;
    }

    public void setDirectory(Directory directory) {
        this.directory = directory;
    }

    // Создаем новый файл.

    public File(String fileName, int size, Directory directory, boolean isAvailable) {
        this.fileName = fileName;
        this.size = size;
        this.directory = directory;
        this.isAvailable = isAvailable;
        System.out.println("We created a new file.");
    }

    // Переименовываем файл.

    public void rename() throws IOException {
        System.out.println("Enter new file name: ");
        this.fileName = reader.readLine();
    }

    // Удаляем файл.

    public void delete() throws IOException {
        System.out.println("You want to delete file?(yes//no)");
        String answer = reader.readLine();
        if (answer.equalsIgnoreCase("yes")) {
            this.isAvailable = false;
        } else {
            System.out.println("We won't delete this file.");
        }
    }
}
