package by.dmitry.course.basics.branching;

import java.util.Random;

public class Task2 {
    final static Random RND = new Random();

    public static void main(String[] args) {
        int a = RND.nextInt(100);
        int b = RND.nextInt(100);
        int c = RND.nextInt(100);
        int d = RND.nextInt(100);
        System.out.printf("a = %s, b = %s, c = %s, d = %s", a, b, c, d);
        System.out.println("\nAnswer is :" + Math.max(Math.min(a, b), Math.min(c, d)));
    }
}
