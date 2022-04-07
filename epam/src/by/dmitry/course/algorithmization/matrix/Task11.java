package by.dmitry.course.algorithmization.matrix;

import java.util.Random;

public class Task11 {
    final static Random RND = new Random();

    public static void main(String[] args) {
        int[][] matrix = new int[10][20];
        for (int i = 0; i < matrix.length; i++) {
            int countFive = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = RND.nextInt(15);
                System.out.print("\t" + matrix[i][j]);
                countFive = (matrix[i][j] == 5) ? countFive + 1 : countFive;
            }
            if (countFive >= 3) {
                System.out.println("\tNumber 5 has " + countFive + " counts in  line");
            }
            System.out.println();
        }
    }
}
