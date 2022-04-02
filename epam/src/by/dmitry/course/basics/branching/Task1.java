package by.dmitry.course.basics.branching;

import java.util.Random;

public class Task1 {
    final static Random RND = new Random();

    public static void main(String[] args) {
        int firstAngle = RND.nextInt(180);
        int secondAngle = RND.nextInt(180);
        String out = "First Angle:"+firstAngle+"\tSecond Angle:"+secondAngle+"\t";

        if (firstAngle + secondAngle < 180) {
            out = out.concat("Треугольник существует");
            if (firstAngle == 90 || secondAngle == 90 || 180 - firstAngle + secondAngle == 90) {
                out = out.concat("\tТреугольник прямоугольный");
            }
        }
        else {
            out = out.concat("Треугольник не существует");
        }

        System.out.println(out);
    }
}
