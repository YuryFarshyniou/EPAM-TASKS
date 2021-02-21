package programming_with_classes.simplest_classes_and_objects.aggregation_and_composition.ag_and_com_1.by.yurachel.ag_and_com_1.entity;

import java.util.ArrayList;
import java.util.List;

public class Text {
    private Word header;
    private List<Sentence> text;

    {
        text = new ArrayList<>();
    }

    public Word getHeader() {
        return header;
    }

    public void setHeader(Word header) {
        this.header = header;
    }

    public List<Sentence> getText() {
        return text;
    }

    public void setText(List<Sentence> text) {
        this.text = text;
    }

    public Text(Word header) {
        this.header = header;
    }

    // Добавляем предложения в текст.

    public void addSentence(Sentence sentence) {
        text.add(sentence);
    }

    public void show() {
        System.out.println(header);
        for (Sentence sentence : text) {
            for (Word word : sentence.getSentence())
                System.out.print(word + " ");
        }
    }

    public String toString() {
        return header + "\n" + text;
    }

}
