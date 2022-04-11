package by.dmitry.course.algorithmization.matrix;


import java.util.Scanner;

public class Task16 {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Write matrix length - ");
            int number = input.nextInt();
            int magicConst = (number * (number * number + 1)) / 2;
            int[][] matrix = new int[number][number];
            System.out.println("Magic const " + magicConst);
            if (number <= 2) {
                System.out.println("Magic square impossible");
                return;
            } else if (number % 2 == 0 && number % 4 != 0) {
                makeMagicSquareEven(matrix);
            } else if (number % 4 == 0) {
                makeMagicSquareEvenFour(matrix);
            } else {
                makeMagicSquareNotEven(matrix);
            }
            printMatrix(matrix);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    public static void makeMagicSquareEven(int[][] matrix) {
        int constant = matrix.length / 2;
        int change = getChangeTable(matrix.length);
        int[][] index = getArrayIndex(constant);
        // Заполняем как нечётные квадраты
        for (int count = 0; count < index[0].length; count++) {
            matrix[index[0][count]][index[1][count]] = count + 1;
            matrix[index[0][count]][index[1][count] + constant] = count + 1 + (constant * constant) * 2;
            matrix[index[0][count] + constant][index[1][count]] = count + 1 + (constant * constant) * 3;
            matrix[index[0][count] + constant][index[1][count] + constant] = count + 1 + constant * constant;
        }
        // Меняем местами определенные ячейки
        for (int counter = 0; counter <= change; counter++) {
            for (int j = 0; j < matrix.length / 2; j++) {
                if (counter == 0 && j == matrix.length / 4) {
                    int temp = matrix[j][counter + 1 + change];
                    matrix[j][counter + 1 + change] = matrix[j + constant][counter + 1 + change];
                    matrix[j + constant][counter + 1 + change] = temp;
                    continue;
                }
                int temp = matrix[j][counter];
                matrix[j][counter] = matrix[j + constant][counter];
                matrix[j + constant][counter] = temp;
            }
        }
        // Меняем местами последние столбцы, если нужно
        if (change != 0) {
            for (int i = 1; i <= change; i++) {
                for (int j = 0; j < matrix.length / 2; j++) {
                    int temp = matrix[j][matrix.length - i];
                    matrix[j][matrix.length - i] = matrix[j + constant][matrix.length - i];
                    matrix[j + constant][matrix.length - i] = temp;
                }
            }
        }
    }

    public static void makeMagicSquareEvenFour(int[][] matrix) {
        boolean[][] flag = getFlag(matrix);
        int tempConst = matrix.length * matrix.length + 1;
        int counter = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (flag[i][j]) {
                    matrix[i][j] = counter;
                } else {
                    matrix[i][j] = tempConst - counter;
                }
                counter++;
            }
        }
    }

    public static void makeMagicSquareNotEven(int[][] matrix) {
        int[][] index = getArrayIndex(matrix.length);
        for (int count = 0; count < matrix.length * matrix.length; count++) {
            matrix[index[0][count]][index[1][count]] = count + 1;
        }
    }

    public static int[][] getArrayIndex(int index) {
        int[][] array = new int[index][index];
        int[][] out = new int[2][index * index];
        int line = 0;
        int column = index / 2;

        if (index % 2 != 0) {
            for (int count = 0; count < index * index; count++) {
                array[line][column] = count + 1;
                out[0][count] = line;
                out[1][count] = column;
                int tempLine = line - 1;
                int tempColumn = column + 1;
                tempLine = (tempLine < 0) ? index - 1 : tempLine;
                tempColumn = (tempColumn >= index) ? 0 : tempColumn;
                if (array[tempLine][tempColumn] == 0) {
                    line = tempLine;
                    column = tempColumn;
                } else {
                    line = (line + 1 >= index) ? 0 : line + 1;
                }
            }
        }
        return out;
    }

    public static int getChangeTable(int number) {
        int out = 0;
        for (int i = 6; i < number; i += 4) {
            out++;
        }
        return out;
    }

    public static boolean[][] getFlag(int[][] matrix) {
        boolean[][] out = new boolean[matrix.length][matrix.length];
        int y = matrix.length / 4;

        for (int i = 0; i < out.length; i++) {
            for (int j = 0; j < out[i].length; j++) {
                if (i < y || i >= matrix.length - y) {
                    if (j >= y && j < matrix.length - y) {
                        out[i][j] = true;
                    }
                } else {
                    if (j < y || j >= matrix.length - y) {
                        out[i][j] = true;
                    }
                }
            }
        }
        return out;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print("\t" + anInt);
            }
            System.out.println();
        }
    }
}
