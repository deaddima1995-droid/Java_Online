package by.dmitry.course.classes.object.task10;

import by.dmitry.course.classes.object.task10.data.DayOfWeek;
import by.dmitry.course.classes.object.task10.data.Destination;
import by.dmitry.course.classes.object.task10.data.Plane;

import java.time.LocalTime;

public class Airline {
    private int numberPlane;
    private Destination destination;
    private Plane typeAirline;
    private LocalTime departureTime;
    private DayOfWeek departureDate;

    public Airline(int numberPlane, Destination destination, Plane typeAirline, LocalTime departureTime, DayOfWeek departureDate) {
        this.numberPlane = numberPlane;
        this.destination = destination;
        this.typeAirline = typeAirline;
        this.departureTime = departureTime;
        this.departureDate = departureDate;
    }

    public int getNumberPlane() {
        return numberPlane;
    }

    public Destination getDestination() {
        return destination;
    }

    public Plane getTypeAirline() {
        return typeAirline;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public DayOfWeek getDepartureDate() {
        return departureDate;
    }
}
