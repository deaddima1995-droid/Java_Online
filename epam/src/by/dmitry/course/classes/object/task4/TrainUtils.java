package by.dmitry.course.classes.object.task4;

import java.util.*;

public class TrainUtils {
    private static final Random RND = new Random();
    private static final String[] arrayDestination = {"Минск", "Гомель", "Бобруйск", "Брест", "Гродно"};
    private static final int[] arrayNumbersTrain = {1, 2, 3, 4, 5};
    private static final String[] arrayDepartureTime = {"10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00"};

    public static ArrayList<Train> createRandomTrain(int countTrains) {
        ArrayList<Train> out = new ArrayList<>();
        if (countTrains < 1) {
            countTrains = 1;
        }
        for (int i = 0; i < countTrains; i++) {
            int temp = RND.nextInt(1, 5);
            out.add(new Train(
                    arrayDestination[temp],
                    arrayNumbersTrain[temp],
                    arrayDepartureTime[RND.nextInt(arrayDepartureTime.length)]
            ));
        }
        return out;
    }

    public static void printTrainsInformationFromNumber(List<Train> trains, int numberTrain) {
        ArrayList<Train> list = new ArrayList<>(trains.stream().filter(train -> train.getTrainNumber() == numberTrain).toList());
        if (!list.isEmpty()) {
            sortTrainListByDestination(list);
            System.out.println(list);
        } else {
            System.out.println("Таких поездов нет");
        }
    }

    public static void sortTrainListByNumberTrain(List<Train> trains) {
        trains.sort(Comparator.comparingInt(Train::getTrainNumber));
    }

    public static void sortTrainListByDestination(List<Train> trains) {
        trains.sort((o1, o2) -> {
            if (o1.getDestination().equals(o2.getDestination())) {
                return o1.getTimeOfDeparture().compareTo(o2.getTimeOfDeparture());
            }
            return o1.getDestination().compareTo(o2.getDestination());
        });
    }


}
