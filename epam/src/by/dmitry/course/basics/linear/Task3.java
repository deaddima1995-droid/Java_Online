package by.dmitry.course.basics.linear;

import java.lang.Math;

public class Task3 {
    public static void main(String[] args) {
        double x = 3;
        double y = 5;
        double answer = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
        System.out.println(answer);
    }
}
