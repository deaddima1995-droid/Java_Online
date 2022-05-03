package by.dmitry.course.classes.object.task6;

public class Main {

    public static void main(String[] args) {
        Time time = new Time(0, 0, 0);
        time.changeTime(-1, 59, 59);
        System.out.println(time);
        time.setTime(24, -1, 24);
        System.out.println(time);

    }
}
