package programming_with_classes.simplest_classes_and_objects.classes_4.by.yurachel.task_4.main;

import programming_with_classes.simplest_classes_and_objects.classes_4.by.yurachel.task_4.entity.DepartureTime;
import programming_with_classes.simplest_classes_and_objects.classes_4.by.yurachel.task_4.entity.Depo;
import programming_with_classes.simplest_classes_and_objects.classes_4.by.yurachel.task_4.logic.Sort;
import programming_with_classes.simplest_classes_and_objects.classes_4.by.yurachel.task_4.view.Show;


public class TrainRunner {
    public static void main(String[] args) {
        Depo depo = new Depo();
        depo.addTrain("Mogilev", 543, new DepartureTime(18, 20, 10));
        depo.addTrain("Minsk", 123, new DepartureTime(10, 40, 39));
        depo.addTrain("Minsk", 330, new DepartureTime(14, 36, 59));

        Show.showTrains(depo.getTrainsList());
        Sort.sortDestination(depo.getTrainsList(), "Descending");
        Show.showTrains(depo.getTrainsList());
    }
}
