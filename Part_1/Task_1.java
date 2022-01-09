package my.home.task;

import java.util.Scanner;

public class Task_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("A =:");
		int a = input.nextInt();
		System.out.println("B =:");
		int b = input.nextInt();
		System.out.println("C =:");
		int c = input.nextInt();
		
		int z = 0;
		
		z = ((a - 3) * b / 2) + c;
		System.out.println("Z ="+z);
	}

}
