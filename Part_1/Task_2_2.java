package by.online.home.lesson;
// Найти max{ min(a,b) , min(c,d) };
public class Task_2_2 {

	public static void main(String[] args) {
		int a = 1;
		int b = 3;
		int c = 2;
		int d = 1;
		
		int out = searchMax(searchMin(a,b),searchMin(c,d));
		System.out.println("Max = "+out);
	}
	public static int searchMin(int a,int b) {
		
		if (a < b) {
			return a;
		}
		else return b;
	}
	public static int searchMax(int a,int b) {
		
		if (a > b) {
			return a;
		}
		else return b;
	}

}
