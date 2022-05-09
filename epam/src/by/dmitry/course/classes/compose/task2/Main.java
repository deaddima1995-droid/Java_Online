package by.dmitry.course.classes.compose.task2;

public class Main {

    public static void main(String[] args) {
        Car audi = new Car("Audi", Wheel.R16, Engine.DIESEL);
        Car bmw = new Car("BMW", Wheel.R20, Engine.PETROL);

        System.out.println(audi);
        System.out.println(bmw);
        audi.drive();
        bmw.drive();
        audi.refuel();
        bmw.changeWheels(Wheel.R16);
        System.out.println(bmw);
    }
}
