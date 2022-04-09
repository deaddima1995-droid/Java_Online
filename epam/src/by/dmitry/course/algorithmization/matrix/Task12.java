package by.dmitry.course.algorithmization.matrix;

import java.util.Random;

public class Task12 {
    final static Random RND = new Random();
    static int[][] matrix = new int[5][5];

    public static void main(String[] args) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = RND.nextInt(10);
                System.out.print("\t" + matrix[i][j]);
            }
            System.out.println();
        }
        sortUpMatrix();
        printMatrix();
        sortDownMatrix();
        printMatrix();
    }

    public static void printMatrix() {
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print("\t" + anInt);
            }
            System.out.println();
        }
    }

    public static void sortUpMatrix() {
        System.out.println("sort the numbers in ascending order");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length - 1; j++) {
                if (matrix[i][j] > matrix[i][j + 1]) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[i][j + 1];
                    matrix[i][j + 1] = temp;
                    j = -1;
                }
            }
        }
    }

    private static void sortDownMatrix() {
        System.out.println("sort numbers in descending order");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length - 1; j++) {
                if (matrix[i][j] < matrix[i][j + 1]) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[i][j + 1];
                    matrix[i][j + 1] = temp;
                    j = -1;
                }
            }
        }
    }
}
