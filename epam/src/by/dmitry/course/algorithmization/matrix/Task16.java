package by.dmitry.course.algorithmization.matrix;


public class Task16 {
    static int number = 3;
    static int magicConst = (number * (number * number + 1)) / 2;
    static int[][] matrix = new int[number][number];

    public static void main(String[] args) {
        makeMagicBoxNotEven();
        printMatrix();
    }

    public static void makeMagicBoxNotEven() {
        int line = 0;
        int column = number / 2;
        for (int count = 0; count < number * number; count++) {
            matrix[line][column] = count + 1;
            int tempLine = line - 1;
            int tempColumn = column + 1;

            tempLine = (tempLine < 0) ? number - 1 : tempLine;
            tempLine = (tempLine >= number) ? 0 : tempLine;
            tempColumn = (tempColumn >= number) ? 0 : tempColumn;

            if (matrix[tempLine][tempColumn] == 0) {
                line = tempLine;
                column = tempColumn;
            } else {
                line = (line + 1 >= number) ? 0 : line + 1;
            }
        }
    }

    public static void printMatrix() {
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print("\t" + anInt);
            }
            System.out.println();
        }
    }
}
