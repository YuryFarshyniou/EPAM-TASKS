package stringsAndBasicOfTextProcessing.workingWithStringlikeWithObject;

/* С помощью функции копирования и операции конкатенации
составить из частей слова "информатика" слово "торт". */

public class String_4 {
    public static void main(String[] args) {
        String word = "информатика";
        System.out.println("Our word: " + word);
        String o = word.substring(3, 4);
        String p = word.substring(4, 5);
        String t = word.substring(7, 8);
        String tort = t.concat(o).concat(p).concat(t);
        System.out.println("Our cake: " + tort);
    }
}
