package by.dmitry.course.algorithmization.matrix;

public class Task5 {

    public static void main(String[] args) {
        int n = 6;

        if (n % 2 != 0) {
            System.err.println("N не чётное");
            return;
        }

        int[][] matrix = new int[n][n];
        for (int count = 0, y = n; count < n; count++, y--) {
            for (int i = 0; i < matrix[count].length; i++) {
                if (i < y) {
                    matrix[count][i] = count + 1;
                } else {
                    matrix[count][i] = 0;
                }
                System.out.print("\t" + matrix[count][i]);
            }
            System.out.println();
        }
    }
}
