package by.dmitry.course.algorithmization.matrix;

import java.util.Random;

public class Task2 {
    final static Random RND = new Random();

    public static void main(String[] args) {
        int[][] matrix = new int[10][10];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = RND.nextInt(15);
                System.out.print("\t" + matrix[i][j]);
            }
            System.out.println();
        }

        System.out.println();

        int line = 0;
        for (int[] ints : matrix) {
            System.out.print("\t" + ints[line]);
            line++;
        }
    }
}
