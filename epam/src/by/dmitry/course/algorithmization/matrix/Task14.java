package by.dmitry.course.algorithmization.matrix;

import java.util.Random;

public class Task14 {
    final static Random RND = new Random();

    public static void main(String[] args) {
        int[][] matrix = new int[RND.nextInt(1,10)][RND.nextInt(1,10)];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i < j) {
                    matrix[i][j] = 1;
                }
                System.out.print("\t" + matrix[i][j]);
            }
            System.out.println();
        }
    }
}
