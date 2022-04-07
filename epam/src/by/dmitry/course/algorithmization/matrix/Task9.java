package by.dmitry.course.algorithmization.matrix;

import java.util.Random;

public class Task9 {
    final static Random RND = new Random();

    public static void main(String[] args) {
        int[][] matrix = new int[4][6];
        int[] counter = new int[matrix[0].length];
        int maxColumn = 0;
        int temp = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = RND.nextInt(10);
                counter[j] += matrix[i][j];
                temp = Math.max(temp, counter[j]);
                if (i == matrix.length - 1 && temp == counter[j]) {
                    maxColumn = j;
                }
                System.out.print("\t" + matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println("Max column is " + ++maxColumn);
    }
}
