package by.dmitry.course.basics.linear;

import java.util.Random;

public class Task6 {
    final static Random RND = new Random();

    public static void main(String[] args) {
        int x = RND.nextInt(-10, 10);
        int y = RND.nextInt(-5, 10);
        boolean answer;
        answer = ((x >= -4 && x <= 4) && (y <= 0 && y >= -3)) || ((x >= -2 && x <= 2) && (y <= 4 && y >= -3));
        System.out.println(answer);
    }
}
