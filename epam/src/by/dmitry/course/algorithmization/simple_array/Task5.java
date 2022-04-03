package by.dmitry.course.algorithmization.simple_array;

import java.util.Random;

public class Task5 {
    final static Random RND = new Random();

    public static void main(String[] args) {
        int[] array = new int[10];

        for (int counter = 0; counter < array.length; counter++) {
            array[counter] = RND.nextInt(10);
            if (array[counter] > counter) {
                System.out.print("\t" + array[counter]);
            }
        }
    }
}
