package by.dmitry.course.basics.branching;

public class Task5 {

    public static void main(String[] args) {
        double x = 3;
        if (x <= 3) {
            x = x * x - 3 * x + 9;
        } else {
            x = 1 / (Math.pow(x, 3) + 6);
        }
        System.out.println("x = " + x);
    }
}
