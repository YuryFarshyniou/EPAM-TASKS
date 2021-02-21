package programming_with_classes.simplest_classes_and_objects.aggregation_and_composition.ag_and_com_1.by.yurachel.ag_and_com_1.main;

import programming_with_classes.simplest_classes_and_objects.aggregation_and_composition.ag_and_com_1.by.yurachel.ag_and_com_1.entity.Sentence;
import programming_with_classes.simplest_classes_and_objects.aggregation_and_composition.ag_and_com_1.by.yurachel.ag_and_com_1.entity.Text;
import programming_with_classes.simplest_classes_and_objects.aggregation_and_composition.ag_and_com_1.by.yurachel.ag_and_com_1.entity.Word;

public class Runner {
    public static void main(String[] args) {

        Text text = new Text(new Word("Learning Java."));

        Sentence sentence1 = new Sentence();
        sentence1.add("Hello");
        sentence1.add("World.");
        sentence1.add("How");
        sentence1.add("Are");
        sentence1.add("you");
        sentence1.add("Felling?");

        Sentence sentence2 = new Sentence();
        sentence2.add("I");
        sentence2.add("am");
        sentence2.add("fine,");
        sentence2.add("thanks.");

        text.addSentence(sentence1);
        text.addSentence(sentence2);

        text.show();

    }
}
