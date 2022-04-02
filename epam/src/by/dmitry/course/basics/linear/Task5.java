package by.dmitry.course.basics.linear;

import java.util.Random;

public class Task5 {
    final static Random RND = new Random();

    public static void main(String[] args) {
        int time = RND.nextInt(10000);
        int sec = time % 60;
        int minute = (time / 60) % 60;
        int hour = (time / 3600) % 60;

        System.out.printf("В %s секунд : Часов - %s, Минут - %s, Секунд - %s", time, hour, minute, sec);
    }
}
