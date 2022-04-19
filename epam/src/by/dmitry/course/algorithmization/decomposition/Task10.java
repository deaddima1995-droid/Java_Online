package by.dmitry.course.algorithmization.decomposition;

import java.util.Random;

public class Task10 {
    static final Random RND = new Random();

    public static void main(String[] args) {
        int[] array = new int[10];
        int number = 365;
        for (int i = 0; i < array.length; i++) {
            array[i] = getNumberFromNumber(number);
            System.out.print("\t" + array[i]);
        }
    }

    public static int getNumberFromNumber(int number) {
        int[] numbers = getArrayFromNumber(number);
        int counterOfNumbers = RND.nextInt(1, 5);
        int out = 0;
        for (int i = 0; i < counterOfNumbers; i++) {
            if (out != 0) {
                out *= 10;
            }
            out += numbers[RND.nextInt(numbers.length)];
        }
        return out;
    }

    public static int[] getArrayFromNumber(int number) {
        int[] out = new int[getCountNumbers(number)];
        for (int i = 0; i < out.length; i++) {
            out[i] = number % 10;
            number /= 10;
        }
        return out;
    }

    public static int getCountNumbers(int number) {
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }
}
