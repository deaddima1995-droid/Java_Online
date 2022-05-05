package by.dmitry.course.classes.object.task10;

import java.util.ArrayList;

public class AirlineStorage {
    private final ArrayList<Airline> storage = new ArrayList<>();

    public void addAirline(Airline airline) {
        storage.add(airline);
    }

    public void deleteAirline(Airline airline) {
        storage.remove(airline);
    }

    public void printSortedListFromDestination() {

    }
}
