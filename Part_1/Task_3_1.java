package by.online.home.lesson;

import java.util.Scanner;

public class Task_3_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int summ = 0;
		int x = input.nextInt();
		while(x > 0) {
			summ += x;
			x--;
		}
		System.out.println("Summ = "+summ);
	}

}
