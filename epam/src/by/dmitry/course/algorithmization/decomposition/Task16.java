package by.dmitry.course.algorithmization.decomposition;

public class Task16 {

    public static void main(String[] args) {
        System.out.println(isHasEvenNumber(131));
    }

    public static boolean isHasEvenNumber(int number) {
        int temp = number % 10;
        while (number > 0) {
            if (temp % 2 == 0) {
                return true;
            }
            number /= 10;
            temp = number % 10;
        }
        return false;
    }

    public static int getStartRange(int range) {
        int out = 0;
        for (int i = 0; i < range; i++) {

        }
        return out
                ;
    }
}
