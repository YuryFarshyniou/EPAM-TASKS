package programming_with_classes.simplest_classes_and_objects.classes_4.by.yurachel.task_4.view;

import programming_with_classes.simplest_classes_and_objects.classes_4.by.yurachel.task_4.entity.Train;

import java.util.List;

public class Show {

    // Выводим список поездов.

    public static void showTrains(List<Train> trains) {
        for (Train tr : trains) {
            System.out.println(tr);
        }
    }

    // Получение информации по номеру поезда.

    public static void showTrain(List<Train> trains, int number) {
        for (Train train : trains) {
            if (train.getTrainNumber() == number) {
                System.out.println(train);
            }
        }
    }
}
