package programming_with_classes.simplest_classes_and_objects.aggregation_and_composition.ag_and_com_1.by.yurachel.ag_and_com_1.entity;

public class Word {
    private String word;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public Word(String word) {
        this.word = word;
    }

    public String toString() {
        return word;
    }
}
