package by.dmitry.course.classes.object.task5;

import java.util.Random;

public class Counter {
    private final static Random RND = new Random();
    private double counter;
    private final double rangeMax;
    private final double rangeMin;

    public Counter() {
        this.rangeMax = RND.nextDouble(10);
        this.rangeMin = RND.nextDouble(-10, 0);
        this.counter = Double.sum(rangeMax, rangeMin) / 2;
    }

    public Counter(double rangeMax, double rangeMin) {
        this.rangeMax = rangeMax;
        this.rangeMin = rangeMin;
        this.counter = Double.sum(rangeMax, rangeMin) / 2;
    }

    public void printCurrentValue() {
        System.out.printf("Current value is %.2f\n", counter);
    }

    public double getCounter() {
        return counter;
    }

    private boolean isInRange(double counter) {
        return counter < this.rangeMax - 0.1 && counter > this.rangeMin + 0.1;
    }

    public void incrementCounter() {
        if (isInRange(counter)) {
            this.counter += 0.1;
        }
    }

    public void decrementCounter() {
        if (isInRange(counter)) {
            this.counter -= 0.1;
        }
    }

}
