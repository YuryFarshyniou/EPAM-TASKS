package programming_with_classes.simplest_classes_and_objects.classes_4.by.yurachel.task_4.logic;

import programming_with_classes.simplest_classes_and_objects.classes_4.by.yurachel.task_4.entity.Train;

import java.io.IOException;
import java.util.List;

public class TrainInformation {

    // Получение информации о поезде по введенному номеру.

    public Train trainNumber(List<Train> trains, int number) throws IOException {
        for (Train train : trains) {
            if (number == train.getTrainNumber()) {
                return train;
            }
        }
        return null;
    }
}
