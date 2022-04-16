package by.dmitry.course.algorithmization.sorted;

import java.util.Random;

public class Task3 {
    final static Random RND = new Random();

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 10, 10, 11, 12, 13, 14, 15, 15, 17};
        int tempMax = Integer.MAX_VALUE;

        for (int i = 0; i < array.length - 1; i++) {
            int max = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[max]) {
                    max = j;
                }
                if (max != i) {
                    int temp = array[max];
                    array[max] = array[i];
                    array[i] = temp;
                }
            }
            System.out.print("\t" + array[i]);
        }
        System.out.print("\t" + array[array.length - 1]);
    }
}
