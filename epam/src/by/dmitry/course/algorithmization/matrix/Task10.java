package by.dmitry.course.algorithmization.matrix;

import java.util.Random;

public class Task10 {
    final static Random RND = new Random();

    public static void main(String[] args) {
        int[][] matrix = new int[6][5];

        for (int i = 0, x = i; i < matrix.length; i++, x++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = RND.nextInt(-10, 10);
                System.out.print("\t" + matrix[i][j]);
            }

            System.out.println();
        }

        for (int i = 0; i < matrix.length; i++) {
            if (i < matrix[i].length && matrix[i][i] > 0) {
                System.out.println(matrix[i][i]);
            }
        }
    }
}
