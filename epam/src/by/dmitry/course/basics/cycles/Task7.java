package by.dmitry.course.basics.cycles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            int start = input.nextInt();
            int finish = input.nextInt();

            for (int count = start; count <= finish; count++) {
                System.out.println("\nNumber:" + count);
                if (count % 2 == 0 || count % 3 == 0) {
                    for (int number = 2; number < count; number++) {
                        if (count % number == 0) {
                            System.out.print("\t" + number);
                        }
                    }
                }
            }
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
    }
}
