package by.dmitry.course.algorithmization.decomposition;

import java.util.Random;

public class Task4 {

    public static void main(String[] args) {
        Point[] points = new Point[10];
        double maxDistance = Integer.MIN_VALUE;

        for (int i = 0; i < points.length - 1; i++) {
            points[i] = new Point();
            if (i != 0) {
                maxDistance = Math.max(maxDistance, points[i].searchTheLongestDistanceBetweenPoints(points[i - 1]));
            }
            System.out.println("\t" + points[i]);
        }
        System.out.printf("\nThe max distance between points is - %.2f", maxDistance);
    }
}

class Point {
    static final Random RND = new Random();
    private final int x;
    private final int y;

    Point() {
        x = RND.nextInt(-20, 20);
        y = RND.nextInt(-20, 20);
    }

    public double searchTheLongestDistanceBetweenPoints(Point point) {
        return Math.sqrt(Math.pow(point.x - this.x, 2) + Math.pow(point.y - this.y, 2));
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
