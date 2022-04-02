package by.dmitry.course.basics.cycles;

public class Task5 {

    public static void main(String[] args) {
        int n = 1;
        double a;
        double e = 0.01;
        double sum = 0;

        do {
            a = (1 / Math.pow(2, n)) + (1 / Math.pow(3, n));
            sum += a;
            n++;
        } while (Math.abs(a) >= e);

        System.out.println(sum);
    }
}
