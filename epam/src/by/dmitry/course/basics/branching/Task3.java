package by.dmitry.course.basics.branching;


public class Task3 {

    public static void main(String[] args) {
        double x1 = 1;
        double y1 = 1;
        double x2 = 2;
        double y2 = 2;
        double x3 = 3;
        double y3 = 3;
        double k = (y1 - y2) / (x1 - x2);
        double b = y1 - k * x1;

        System.out.printf("A(%.2f: %.2f), B(%.2f: %.2f), C(%.2f: %.2f)\n", x1, y1, x2, y2, x3, y3);

        if (isEqual(y3, k * x3 + b)) {
            System.out.println("Точки лежат на одной прямой");
        } else {
            System.out.println("Точки не лежат на одной прямой");
        }
    }

    public static boolean isEqual(double x, double y) {
        return Math.abs(x - y) < 0.001;
    }
}
