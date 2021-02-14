package programmingWithClasses.simplestCLassesAndObjects.classes_4;

/* Создайте класс Train, содержащий поля: название пункта назначения,
номер поезда, время отправления.Создайте данные в массив из пяти элементов типа Train,
добавьте возможность сортировки элементов массива по номерам поездов.Добавьте возможность
вывода информации о поезде,номер которого введен пользователем.Добавьте возможность сортировки
массива по понкту назначения,причем поезда с одинаковыми пунктами назначения должны быть упоря-
доченны по времени отправления. */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

public class Train {

    // Объявляем атрибуты класса.


    private String destination;
    private int trainNumber;
    private Date departureTime;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


    // Создаем геттеры и сеттеры.

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    // Инициализируем массив.

    Train[] trainsInitialize() throws IOException {

        Train[] trains = new Train[5];
        for (int i = 0; i < trains.length; i++) {
            trains[i] = new Train();
            System.out.println("Enter destination: ");
            trains[i].setDestination(reader.readLine());
            System.out.println("Enter train number: ");
            trains[i].setTrainNumber(Integer.parseInt(reader.readLine()));
            System.out.println("Departure time is: ");
            trains[i].setDepartureTime(new Date());
            System.out.println(trains[i].getDepartureTime());
        }
        return trains;
    }

    // Сортируем по номеру поезда.

    void sortByTrainNumber(Train[] trains) {
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int j = 1; j < trains.length; j++) {
                if (trains[j].getTrainNumber() > trains[j - 1].getTrainNumber()) {
                    Train temp = trains[j];
                    trains[j] = trains[j - 1];
                    trains[j - 1] = temp;
                    needIteration = true;
                }
            }
        }
    }

    // Выводим список поездов.

    void showTrains(Train[] trains) {
        for (Train tr : trains) {
            System.out.println(tr);
        }
    }

    // Вывод информации о поезде по введенному номеру.

    void trainNumber(Train[] trains) throws IOException {
        System.out.println("Enter train number: ");
        int number = Integer.parseInt(reader.readLine());
        for (Train train : trains) {
            if (number == train.getTrainNumber()) System.out.println(train);

        }
    }

    // Сортировка по пункту назначения.

    void sortDestination(Train[] trains) {

        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int j = 1; j < trains.length; j++) {
                int compareDestination = trains[j].getDestination().compareToIgnoreCase(trains[j - 1].getDestination());
                int compareDate = trains[j].getDepartureTime().compareTo(trains[j - 1].getDepartureTime());
                if (compareDestination > 0) {
                    Train temp = trains[j];
                    trains[j] = trains[j - 1];
                    trains[j - 1] = temp;
                    needIteration = true;
                }else if(compareDestination==0 && compareDate>0){
                    Train temp = trains[j];
                    trains[j] = trains[j - 1];
                    trains[j - 1] = temp;
                    needIteration = true;
                }
            }
        }
    }


    @Override
    public String toString() {
        return "Train{" +
                "destination='" + destination + '\'' +
                ", trainNumber=" + trainNumber +
                ", departureTime=" + departureTime +
                '}';
    }

}
