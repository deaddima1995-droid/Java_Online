package by.dmitry.course.classes.object.task4;

import java.time.LocalTime;

public class Train {
    private final String destination;
    private final int trainNumber;
    private final LocalTime timeOfDeparture;

    public Train(String destination, int trainNumber, String departureTime) {
        this.destination = destination;
        this.trainNumber = trainNumber;
        timeOfDeparture = LocalTime.parse(departureTime);
    }

    public String getDestination() {
        return destination;
    }

    public LocalTime getTimeOfDeparture() {
        return timeOfDeparture;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    @Override
    public String toString() {
        return "Поезд{" +
                "Прибытие: '" + destination + '\'' +
                ", Номер поезда :" + trainNumber +
                ", Время прибытия - " + timeOfDeparture +
                "}\n";
    }
}
