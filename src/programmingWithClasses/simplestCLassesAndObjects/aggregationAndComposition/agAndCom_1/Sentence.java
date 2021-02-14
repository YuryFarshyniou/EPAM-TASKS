package programmingWithClasses.simplestCLassesAndObjects.aggregationAndComposition.agAndCom_1;

public class Sentence {
    private String sentence = "";

    // Выводим предложение.

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }


    // Добавляем слово в предложение.

    void addWord(Word word) {
        sentence += word.getWord() + " ";

    }

}
