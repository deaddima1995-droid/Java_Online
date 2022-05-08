package by.dmitry.course.classes.compose.task2;

import java.util.Random;

public class Car {
    private static final Random RND = new Random();
    private final String brand;
    private Wheel wheels;
    private final Engine engine;
    private double fuel;

    public Car(String brand, Wheel wheels, Engine engine) {
        this.brand = brand;
        this.wheels = wheels;
        this.engine = engine;
        this.fuel = 100;
    }

    public void drive() {
        double length = RND.nextInt((int) (fuel * engine.value));
        fuel -= length;
        System.out.printf("Машина %s потратила %.1f топлива, остаток - %.1f\n", brand, length, fuel);
    }

    public void refuel() {
        double temp = 100 - fuel;
        if (fuel != 100) {
            fuel += temp;
            System.out.printf("Машину %s заправили на %.1f литр(-ов\n", brand, temp);
        } else {
            System.out.println("Машину не нужно заправлять");
        }
    }

    public void changeWheels(Wheel wheel) {
        this.wheels = wheel;
    }

    public void printCarBrand() {
        System.out.println("Brand car is " + brand);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", wheels=" + wheels +
                ", engine=" + engine +
                ", fuel=" + fuel +
                '}';
    }
}
