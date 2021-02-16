package basicOfOOP.basicOfOOP_1;

import java.io.IOException;

public class Runner {
    public static void main(String[] args) throws IOException {

        // Создаем новый файл.

        TextFile file = new TextFile("Content", 1, new Directory("F:/New folder/"), true, new StringBuilder("Something interesting in this file."));

//        System.out.println("File's name is: " + file.getFileName());

        // Переименовываем файл.

//        file.rename();
//        System.out.println("File's new name is: " + file.getFileName());

        // Выводим содержимое на консоль.

//        System.out.println("Text file content is: " + file.getContent());

        // Дополняем файл.

//        file.addContent();
//        System.out.println("Text file content is: " + file.getContent());

        // Удаляем файл.

        file.delete();
        System.out.println(file.getContent());
    }
}
