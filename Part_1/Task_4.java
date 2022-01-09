package by.online.part1.lesson;

public class Task_4 {

	public static void main(String[] args) {
		double r = 123.456;
		double firstPart = Math.floor(r);
		double secondPart = Math.floor((r - firstPart)*1000);
		
		double out = secondPart + (firstPart / 1000);
		System.out.println(out);
	}

}
