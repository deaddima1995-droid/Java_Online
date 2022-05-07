package by.dmitry.course.classes.object.task10;

import by.dmitry.course.classes.object.task10.data.Destination;
import by.dmitry.course.classes.object.task10.data.Plane;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
        Airport airport = new Airport();
        Airline[] planes = {
                new Airline(Destination.MINSK, Plane.BOING737, LocalTime.parse("10:00"), DayOfWeek.FRIDAY),
                new Airline(Destination.BERLIN, Plane.BOING747, LocalTime.parse("12:00"), DayOfWeek.MONDAY),
                new Airline(Destination.NEW_YORK, Plane.AIRBUS, LocalTime.parse("14:00"), DayOfWeek.TUESDAY),
                new Airline(Destination.MINSK, Plane.AIRBUS, LocalTime.parse("16:00"), DayOfWeek.SUNDAY),
                new Airline(Destination.MINSK, Plane.AIRBUS, LocalTime.parse("06:00"), DayOfWeek.WEDNESDAY),
                new Airline(Destination.KIEV, Plane.BOING737, LocalTime.parse("16:30"), DayOfWeek.TUESDAY),
                new Airline(Destination.LONDON, Plane.BOING737, LocalTime.parse("09:30"), DayOfWeek.TUESDAY),
        };
        airport.addAirline(planes);
        System.out.println(airport.getAirlineListFromDestination(Destination.MINSK));
        System.out.println(airport.getAirlineListFromDayOfWeek(DayOfWeek.TUESDAY));
        System.out.println(airport.getAirlineListFromDayOfWeekAndSortedTime(DayOfWeek.TUESDAY, LocalTime.parse("10:00")));
    }
}
