package programming_with_classes.simplest_classes_and_objects.classes_4.by.yurachel.task_4.entity;

import java.util.ArrayList;
import java.util.List;

public class Depo {
    private List<Train> trainsList;

    {
        trainsList = new ArrayList<>();
    }

    public List<Train> getTrainsList() {
        return this.trainsList;
    }

    public void addTrain(String destination, int number, DepartureTime time) {
        trainsList.add(new Train(destination, number, time));
    }
}
