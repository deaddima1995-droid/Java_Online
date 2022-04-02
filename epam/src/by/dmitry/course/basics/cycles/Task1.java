package by.dmitry.course.basics.cycles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int countCycles;
            int sum = 0;

            System.out.print("Write number:");
            while (!input.hasNextInt()) {
                System.out.println("Wrote error data");
                input.next();
            }
            countCycles = input.nextInt();
            for (int count = 1; count < countCycles; count++) {
                if (sum > (sum += count)) {
                    System.out.println("превышен максимальный размер переменной int");
                }
            }
            System.out.println("sum = " + sum);
        } catch (InputMismatchException e) {
            System.err.println("Error" + e);
        }
    }
}
