package by.dmitry.course.algorithmization.decomposition;

public class Task15 {

    public static void main(String[] args) {
        printAllNumbers(4);
    }

    public static boolean isNextNumber(int number) {
        int temp = number % 10;
        while (number > 0) {
            if (temp <= number / 10 % 10) {
                return false;
            }
            number /= 10;
            temp = number % 10;
        }
        return true;
    }

    public static void printAllNumbers(int range) {
        if (range > 9) {
            System.out.println("This range is bigger than 9");
            return;
        }
        for (int i = getStartRange(range); i <= getMaxRange(range); i++) {
            if (isNextNumber(i)) {
                System.out.print("\t" + i);
            }
        }
    }

    public static int getStartRange(int range) {
        int out = 0;
        for (int i = 0; i < range; i++) {
            out = out * 10 + i + 1;
        }
        return out;
    }

    public static int getMaxRange(int range) {
        int out = 0;
        for (int i = 0; i < range; i++) {
            out = out * 10 + i + (10 - range);
        }
        return out;
    }

}
