package programming_with_classes.simplest_classes_and_objects.aggregation_and_composition.ag_and_com_1.by.yurachel.ag_and_com_1.entity;


import java.util.ArrayList;
import java.util.List;

public class Sentence {
    private List<Word> sentence;

    {
        sentence = new ArrayList<>();
    }

    public List<Word> getSentence() {
        return sentence;
    }

    public void setSentence(List<Word> sentence) {
        this.sentence = sentence;
    }

    // Добавляем слово в предложение.

    public void add(String word) {
        this.sentence.add(new Word(word));
    }

    public String toString() {
        return "" + sentence;
    }
}
