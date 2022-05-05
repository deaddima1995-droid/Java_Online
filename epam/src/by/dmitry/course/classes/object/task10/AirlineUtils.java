package by.dmitry.course.classes.object.task10;

import by.dmitry.course.classes.object.task10.data.DayOfWeek;
import by.dmitry.course.classes.object.task10.data.Destination;
import by.dmitry.course.classes.object.task10.data.Plane;

import java.time.LocalTime;

public class AirlineUtils {

    public static Airline createRandomAirPlane() {
        return new Airline(101, Destination.BERLIN, Plane.AIRBUS, LocalTime.parse("10:00"), DayOfWeek.MONDAY);
    }
}
