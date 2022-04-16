package by.dmitry.course.algorithmization.sorted;

import java.util.Random;

public class Task1 {
    final static Random RND = new Random();

    public static void main(String[] args) {
        int[] firstArray = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] secondArray = {10, 11, 12, 13, 14, 15, 16, 17, 18};
        int k = 9;
        int[] out = new int[firstArray.length + secondArray.length + 1];
        for (int i = 0; i < out.length; i++) {
            if (i < firstArray.length) {
                out[i] = firstArray[i];
            } else if (i >= firstArray.length + 1) {
                out[i] = secondArray[i - firstArray.length - 1];
            } else {
                out[i] = k;
            }
            System.out.print("\t" + out[i]);
        }
    }
}
