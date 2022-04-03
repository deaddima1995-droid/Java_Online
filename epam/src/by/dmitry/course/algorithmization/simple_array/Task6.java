package by.dmitry.course.algorithmization.simple_array;

import java.util.Random;

public class Task6 {
    final static Random RND = new Random();

    public static void main(String[] args) {
        double[] array = new double[17];
        double sum = 0;

        for (int counter = 0; counter < array.length; counter++) {
            array[counter] = RND.nextInt(5);
            System.out.print(array[counter] + " ");
        }
        if (array.length > 3) {
            sum += array[2] + array[3];
        }
        for (int counter = 5; counter < array.length; counter++) {
            if (counter % 2 != 0 && counter % 3 != 0) {
                sum += array[counter];
            }
        }
        System.out.println("\nAnswer = " + sum);
    }
}
