package by.dmitry.course.algorithmization.matrix;

public class Task4 {

    public static void main(String[] args) {
        int n = 6;
        if (n % 2 != 0) {
            System.err.println("N не чётное");
            return;
        }
        int[][] matrix = new int[n][n];
        for (int line = 0; line < matrix.length; line++) {
            for (int column = 0; column < matrix[line].length; column++) {
                if (line % 2 == 0) {
                    matrix[line][column] = column + 1;
                } else {
                    matrix[line][column] = matrix[line].length - column;
                }
            }
        }

        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print("\t" + anInt);
            }
            System.out.println();
        }
    }
}
