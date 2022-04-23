package by.dmitry.course.algorithmization.decomposition;

public class Task14 {
    static final int[][] rangeMatrix = generateMatrixDegreeNumbers(11);

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        printNumbersArmstrongFromRange(Integer.MAX_VALUE);
        long finish = System.currentTimeMillis() - start;
        System.out.printf("Время выполнения : %.2f сек", (double) finish / 1000);
    }

    public static int[][] generateMatrixDegreeNumbers(int degree) {
        int[][] out = new int[10][degree];
        for (int i = 0; i < out.length; i++) {
            for (int j = 0; j < out[i].length; j++) {
                out[i][j] = (int) Math.pow(i, j);
            }
        }
        return out;
    }

    public static void printNumbersArmstrongFromRange(int range) {
        for (int i = 1; i < range; i++) {
            if (isNumberOfArmstrong(i)) {
                System.out.println("\t" + i);
            }
        }
    }

    public static boolean isNumberOfArmstrong(int number) {
        int digit = Task10.getCountNumbers(number);
        long out = number;
        long sum = 0;
        while (number > 0) {
            int temp = number % 10;
            sum += rangeMatrix[temp][digit];
            number /= 10;
        }
        return sum == out;
    }
}
