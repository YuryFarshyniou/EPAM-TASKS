package programming_with_classes.simplest_classes_and_objects.aggregation_and_composition.agAndCom_1;

public class Text {

    private String text = "";
    private String header;

    // Выводим текст.

    public String getText() {
        return text;
    }

    // Выводим заголовок.

    public String getHeader() {
        return header;
    }

    // Устанавливаем заголовок

    public void setHeader(Word word) {
        this.header = word.getWord();
    }

    // Добавляем предложение в текст.

    void addNewSentence(Sentence sentence) {
        this.text += sentence.getSentence();
    }
}
