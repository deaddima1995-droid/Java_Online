package by.dmitry.course.algorithmization.decomposition;

public class Task7 {

    public static void main(String[] args) {
        System.out.println("Sum of factorial !9 from odd numbers - " + getSumOfFactorial(9));
    }

    public static int getFactorial(int number) {
        if (number == 0) {
            return 1;
        }
        return number * getFactorial(number - 1);
    }

    public static int getSumOfFactorial(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 2 != 0) {
                sum += getFactorial(i);
            }
        }
        return sum;
    }
}
