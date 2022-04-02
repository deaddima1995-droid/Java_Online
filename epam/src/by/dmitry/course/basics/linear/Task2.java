package by.dmitry.course.basics.linear;

public class Task2 {
    public static void main(String[] args) {
        double a = 1;
        double b = 2;
        double c = 3;
        double answer = ((b + Math.sqrt(b * b + 4 * a * c)) / (2 * a)) - Math.pow(a, 3) * c + Math.pow(b, -2);

        System.out.println(answer);
    }
}
