package by.dmitry.course.algorithmization.matrix;

import java.util.Random;

public class Task1 {
    final static Random RND = new Random();

    public static void main(String[] args) {
        int[][] matrix = new int[5][5];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = RND.nextInt(15);
                System.out.print("\t" + matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println("Answer:");
        for (int count = 0; count < matrix.length; count++) {
            if (matrix[0][count] > matrix[matrix.length - 1][count]) {
                System.out.println("Столбец №" + (count + 1));
                for (int[] ints : matrix) {
                    System.out.print("\t" + ints[count]);
                }
                System.out.println();
            }
        }
    }
}
