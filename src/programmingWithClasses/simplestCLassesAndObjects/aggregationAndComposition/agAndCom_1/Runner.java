package programmingWithClasses.simplestCLassesAndObjects.aggregationAndComposition.agAndCom_1;

/* Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести
на консоль текст, заголовок текста.

 */

public class Runner {
    public static void main(String[] args) {
        Text text = new Text();

// Первое предложение.

        Word word = new Word("Hello");
        Word word1 = new Word("World!");
        Word header = new Word("Header");
        Sentence sentence = new Sentence();
        sentence.addWord(word);
        sentence.addWord(word1);

// Второе предложение.

        Sentence sentence1 = new Sentence();
        Word word2 = new Word("Learning");
        Word word3 = new Word("Java");
        sentence1.addWord(word2);
        sentence1.addWord(word3);

// Получаем текст.

        text.setHeader(header);
        text.addNewSentence(sentence);
        System.out.println(text.getText());
        text.addNewSentence(sentence1);
        System.out.println(text.getText());
        System.out.println("The header is: " + text.getHeader());
    }
}
