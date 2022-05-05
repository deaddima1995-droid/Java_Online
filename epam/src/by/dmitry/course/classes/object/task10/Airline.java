package by.dmitry.course.classes.object.task10;

import java.time.LocalTime;

public class Airline {
    private int numberPlane;
    private String destination;
    private Plane typeAirline;
    private LocalTime departureTime;
    private DayOfWeek departureDate;

    public Airline(int numberPlane, String destination, Plane typeAirline, LocalTime departureTime, DayOfWeek departureDate) {
        this.numberPlane = numberPlane;
        this.destination = destination;
        this.typeAirline = typeAirline;
        this.departureTime = departureTime;
        this.departureDate = departureDate;
    }

    public int getNumberPlane() {
        return numberPlane;
    }

    public String getDestination() {
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
