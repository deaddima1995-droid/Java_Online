package by.online.home.lesson;

public class Task_3_2 {

	public static void main(String[] args) {
		int a = 1;
		int b = 10;
		int h = 1;
		int out = 0;
		for (int i = a; i < b; i += h) {
			if (i > 2) {
				out = i;
			}
			else {
				out = i * -1;
			}
			System.out.print("\t"+out);
		}
		// y = x, x >  2
		//    -x, x <= 2
	}

}
