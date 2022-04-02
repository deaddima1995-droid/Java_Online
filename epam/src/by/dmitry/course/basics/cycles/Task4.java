package by.dmitry.course.basics.cycles;

public class Task4 {

    public static void main(String[] args) {
        long sum = 1;
        for (int i = 1; i <= 200; i++) {
            if (sum > (sum *= i * i)) {
                System.err.println("превышен максимальный размер переменной long");
                return;
            }
        }
        System.out.println("Sum = "+sum);
    }
}
