package by.online.home.lesson;

import java.util.Scanner;

public class Task_2_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String outTrue = "Треугольник существует";
		String outFalse = "Треугольник не существует";
		System.out.println("Write first angle:");
		int angleFirst = input.nextInt();
		System.out.println("Write secondd angle:");
		int angleSecond = input.nextInt();
		
		if (angleFirst <= 0 || angleSecond <= 0) {
			System.out.println(outFalse);
			return;
		}
		else {
			if (180 - angleFirst + angleSecond >= 1) {
			System.out.println(outTrue);
			}
		}
	}

}
