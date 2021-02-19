package programming_with_classes.simplest_classes_and_objects.classes_4.by.yurachel.task_4.entity;




public class Train {

    // Объявляем атрибуты класса.

    private String destination;
    private final int trainNumber;
    private DepartureTime time;

    public String getDestination() {
        return destination;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public DepartureTime getTime() {
        return time;
    }

    public void setTime(DepartureTime time) {
        this.time = time;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    Train(String destination, int trainNumber, DepartureTime time) {
        this.destination = destination;
        this.trainNumber = trainNumber;
        this.time = time;
    }

    @Override
    public String toString() {
        return "Train information: " +
                "destination: " + destination +
                ", trainNumber = " + trainNumber +
                ", departureTime = " + time;
    }
}
