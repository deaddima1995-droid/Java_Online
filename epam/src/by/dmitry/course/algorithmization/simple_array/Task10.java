package by.dmitry.course.algorithmization.simple_array;

import java.util.Random;

public class Task10 {
    final static Random RND = new Random();

    public static void main(String[] args) {
        int[] array = new int[20];

        for (int count = 0; count < array.length; count++) {
            array[count] = RND.nextInt(1,10);
            if (count % 2 != 0) {
                array[count] = 0;
            }
            System.out.print("\t" + array[count]);
        }


    }
}
