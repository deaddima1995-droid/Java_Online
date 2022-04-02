package by.dmitry.course.algorithmization.simple_array;

import java.util.Random;

public class Task2 {
    final static Random RND = new Random();

    public static void main(String[] args) {
        double[] array = new double[25];
        int z = 5;
        int counter = 0;
        for (int number = 0; number < array.length; number++) {
            array[number] = RND.nextInt(10);
            System.out.print("\t" + array[number]);
            if (array[number] > z) {
                array[number] = z;
                counter++;
            }
        }
        System.out.println("\nКоличество замен - " + counter);
        for (double num : array) {
            System.out.print("\t" + num);
        }
    }
}
