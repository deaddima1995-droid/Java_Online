package by.dmitry.course.algorithmization.matrix;

import java.util.Random;

public class Task15 {
    final static Random RND = new Random();

    public static void main(String[] args) {
        int[][] matrix = new int[5][8];
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = RND.nextInt(15);
                max = Math.max(matrix[i][j],max);
                System.out.print("\t" + matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println("max is " + max);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 != 0) {
                    matrix[i][j] = max;
                }
                System.out.print("\t" + matrix[i][j]);
            }
            System.out.println();
        }
    }
}
