package by.dmitry.course.algorithmization.matrix;

public class Task6 {

    public static void main(String[] args) {
        int n = 6;

        if (n % 2 != 0) {
            System.err.println("N не чётное");
            return;
        }

        int[][] matrix = new int[n][n];

        for (int i = 0, l = n; i <= n / 2; i++, l--) {
            for (int j = i; j < l; j++) {
                matrix[i][j] = 1;
                matrix[(n - 1) - i][j] = 1;
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
