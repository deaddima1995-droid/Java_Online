package by.dmitry.course.classes.object.task5;

public class Main {

    public static void main(String[] args) {
        Counter counterFirst = new Counter();
        Counter counterSecond = new Counter(10, -10);

        counterFirst.printCurrentValue();
        counterFirst.incrementCounter();
        counterFirst.printCurrentValue();

        counterSecond.printCurrentValue();
        counterSecond.decrementCounter();
        counterSecond.printCurrentValue();
    }
}
