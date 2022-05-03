package by.dmitry.course.classes.object.task4;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Train> trains = TrainUtils.createRandomTrain(5);
        System.out.println("Список поездов:\n" + trains);

        TrainUtils.sortTrainListByNumberTrain(trains);
        System.out.println("Сортировка по номерам поезда:\n" + trains);

        TrainUtils.sortTrainListByDestination(trains);
        System.out.println("Сортировка по месту прибытия:\n" + trains);

        System.out.println("Список поездов по номеру:");
        TrainUtils.printTrainsInformationFromNumber(trains, 3);
    }
}
