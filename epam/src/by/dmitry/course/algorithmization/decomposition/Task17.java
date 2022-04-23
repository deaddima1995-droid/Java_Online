package by.dmitry.course.algorithmization.decomposition;

public class Task17 {

    public static void main(String[] args) {
        int num = 123;
        System.out.println("\nCounts is - " + decrementSumNumber(num));
    }

    public static int decrementSumNumber(int number) {
        int count = 0;
        while (number > 0) {
            System.out.print("\t" + number);
            number -= getSumOfNumber(number);
            count++;
        }
        return count;
    }

    public static int getSumOfNumber(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
