package by.dmitry.course.algorithmization.simple_array;

import java.util.Random;

public class Task1 {
    final static Random RND = new Random();

    public static void main(String[] args) {
        int[] array = new int[20];
        int k = 3;
        int sum = 0;

        for (int count = 0; count < array.length; count++) {
            array[count] = RND.nextInt(20);
            if (array[count] % k == 0) {
                sum += array[count];
            }
        }
        System.out.println(sum);
    }
}
