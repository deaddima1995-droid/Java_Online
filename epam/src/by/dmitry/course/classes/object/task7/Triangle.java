package by.dmitry.course.classes.object.task7;

import java.security.InvalidParameterException;

public class Triangle {
    private final double lineA;
    private final double lineB;
    private final double lineC;

    private Triangle(double lineA, double lineB, double lineC) {
        this.lineA = lineA;
        this.lineB = lineB;
        this.lineC = lineC;
        if (!isPossibleTriangle()) {
            System.err.print("Invalid parameters");
            throw new InvalidParameterException();
        }
    }

    public static Triangle createTriangle(double lineA, double lineB, double lineC) {
        return new Triangle(lineA, lineB, lineC);
    }

    public static Triangle createTriangle(double line) {
        return new Triangle(line, line, line);
    }

    public static Triangle createTriangleFromTwoLineAndAngle(double lineA, double lineB, double angle) {
        double lineC = Math.sqrt(lineA * lineA + lineB * lineB - 2 * lineA * lineB * Math.cos(angle));
        return new Triangle(lineA, lineB, lineC);
    }

    private boolean isPossibleTriangle() {
        return lineA + lineB > lineC &&
                lineA + lineC > lineB &&
                lineB + lineC > lineA &&
                lineA > 0 &&
                lineB > 0 &&
                lineC > 0;
    }

    public double getPerimeter() {
        return lineA + lineB + lineC;
    }

    public double getArea() {
        return 1d / 4 * Math.sqrt((lineA + lineB + lineC) * (lineB + lineC - lineA) * (lineA + lineC - lineB) * (lineA + lineB - lineC));
    }

    public double getPointIntersectionOfMedians() {
        return (Math.sqrt(2 * lineC * lineC + 2 * lineB * lineB - lineA * lineA) / 2) / 1.5;
    }

    @Override
    public String toString() {
        return String.format("""
                Triangle:\s
                \tlineA %.2f, lineB %.2f, lineC %.2f\s
                \tperimeter - %.2f
                \tarea - %.2f
                \tpoint intersection of medians - %.2f""", lineA, lineB, lineC, getPerimeter(), getArea(), getPointIntersectionOfMedians());
    }
}
