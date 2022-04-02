package by.dmitry.course.basics.cycles;

public class Task2 {
    public static void main(String[] args) {
        double numberA = 0;
        double numberB = 3;
        double step = 0.05d;

        for (double count = numberA; count < numberB; count += step) {
            double y = (count > 2) ? count : -count;
            System.out.printf("\t%.2f", y);
        }
    }
}
