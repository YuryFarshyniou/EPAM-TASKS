package basic_of_oop.basic_of_oop_1.by.yurachel.basic_of_oop1.entity;

public class TextFile extends File {
    private StringBuilder content;

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
    }

    // Дополняем наш текстовый файл.

    public void addContent(String addition) {
        this.content.append(addition);
    }


}
