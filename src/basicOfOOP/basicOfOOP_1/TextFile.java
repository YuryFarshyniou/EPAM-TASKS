package basicOfOOP.basicOfOOP_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TextFile extends File {
    private StringBuilder content;

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public StringBuilder getContent() {
        if (!isAvailable()) {
            System.out.println("File has been deleted.");
        } else {
            return content;
        }
        return null;
    }

    public void setContent(StringBuilder content) {
        this.content = content;
    }

    // Создаем новый текстовый файл.

    public TextFile(String fileName, int size, Directory directory, boolean isAvailable, StringBuilder content) {
        super(fileName, size, directory, isAvailable);
        this.content = content;

        System.out.println("The text file has been created.");
    }

    // Дополняем наш текстовый файл.

    public void addContent() throws IOException {
        System.out.println("Add new addition: ");
        String addition = reader.readLine();
        this.content.append(addition);
    }
}
