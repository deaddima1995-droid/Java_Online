package by.online.home.lesson;

import java.util.Scanner;

public class Task_2_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Write first angle:");
		int angleFirst = input.nextInt();
		System.out.println("Write second angle:");
		int angleSecond = input.nextInt();
		
		if ((angleFirst <= 0 || angleSecond <= 0) | ((angleFirst + angleSecond) >= 180)) {
			System.out.println("Треугольник не существует");
			return;
		}
		if (angleFirst == 90 || angleSecond == 90) {
		System.out.println("Треугольник существует, он прямоугольный");
			}
		else {
			System.out.println("Треугольник существует");
		}
	}

}
