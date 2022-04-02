package by.dmitry.course.basics.cycles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String text = "";
            while (!text.equals("stop")) {
                text = input.next();
                char[] charArray = text.toCharArray();
                for (char c : charArray) {
                    System.out.println(c + ":" + (int) c);
                }
            }
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
    }
}
