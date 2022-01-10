package by.online.home.lesson;

public class Task_2_3 {

	public static void main(String[] args) {
		double x1 = -1,
			   x2 = -1,
			   x3 = -1,
			   y1 = 1,
			   y2 = 2,
			   y3 = 3;
		if ((x3 * (y2 - y1) - y3 * (x2 - x1)) == (x1 * y2 - x2 * y1)) {
			System.out.println("Точки лежат на одной прямой");
		}
		else {
			System.out.println("Точки лежат не на одной прямой");
		}
	}
	

}
