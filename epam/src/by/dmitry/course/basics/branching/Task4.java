package by.dmitry.course.basics.branching;

import java.util.Random;

public class Task4 {
    final static Random RND = new Random();

    public static void main(String[] args) {
        int length = RND.nextInt(1, 10);
        int width = RND.nextInt(1, 10);
        int height = RND.nextInt(1, 10);
        int holeX = RND.nextInt(1, 10);
        int holeY = RND.nextInt(1, 10);
        String answer = "";

        if (holeX >= length && (holeY >= width || holeY >= height)) {
            answer = answer.concat("пройдет");
        } else if (holeX >= width && (holeY >= length || holeY >= height)) {
            answer = answer.concat("пройдет");
        } else if (holeX >= height && (holeY >= length || holeY >= width)) {
            answer = answer.concat("пройдет");
        } else {
            answer = answer.concat("не пройдет");
        }

        System.out.printf("Кирпич с размером %s, %s, %s  %s в отверстие %s x %s", length, width, height, answer, holeX, holeY);
    }
}
