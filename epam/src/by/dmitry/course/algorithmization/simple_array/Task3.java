package by.dmitry.course.algorithmization.simple_array;

import java.util.Random;

public class Task3 {
    final static Random RND = new Random();

    public static void main(String[] args) {
        int n = 10;
        int positiveCounter = 0;
        int zeroCounter = 0;
        double[] array = new double[n];

        for (double num : array) {
            num = RND.nextInt(-10, 10);
            if (Math.abs(num) < 0.00001) {
                zeroCounter++;
            } else if (num > 0) {
                positiveCounter++;
            }
            System.out.print("\t"+num);
        }
        System.out.printf("\nPositive numbers %s, Negative numbers %s, Zero %s",positiveCounter,array.length - positiveCounter - zeroCounter, zeroCounter);
    }
}
