package by.online.part1.lesson;

import java.util.Scanner;

public class Task_6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Write x:");
		int x = input.nextInt();
		System.out.println("Write y:");
		int y = input.nextInt();
		if (x <= 2 & x >= -2) {
			if (y <= 4 & y >= -3) {
				System.out.println("true");
				return;
			}
		}
		if (x <= 4 & x >= -4) {
			if (y <= 0 & y >= -3) {
				System.out.println("true");
				return;
			}
		}
		System.out.println("false");
	}

}
