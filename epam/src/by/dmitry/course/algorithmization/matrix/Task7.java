package by.dmitry.course.algorithmization.matrix;

public class Task7 {

    public static void main(String[] args) {
        int number = 5;
        int counterPositiveCell = 0;
        double[][] matrix = new double[number][number];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Math.sin(((double) (i * i - j - j)) / number);
                if (matrix[i][j] > 0) {
                    counterPositiveCell++;
                }
                System.out.printf("\t%.2f", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println("Count positive numbers - " + counterPositiveCell);
    }
}
