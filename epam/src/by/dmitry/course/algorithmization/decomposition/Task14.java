package by.dmitry.course.algorithmization.decomposition;

public class Task14 {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        printNumbersArmstrongFromRange(100000000);
        long finish = System.currentTimeMillis() - start;
        System.out.printf("Время выполнения : %.2f сек", (double)finish / 1000);
    }

    public static int[][] generateMatrixDegreeNumbers(int range) {
        int[][] out = new int[10][Task10.getCountNumbers(range)];
        for (int i = 0; i < out.length; i++) {
            for (int j = 0; j < out[i].length; j++) {
                out[i][j] = (int) Math.pow(i, j);
            }
        }
        return out;
    }

    public static void printNumbersArmstrongFromRange(int range) {
        int[][] digits = generateMatrixDegreeNumbers(range);
        for (int i = 1; i < range; i++) {
            if (isNumberOfArmstrong(i, digits)) {
                System.out.println("\t" + i);
            }
        }
    }
    // 153 генерируем простое число например 135 считаем 1^3 + 3^3 + 5^3 и сравниваем с остальными такими же числами 135 153 315 351 513 531
    // 1634 = 1346 1364 1436 1463 16

    public static boolean isNumberOfArmstrong(int number, int[][] digits) {
        int digit = Task10.getCountNumbers(number);
        int out = number;
        int sum = 0;
        while (number > 0) {
            int temp = number % 10;
            //sum += Math.pow(temp, digit);
            sum += digits[temp][digit];
            number /= 10;
        }
        return sum == out;
    }
}
