package by.online.home.lesson;

public class Task_3_4 {

	public static void main(String[] args) {
		int x = Integer.MAX_VALUE;
		int sum = 1;
		int tmp = sum;
		for (int i = 1; i <= 200 ; i++) {
			sum *= i * i;
			
			if (tmp > sum) {
				System.out.println("Превышен максимальный размер переменной типа int");
				System.out.println(sum);
				return;
			}
			tmp = sum;
			System.out.print(sum+"\t");
		}
	}

}
