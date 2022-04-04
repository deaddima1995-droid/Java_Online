package by.dmitry.course.algorithmization.matrix;

import java.util.Random;

public class Task3 {

    final static Random RND = new Random();

    public static void main(String[] args) {
        int[][] matrix = new int[5][6];
        int kLine = 2;
        int pColumn = 4;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = RND.nextInt(15);
                System.out.print("\t" + matrix[i][j]);
            }
            System.out.println();
        }
        System.out.printf("Line №%s :", kLine);
        for (int i = 0; i < matrix[kLine].length; i++) {
            System.out.print("\t" + matrix[kLine][i]);
        }
        System.out.printf("\nColumn №%s :", pColumn);
        for (int[] ints : matrix) {
            System.out.print("\t" + ints[pColumn]);
        }
    }
}
