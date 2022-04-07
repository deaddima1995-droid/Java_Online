package by.dmitry.course.algorithmization.matrix;

import java.util.Random;

public class Task8 {
    final static Random RND = new Random();

    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        int firstColumn = 1;
        int secondColumn = 3;
        int[] temp = new int[matrix.length];

        System.out.printf("We will change  %s column on %s \n", firstColumn, secondColumn);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = RND.nextInt(10);
                System.out.print("\t" + matrix[i][j]);
            }
            System.out.println();
            temp[i] = matrix[i][firstColumn];
        }

        System.out.println("Answer");
        for (int i = 0; i < temp.length; i++) {
            matrix[i][firstColumn] = matrix[i][secondColumn];
            matrix[i][secondColumn] = temp[i];
        }

        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print("\t" + anInt);
            }
            System.out.println();
        }

    }
}
