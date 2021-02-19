package programming_with_classes.simplest_classes_and_objects.classes_4.by.yurachel.task_4.logic;

import programming_with_classes.simplest_classes_and_objects.classes_4.by.yurachel.task_4.entity.Train;

import java.util.List;

public class Sort {

    // Сортируем по номеру поезда.

    public static void sortByTrainNumber(List<Train> trains) {
        trains.sort((train1, train2) -> train1.getTrainNumber() - train2.getTrainNumber());

    }

    // Сортировка по пункту назначения.

    public static void sortDestination(List<Train> trains, String typeOfSort) {
        int compareDestination = 0;
        int compareDate = 0;
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int j = 1; j < trains.size(); j++) {
                if (typeOfSort.equalsIgnoreCase("Ascending")) {
                    compareDestination = trains.get(j - 1).getDestination().compareToIgnoreCase(trains.get(j).getDestination());
                    compareDate = trains.get(j - 1).getTime().getFullTime() - (trains.get(j).getTime().getFullTime());
                } else if (typeOfSort.equalsIgnoreCase("Descending")) {
                    compareDestination = trains.get(j).getDestination().compareToIgnoreCase(trains.get(j - 1).getDestination());
                    compareDate = trains.get(j).getTime().getFullTime() - (trains.get(j - 1).getTime().getFullTime());
                }
                if (compareDestination > 0) {
                    Train temp = trains.get(j);
                    trains.set(j, trains.get(j - 1));
                    trains.set(j - 1, temp);
                    needIteration = true;
                } else if (compareDestination == 0 && compareDate > 0) {
                    Train temp = trains.get(j);
                    trains.set(j, trains.get(j - 1));
                    trains.set(j - 1, temp);
                    needIteration = true;
                }
            }
        }
    }
}

