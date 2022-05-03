package by.dmitry.course.classes.object.task7;

public class Main {

    public static void main(String[] args) {
        Triangle triangle = Triangle.createTriangle(2, 5, 4);
        Triangle triangle2 = Triangle.createTriangle(3);
        Triangle triangle3 = Triangle.createTriangleFromTwoLineAndAngle(3, 4, 45);
        System.out.println(triangle);
        System.out.println(triangle2);
        System.out.println(triangle3);
    }
}
