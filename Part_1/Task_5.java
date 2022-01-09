package by.online.part1.lesson;

import java.util.Scanner;

public class Task_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Write time:");
		int time = input.nextInt();
		int tmp = time;
		int second = time % 60;
		time /= 60; 
		int minute = time % 60;
		time /= 60;
		int hour =	 time % 60;
		
		System.out.println("In "+tmp+"\thour:"+hour+"\tminutes:"+minute+"\tseconds:"+second);
	}

}
