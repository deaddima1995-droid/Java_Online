package by.dmitry.course.classes.object.task10;

import by.dmitry.course.classes.object.task10.data.Destination;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Airport {
    private final ArrayList<Airline> airlines = new ArrayList<>();

    public void addAirline(Airline... airline) {
        airlines.addAll(List.of(airline));
    }

    public void deleteAirline(Airline airline) {
        airlines.remove(airline);
    }

    public List<Airline> getAirlineListFromDestination(Destination destination) {
        return new ArrayList<>(airlines.stream().filter(airline -> airline.getDestination().equals(destination)).toList());
    }

    public List<Airline> getAirlineListFromDayOfWeek(DayOfWeek day) {
        return new ArrayList<>(airlines.stream().filter(airline -> airline.getDepartureDate().equals(day)).sorted(Comparator.comparing(Airline::getDepartureTime)).toList());
    }

    public List<Airline> getAirlineListFromDayOfWeekAndSortedTime(DayOfWeek day, LocalTime currentTime) {
        return new ArrayList<>(
                airlines.stream().
                        filter(airline -> airline.getDepartureDate().equals(day) && airline.getDepartureTime().isAfter(currentTime)).
                        sorted(Comparator.comparing(Airline::getDepartureTime)).toList()
        );
    }

}
