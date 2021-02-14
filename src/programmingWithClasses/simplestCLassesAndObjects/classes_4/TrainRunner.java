package programmingWithClasses.simplestCLassesAndObjects.classes_4;

import java.io.IOException;

public class TrainRunner {
    public static void main(String[] args) throws IOException {
        Train tr = new Train();
        System.out.println("Please, enter information about trains: ");
        Train[] trains = tr.trainsInitialize();

        System.out.println("***************************");
        System.out.println("Destination sort: ");
        tr.sortDestination(trains);
        tr.showTrains(trains);

        System.out.println("***************************");
        System.out.println("Train number sort: ");
        tr.sortByTrainNumber(trains);
        tr.showTrains(trains);

        System.out.println("***************************");
        tr.trainNumber(trains);
    }
}
