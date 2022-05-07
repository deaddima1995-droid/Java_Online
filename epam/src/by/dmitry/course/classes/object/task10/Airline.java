package by.dmitry.course.classes.object.task10;

import by.dmitry.course.classes.object.task10.data.Destination;
import by.dmitry.course.classes.object.task10.data.Plane;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class Airline {
    private int numberPlane;
    private Destination destination;
    private final Plane typeAirline;
    private LocalTime departureTime;
    private DayOfWeek departureDate;

    public Airline(Destination destination, Plane typeAirline, LocalTime departureTime, DayOfWeek departureDate) {
        this.numberPlane = destination.numberLine;
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

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }

    public void setDepartureDate(DayOfWeek departureDate) {
        this.departureDate = departureDate;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
        this.numberPlane = destination.numberLine;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "numberPlane=" + numberPlane +
                ", destination=" + destination +
                ", typeAirline=" + typeAirline +
                ", departureTime=" + departureTime +
                ", departureDate=" + departureDate +
                "}\n";
    }
}
