package by.dmitry.course.algorithmization.simple_array;

import java.util.Random;

public class Task4 {
    final static Random RND = new Random();

    public static void main(String[] args) {
        double[] array = new double[10];
        double max = -Double.MAX_VALUE;
        double min = Double.MAX_VALUE;
        int indexMax = 0;
        int indexMin = 0;

        for (int counter = 0; counter < array.length; counter++) {
            array[counter] = RND.nextInt(-100, 100);
            if (max < array[counter]) {
                max = array[counter];
                indexMax = counter;
            }
            if (min > array[counter]) {
                min = array[counter];
                indexMin = counter;
            }
            System.out.print("\t" + array[counter]);
        }

        System.out.printf("\nMax in array %s [index = %s], Min in array %s [index = %s]\n", max, indexMax, min, indexMin);
        array[indexMax] = min;
        array[indexMin] = max;

        for (double num : array) {
            System.out.print("\t" + num);
        }
    }
}
